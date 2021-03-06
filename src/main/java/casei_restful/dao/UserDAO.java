/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casei_restful.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TiramiAsu
 */
public class UserDAO {
    
    // 資料庫 
    private static List<String> users;
       
    static {
        users = new ArrayList<>(
                Arrays.asList("Eclipse", "Github",
                        "Hibernate", "Java", "Maven", "Netbeans",
                        "Oracle", "Postman", "RESTful", "Servlet")
        );
    }
    
    // C
    public void createUser(String name){        
        users.add(name);
    }
    
    // R
    public String queryUser(int id){
        return users.get(id);
    }
    
    public List<String> queryUsers(){
        return users;
    }
    
    // U
    public void updateUser(int id, String newName){
        users.set(id, newName);
    }
    
    // D
    public void deleteUser(int id){
        users.remove(id);
    }
    
    
    // Test
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();
        
        System.out.println(dao.queryUser(2));
        dao.createUser("banana");
        System.out.println(dao.queryUsers());
        dao.updateUser(1, "nonone");
        System.out.println(dao.queryUsers());
        dao.deleteUser(4);
        System.out.println(dao.queryUsers());
    }
}
