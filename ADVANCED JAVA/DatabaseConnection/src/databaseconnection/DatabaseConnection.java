
package databaseconnection;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbCon;


public class DatabaseConnection {

   
    public static void main(String[] args) {
        
        DbCon con=new DbCon();
        String sql="insert into students ( name, age) values(?,?)";
        
        try {
            PreparedStatement ps=con.getCon().prepareStatement(sql);
            
            
            ps.setString(1, "Masud");
            ps.setInt(2, 25);
            
            ps.executeUpdate();
            
            System.out.println("Ok");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
