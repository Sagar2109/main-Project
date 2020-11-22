/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTEL
 */
import java.sql.*;
public class Connect {

   
    
    public static Connection con;
    static{
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=  DriverManager.getConnection("jdbc:mysql://localhost:3306/rentpro","root","1234");
         
        }
        catch(Exception e){ System.out.println(e);}
    }
    public static Connection getcon(){
        return  con;
    
}

   
}