/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author vacha
 */
public class connectionprovider {
  
    
    //public static void main(String [] args)
    //{
      //  getconnection();
    //}
    public static Connection getconnection()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root");
           System.out.println("SUCCESS");
            return Con;
            
        }
        catch(Exception e)
        { 
            System.out.println(e);
            System.out.println("failure");
            return null;
                    
        }
            
    }

   // public static Connection getCon() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
}
    

