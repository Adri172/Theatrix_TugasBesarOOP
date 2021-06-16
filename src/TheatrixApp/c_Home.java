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
public class c_Home extends c_User{
    Database db = new Database();
    ResultSet rs;

    public c_Home(){}
    
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
            setNama(rs.getString("nama"));
        }
    }    
}
