package casei.servlet;

import casei.dao.UserDAO;
import com.google.gson.Gson;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author TiramiAsu
 */
@WebServlet("/casei/rest/*")
public class UserRestServlet extends HttpServlet{

    private UserDAO dao;
    private PrintWriter out;
    
    @Override
    public void init() throws ServletException {
        dao = new UserDAO();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=utf-8");
        out = response.getWriter();
        try {
            RestRequest restRequest = new RestRequest(request.getPathInfo());
            int id = restRequest.getId();
            
            if(id == -1) {
                out.print(new Gson().toJson(dao.queryUsers()));
            } else {
                out.print(new Gson().toJson(dao.queryUser(id)));
            }
            
        } catch (ServletException e) {
            e.printStackTrace();
            out.println(e.toString());
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=utf-8");
        out = resp.getWriter();
        try{
            String createname = req.getParameter("createname");
            RestRequest restRequest = new RestRequest(req.getPathInfo());
            dao.createUser(createname);
            out.println("Create \"" + createname + "\" Finish");
        }catch (ServletException e) {
            e.printStackTrace();
            out.println(e.toString());
        }
        
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=utf-8");
        out = resp.getWriter();
        try {
            RestRequest restRequest = new RestRequest(req.getPathInfo());
            String args = new BufferedReader(new InputStreamReader(req.getInputStream())).readLine();
            String updateName = args.split("=")[1];
            dao.updateUser(restRequest.getId(), updateName);
            out.print("Update \"(ID: " + restRequest.getId() + ") "+ updateName + "\" Finish");
        } catch (ServletException e) {
            e.printStackTrace();
            out.println(e.toString());
        }
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter out = resp.getWriter();
        try {
            RestRequest restRequest = new RestRequest(req.getPathInfo());
            dao.deleteUser(restRequest.getId());
            out.println("Delete \"(ID: " + restRequest.getId() +") Finish");
        } catch (ServletException e) {
            e.printStackTrace();
            out.println(e.toString());
        }
    }
    
    
// implement remaining HTTP actions here
    private class RestRequest {
        // Accommodate two requests, one for all resources, another for a specific
        // resource

        private Pattern regExAllPattern = Pattern.compile("/users");
        private Pattern regExIdPattern  = Pattern.compile("/user/([0-9]*)");

        private int id = -1;

        public RestRequest(String pathInfo) throws ServletException {
            // regex parse pathInfo
            Matcher matcher;

            // Check for ID case first, since the All pattern would also match
            matcher = regExIdPattern.matcher(pathInfo);
            if (matcher.find()) {
                if(matcher.group(1).length() > 0) {
                    id = Integer.parseInt(matcher.group(1));
                }
                return;
            }

            matcher = regExAllPattern.matcher(pathInfo);
            if (matcher.find()) {
                return;
            }

            throw new ServletException("Invalid URI");
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}