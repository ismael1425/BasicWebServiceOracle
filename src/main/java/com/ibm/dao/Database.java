
package com.ibm.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MayoIsmaelDiazCandel
 */
public class Database {
    public Connection getConnection() throws Exception{
        try {
            String connectionURL="jdbc:oracle:thin:@localhost:1521:xe";
            Connection connection = null;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection =  DriverManager.getConnection(connectionURL, "system", "a1234");
            System.out.println(connection);
            return connection;
        } catch (Exception e) {
            throw e;
        }
    }
 

}
