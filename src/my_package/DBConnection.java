    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_package;

/**
 *
 * @author user
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    
    private static Connection con;
    
    public static Connection getConnection(){
    
    try{
        
        if(con == null || con.isClosed()){
            
            String url = "jdbc:mysql://localhost:3306/login_registration";
            String user = "root";
            String password = "";
            
            con = DriverManager.getConnection(url, user, password);
            
            System.out.println("Database connected succesfully.");
        }
    }catch (SQLException e){
        
        System.out.println("Database connection failed.");
        e.printStackTrace();
    }
    return con;
    }
}