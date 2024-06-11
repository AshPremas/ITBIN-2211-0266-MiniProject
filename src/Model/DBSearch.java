/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Ayodya
 */
public class DBSearch {

    public ResultSet searchcustomers() {
        ResultSet rs = null;
        //To change body of generated methods, choose Tools | Templates.
        try {
            Statement stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM customer");
                } catch (Exception e) {
            e.printStackTrace();
            }
        return rs;
        
    }

    public ResultSet searchjewelery() {
        ResultSet rs = null;
        //To change body of generated methods, choose Tools | Templates.
        try {
            Statement stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM jewelry");
                } catch (Exception e) {
            e.printStackTrace();
            }
        return rs;
    }
}
