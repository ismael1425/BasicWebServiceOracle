
package com.ibm.dao;

import com.ibm.model.User;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MayoIsmaelDiazCandel
 */
public class UserDAO {
    
  public List<User> getUsers() throws Exception{
      List<User> list = new ArrayList();
      Database db = new Database();
      Connection con = db.getConnection();
      Access access = new Access();
      list = access.getUsers(con);
      return list;
  } 
}
