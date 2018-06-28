
package com.ibm.service;

import com.ibm.dao.UserDAO;
import com.ibm.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author MayoIsmaelDiazCandel
 */
@Path("users")
public class UserService {
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUsers(){
        List<User> list = new ArrayList();
        try {
            list = new UserDAO().getUsers();          
        } catch (Exception e) {
        }
        return Response.ok(list).build();
    }
    
}
