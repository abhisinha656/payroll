/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abhi
 */
package db;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class database {
    static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/doc11","root","");
            
        }catch(Exception ex){
            System.out.println("" + ex);
        }
        return con;
    }
}

