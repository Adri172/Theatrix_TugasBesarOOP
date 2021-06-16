/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheatrixApp;

/**
 *
 * @author Tuf Gaming
 */
public class JudulFilm implements Film{
    private String judul;
    private String sinopsis;
    private String produser;
    private String sutradara;
    
    public JudulFilm(){
        
    }
    
    @Override
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    @Override
    public String getJudul(){
        return judul;
    }

    @Override
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    @Override
    public String getSinopsis() {
        return sinopsis;
    }
    
    @Override
    public void setProduser(String produser) {
        this.produser = produser;
    }

    @Override
    public String getProduser() {
        return produser;
    }
    
    @Override
    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    @Override
    public String getSutradara() {
        return sutradara;
    }

   
    
    
    
}
