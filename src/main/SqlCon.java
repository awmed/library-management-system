package main;

import java.sql.*;
import javax.swing.JOptionPane;

public class SqlCon {
    public static Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms_db","root","");
            //JOptionPane.showMessageDialog(null,"Database Connection Success","Success",JOptionPane.INFORMATION_MESSAGE);
            return conn;
        }//end try
        
        catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Database Connection Failed", "ERROR", JOptionPane.ERROR_MESSAGE);
            return null;
                                
            
        }//end catch
    }//end connection
}
