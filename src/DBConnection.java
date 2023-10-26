
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class DBConnection {
    private static final String DB_URL="jdbc:mysql://127.0.01/online exam"; 
    private static final String USER="om";
    private static final String PASS="om123";
    
    public Connection CONN(){
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (Exception e) {
            
        }
        return conn;
    }
         
}
