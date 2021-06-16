/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Stevan Del Arisandi 1301184365
 */
public class c_Register {
    boolean t = true;
    public c_Register(){
        
    }
    
    public boolean addRegister (String username, String password, String nama, String gender, String email, String telp) throws SQLException   {
        
            Register p = new Register(username, password, nama, gender, email, telp);
            Database db = new Database();
            ResultSet rs = db.getData("select * from user");
            boolean t = true;
            String s;
            
            while (rs.next()){
                if (p.getUsername().equals(rs.getString("username"))){
                    t = false;
                }
            }
                
            if(t == true){
                s = "insert into user values ('"+p.getUsername()+"','"+p.getPassword()+"','"+p.getNama()+"', '"+p.getGender()+"', '"+p.getEmail()+"', '"+p.getTelp()+"')";   
                db.Query(s);
                javax.swing.JOptionPane.showMessageDialog(null, "Registration Success! Press OK and Go Back to Login Page");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "This Username has been Used");
            }
        
       return t;
    }    
}
