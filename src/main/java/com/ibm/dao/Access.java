
package com.ibm.dao;

import com.ibm.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MayoIsmaelDiazCandel
 */
public class Access {
    
    public List<User> getUsers(Connection con) throws SQLException{
        List<User> list= new ArrayList();
        PreparedStatement stmt = con.prepareStatement("select * from usuarios");
        ResultSet rs =  stmt.executeQuery();
        System.out.print(rs);
        try {
            while(rs.next()){
                User userObj = new User();
                userObj.setId(rs.getInt("id"));
                userObj.setName(rs.getString("name"));
                userObj.setRegistered(rs.getString("registered"));
                System.out.println(userObj);
                list.add(userObj);
            }
        } catch (Exception e) {
            throw e;
        }
        return list;
    }
     
    
}
