/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detaineemanagementsystem;
import javax.swing.JOptionPane;
import project.connectionprovider;
/**
 *
 * @author vacha
 */
public class Detaineemanagementsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Starting Up softaware....");
        System.out.println("Starting up pages..........");
        System.out.println("Loading database.....");
        new signin().setVisible(true);
        
    }
    
}
