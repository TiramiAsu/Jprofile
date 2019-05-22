package caseiii_orm.servlet.jasrs;

import caseiii_orm.dao.BookDAOImpl;
import caseiii_orm.model.Book;
import com.google.gson.Gson;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author TiramiAsu
 */
@Path("/book")
public class BookRS {
    
    private BookDAOImpl dao;
    
    {
        dao = new BookDAOImpl();
    }
    
    @GET
    @Path("/{id}")
    public String queryBookRS(@PathParam("id") int id){
        return new Gson().toJson(dao.queryBook(id));
    }
    
    @GET
    @Path("/all")
    public String queryAllRS(){
        return new Gson().toJson(dao.queryAllBook());
    }    
        
    @DELETE
    @Path("/{id}")
    public String deleteBookRS(@PathParam("id") int id){
        dao.delete(id);
        return "Delete: id=" + id + " Finish";
    }
    
    @POST
    public String createBookRS(@FormParam("createname") String createname){
        int createprice = 100;
        dao.create(new Book(createname,createprice));
        return "Create: " + createname + " Finish";
    }
    
    @PUT
    @Path("/{id}")
    public String updateBookRS(@PathParam("id") int id, @FormParam("updatename") String updatename){
        int updateprice = 200;
        dao.update(new Book(updatename,updateprice));
        return "Update: id=" + id + ", " + updatename + " Finish";
    }
    
    
}
