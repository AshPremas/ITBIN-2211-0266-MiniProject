/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;

/**
 *
 * @author Ayodya
 */
public class AddJewelery {
    Statement stmt;
    
    public void Jewelery(String jcode, String jname, String category, String items){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate ("INSERT INTO jewelery VALUES('" + jcode + "', '" + jname + "', '" + category + "', '" + items + "')");
//            stmt.executeUpdate ("INSERT INTO jewelery VALUES('005', 'Test', 'Ring', '10')");
        } catch(Exception e) {
                e.printStackTrace();
        }
    }
}

