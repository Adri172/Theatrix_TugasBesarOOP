/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Stevan Del Arisandi 1301184365
 */
public class Database {
    static String url ="jdbc:mysql://localhost/theatrix?serverTimezone=UTC"; 
    static String pass="";
    static String user="root";
    
    public static Connection con = null;
    public static Statement stm = null;
    public static ResultSet rs = null;
    
    public Database() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
        try {
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public ResultSet getData(String SQL) throws SQLException {
        try {
            rs = stm.executeQuery(SQL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void Query (String SQL) {
        try {
            stm.executeUpdate(SQL);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
