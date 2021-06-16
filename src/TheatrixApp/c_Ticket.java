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
public class c_Ticket extends Transaksi{
    Database db = new Database();
    ResultSet rs ;
    
    
    public String simpanTiket() throws SQLException {
        rs = db.getData("select * from transaksi");
        String pesan = null;
        
        while(rs.next()){
            pesan = rs.getString("id_transaksi");
        }
        return pesan;
    }
    
    public void detailTiket (String pesan) throws SQLException {
        db.Query("delete from transaksi");
        rs = db.getData("select * from ticket where id_transaksi = '" +pesan+"'");
        
        while (rs.next()){
           setIdTransaksi(rs.getString("id_transaksi"));
           setUsername(rs.getString("username"));
           setFilm(rs.getString("film"));
           setPcs (rs.getInt("pcs"));
           setHarga(rs.getInt("harga"));
           setDate(rs.getString("date"));
         }    
    }    
}
