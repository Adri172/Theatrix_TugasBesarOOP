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
 * @author Stevan Del Arisandi 1301184365
 */
public class Logged extends c_User{
    Database db = new Database();
    ResultSet rs;
    // ResultSet untuk mendapatkan data dari database

    public Logged() {
    }

    /*simpanProfil akan menyimpan no_hp kedalam database untuk nantinya 
    seluruh data user akan ditampilkan pada frame Profil
    */
    public String simpanProfil() throws SQLException{
        rs = db.getData("select * from logged_in");
        String simpan = null;
        
        while (rs.next()) {
            simpan = rs.getString("username");
        }
        
        return simpan;
    }
    
    /* detailProfil akan menampilkan data profil user sesuai dengan no_hp yg disimpan 
    di method simpanProfil*/
    public void detailProfil(String username) throws SQLException {
        rs = db.getData("select * from user where username = '"+username+"'");
        
        while (rs.next()) {
            setUsername(rs.getString("username"));
            setPassword(rs.getString("password"));
            setNama(rs.getString("nama"));
            setEmail(rs.getString("email"));
            setTelp(rs.getString("telp"));
        }
    }    
}
