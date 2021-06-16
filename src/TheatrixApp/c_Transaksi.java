/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Stevan Del Arisandi 1301184365
 */
public class c_Transaksi {
    public static List<Transaksi> Tr;
    
    public c_Transaksi() {
    }
    
    public void listTransaksi(String username) throws SQLException{
        Tr = new ArrayList();
        Database db = new Database();
        ResultSet rs = db.getData("select * from ticket where username = '"+username+"'");
        while(rs.next()){

            Tr.add(new Transaksi(
              rs.getString("id_transaksi"),
              rs.getString("film"),
              rs.getInt("pcs"),
              rs.getInt("harga"),
              rs.getString("date")
            ));
            
        }
    }
    
    public void storeTransaksi(String id_transaksi) throws SQLException{
        Database db = new Database();
        
        db.Query("delete from transaksi");
        db.Query("insert into transaksi values('"+id_transaksi+"')");
    }    
}
