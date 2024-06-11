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
public class JeweleryController {
    
    public static void Jewelery(String jcode, String jname, String category, String items){
        new Model.AddJewelery().Jewelery(jcode, jname, category, items);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
    }
}
