/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 84564
 */
public class DatabasesHelper {
     public static Connection openConnection() throws Exception{   
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=CT239;"; 
        String dbusername = "sa";
        String password = "trinh0052";
        Connection con = DriverManager.getConnection(connectionUrl, dbusername, password);
        return con;
    }
}
