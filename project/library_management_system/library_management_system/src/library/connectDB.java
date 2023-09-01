package library;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
    
    public static Connection connect(){
        //a connection scenario with the database
        Connection db_connect = null;
        
        String hostname = "localhost";
        String database = "library_management";
        String username = "root";
        String password = ""; //the password is inserted here
        
        //attempt to see if the driver is working
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //verification for success in attempt
            System.out.println("Connection to the Database is Successful");
        }catch(ClassNotFoundException cnfe){
            //verification for failure in attempt
            System.out.println("Error finding class : "+cnfe);
        }
        
        //establish a connection to the database
        try{
            db_connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
            //verification for success in connection
            System.out.println("Connection to the Database is Successful");
        }catch(SQLException sqle){
            //verification for failure in connection
            System.out.println("Connection to the Database is Unsuccessful due to: "+sqle);
        }
        
        return db_connect;
    }
    
}
