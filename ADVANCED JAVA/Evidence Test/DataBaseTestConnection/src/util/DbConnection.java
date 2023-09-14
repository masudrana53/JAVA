/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class DbConnection {
    
    private Connection con=null;
    
    private String url="jdbc:mysql://localhost:3306/database2";
    private String user="root";
    private String password="1234";
    private String dirver="com.mysql.cj.jdbc.Driver";
    
    
    public Connection getCon(){
       
        try {
            Class.forName(password);
            
                    
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
