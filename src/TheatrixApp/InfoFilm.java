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
 * @author Tuf Gaming
 */
public class InfoFilm extends JudulFilm {
    Database db = new Database();
    ResultSet rs;
    
    public String dataTemporary() throws SQLException{
        rs = db.getData("select * from orders");
        String tampung = null;
        
        while (rs.next()) {
            tampung = rs.getString("film");
        }
        
        return tampung;
    }
    
    public void filmInfo(String tampung) throws SQLException {
        db.Query("delete from orders");
        rs = db.getData("select * from film where judul = '"+tampung+"'");
        
        while (rs.next()) {
            setJudul(rs.getString("judul"));
            setSinopsis(rs.getString("sinopsis"));
            setProduser(rs.getString("produser"));
            setSutradara(rs.getString("sutradara"));
        }
    }
    
    public String t2Temporary() throws SQLException{
        rs = db.getData("select * from orders");
        String tampung = null;
        
        while (rs.next()) {
            tampung = rs.getString("film");
        }
        
        return tampung;
    }
    
    
    public void t2filmInfo(String tampung) throws SQLException {
//        db.Query("delete from orders");
        rs = db.getData("select * from theaterdua where judul = '"+tampung+"'");
        
        while (rs.next()) {
            setJudul(rs.getString("judul"));
            setSinopsis(rs.getString("sinopsis"));
            setProduser(rs.getString("produser"));
            setSutradara(rs.getString("sutradara"));
        }
    }
    
}
