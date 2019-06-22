package c99_web.servlet;

import c99_web.dao.DAOImpl;
import c99_web.model.Category;
import c99_web.model.Product;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TiramiAsu
 */
@WebServlet("/servlet/controller/*")
public class ControllerServlet extends HttpServlet{
    
    private DAOImpl dao = new DAOImpl();
    
    @Override
    public void init() throws ServletException {
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        PrintWriter out = resp.getWriter();
//        Map<String,String[]> list = req.getParameterMap();
        req.setCharacterEncoding("UTF-8");

        String pdCode =      req.getParameter("code");
        String pdName =      req.getParameter("name");
        Integer pdPrice = Integer.parseInt(req.getParameter("price"));
        Integer pdCost =  Integer.parseInt(req.getParameter("cost"));
        String pdUnit =      req.getParameter("unit");
        String pdStatus =   req.getParameter("status").equals("1")?"Y":"N";
            String[] cg = req.getParameter("category").split("=");
        String pdCategory =   cg[1];
        String pdRemark =    req.getParameter("remark");        

        Product products = new Product(pdName, pdPrice, pdCost, pdUnit, pdStatus, pdRemark);
//        out.print(products);
        products.setCategory(new Category(Integer.parseInt(cg[0]), pdCategory));
        dao.create(products);
        resp.sendRedirect("/Jprofile/c99_web/test_jndi_queryall.jsp");
    }
    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        
        /* test connection database info
        Configuration cfg = new Configuration().configure();
        out.println(cfg.configure().getProperty("hibernate.connection.datasource"));
        out.println(cfg.configure().getProperty("hibernate.dialect"));
        out.println(cfg.configure().getProperty("current_session_context_class"));
        out.println(cfg.configure().getProperty("cache.provider_class"));
        out.println(cfg.configure().getProperty("show_sql"));
         */
        int id = -1;
        try{
            id =Integer.parseInt(req.getParameter("selectid"));
            req.setAttribute("id", id);
            req.getRequestDispatcher("/c99_web/test_jndi_query.jsp").forward(req, resp);
            
        }catch (Exception e){
            req.getRequestDispatcher("/c99_web/test_jndi_queryall.jsp").forward(req, resp);
        }        
//        System.out.println(id);
//        out.print(new Gson().toJson(dao.queryAll(Product.class)));
    }
    
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        
        int id = Integer.parseInt(req.getPathInfo().split("/")[1]);
        
        dao.delete(Product.class,id);
        resp.sendRedirect("/Jprofile/c99_web/test_jndi_queryall.jsp");
    }

    
    
    
    
}
