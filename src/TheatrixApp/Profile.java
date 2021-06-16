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
public class Profile extends c_User{
    Database db = new Database();
    ResultSet rs;
    
    public String simpanProfil() throws SQLException{
        rs = db.getData("select * from logged_in");
        String simpan = null;
        
        while (rs.next()) {
            simpan = rs.getString("username");
        }
        
        return simpan;
    }
    
    public void detailProfil(String simpan) throws SQLException {
        rs = db.getData("select * from user where username = '"+simpan+"'");
        
        while (rs.next()) {
            setUsername(rs.getString("username"));
            setPassword(rs.getString("password"));
            setNama(rs.getString("nama"));
            setGender(rs.getString("gender"));
            setEmail(rs.getString("email"));
            setTelp(rs.getString("telp"));
        }
    }
    
    public void test(String test) throws SQLException {
        rs = db.getData("select * from user where username = '"+test+"'");
        
        while (rs.next()) {
            System.out.println("Username : "+ rs.getString("username"));
            System.out.println("Full Name : "+ rs.getString("nama"));
            System.out.println("Gender : "+ rs.getString("gender"));
            System.out.println("Email : "+ rs.getString("email"));
            System.out.println("Telephone : "+ rs.getString("telp"));
        }
    }
}
