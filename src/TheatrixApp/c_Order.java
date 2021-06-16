/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Stevan Del Arisandi 1301184365
 */
public class c_Order {
    Database db = new Database();
    ResultSet rs;
    
    public String IdTransaksi() throws SQLException {
        rs = db.getData("select * from ticket");
        String simpan = null;
        boolean empty = true;
        
        while (rs.next()) {
            simpan = rs.getString("id_transaksi");
            empty = false;
        }
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        if (!empty) {
            i = Integer.parseInt(Character.toString(simpan.charAt(simpan.length()-1)));
            j = Integer.parseInt(Character.toString(simpan.charAt(simpan.length()-2)));
            k = Integer.parseInt(Character.toString(simpan.charAt(simpan.length()-3)));
        }
        if (i == 9){
            i = 0;
            j++;
            if (j == 9) {
                j = 0;
                k++;
            }
        } else if (j == 9) {
            j = 0;
            k++;
        } else {
            i++;
        }
        
        simpan = "T" + String.valueOf(k) + String.valueOf(j) + String.valueOf(i);
        
        return simpan;
    }
    
    public void detailBooking(String id_transaksi, String film, int pcs, int harga) throws SQLException {    
        rs = db.getData("select * from logged_in");
        
        String username = null;
        
        while (rs.next()) {
            username = rs.getString("username");
        }
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        
        db.Query("insert into ticket values('"+id_transaksi+"', '"+username+"', '"+film+"', '"+pcs+"', '"+harga+"', '"+localDate+"')");
    }
   
}
