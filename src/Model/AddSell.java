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
public class AddSell {
    Statement stmt;
    
    public void addSell(String cname, String iname, String status) {
        try {
            stmt = DBConnection.getStatementConnection();
            System.out.println(cname+ iname+ status);
            stmt.executeUpdate("INSERT INTO sell VALUES (null,'" + cname +"','" + iname + "', '" + status + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateSell (String itemCode, int itemQTY) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("UPDATE jewelery SET items = "+ itemQTY +" WHERE jcode = '"+ itemCode +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteSell (String itemCode) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("DELETE FROM jewelery WHERE jcode = '"+ itemCode +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
