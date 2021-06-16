/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author shidq
 */
public class Update {
    public void updateMember(String nama, String gender, String email, String telp) throws SQLException{
        Database db = new Database();
        ResultSet rs;
        
        Profile pro = new Profile();
        pro.detailProfil(pro.simpanProfil());
        
        db.Query("Update user set nama='"+nama+"', gender='"+gender+"', "
                + "email='"+email+"', telp='"+telp+"' where username='"+pro.simpanProfil()+"'");
//        db.Query("delete from logged_in");
    }
    
    public void UpdatePassword (String username, String password) {
        Database db = new Database();
        
        db.Query("update user set password = '"+password+"' where username = '"+username+"'");
    }
}
