/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casei.jaxrs;

import casei.dao.UserDAO;
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
@Path("/user")
public class UserRS {
    
    private UserDAO dao;
    
    {
        dao = new UserDAO();
    }
    
    @GET
    @Path("/{id}")
    public String queryUser(@PathParam("id") int id){
        return new Gson().toJson(dao.queryUser(id));
    }
    
    @GET
    @Path("/all")
    public String queryUsers(){
        return new Gson().toJson(dao.queryUsers());
    }
    
    @DELETE
    @Path("/{id}")
    public String deleteUser(@PathParam("id") int id){
        dao.deleteUser(id);
        return "Delete: id=" + id + " Finish";
    }
    
    @POST
    public String createUser(@FormParam("createname") String createname){
        dao.createUser(createname);
        return "Create: " + createname + " Finish";
    }
    
    @PUT
    @Path("/{id}")
    public String updateUser(@PathParam("id") int id, @FormParam("updatename") String updatename){
        dao.updateUser(id, updatename);
        return "Update: id=" + id + ", " + updatename + " Finish";
    }
}
