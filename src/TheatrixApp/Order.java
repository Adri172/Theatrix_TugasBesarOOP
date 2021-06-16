/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

/**
 *
 * @author Stevan Del Arisandi 1301184365
 */
public class Order {
    private String id_transaksi;
    private String username;
    private String film;
    private int pcs;
    private int harga;
    private String date;
    
    

    public Order() {
    }
    
    public Order(String id_transaksi, String film, int pcs, int harga,String date){
        this.id_transaksi = id_transaksi;
        this.film = film;
        this.pcs = pcs;
        this.harga = harga;
        this.date = date;
        
    }

    public void setIdTransaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }    

    public String getIdTransaksi() {
        return id_transaksi;
    }


    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }
    
    public int getPcs() {
        return pcs;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public void setDate(String date) {
        this.date = date;
    } 
    
    public String getDate() {
        return date;
    }    
}
