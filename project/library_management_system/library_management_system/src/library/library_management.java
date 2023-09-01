/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class library_management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           connectDB dbconnect = new connectDB();
    Connection connect = dbconnect.connect();
    }
    
      public void actionPerformed (ActionEvent e){
            
        }
    
}
