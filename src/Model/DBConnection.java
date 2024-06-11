/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

//import java.beans.Statement;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Ayodya
 */
class DBConnection {

//    static void closeCon() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    static Statement getStatementConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    static Connection conn;
    static Statement stat = null;
    
    public static Statement getStatementConnection() {
        try {
            // establish database connection
            String url = "jdbc:mysql://localhost:3306/jewelery_details";
            conn = DriverManager.getConnection(url, "root", "");
            
            // create the connection
            stat = conn.createStatement();
        } catch (SQLException e) {}
        
        return stat;
    }
    
    public static void closeCon() throws SQLException {
        conn.close();
    }
}
