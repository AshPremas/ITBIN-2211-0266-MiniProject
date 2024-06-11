/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Ayodya
 */
public class SellController {
    public static void SellJewelery(String cname, String iname, String status){
        new Model.AddSell().addSell(cname, iname, status);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void UpdateSelling(String itemCode, int itemQTY) {
        new Model.AddSell().updateSell(itemCode, itemQTY);
        JOptionPane.showMessageDialog(null, "Record has been updated successfully!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void DeleteSelling(String itemCode) {
        new Model.AddSell().deleteSell(itemCode);
        JOptionPane.showMessageDialog(null, "Record has been deleted successfully!", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
}
