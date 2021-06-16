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
public class c_User {
    private String username;
    private String password;
    private String nama;
    private String gender;
    private String email;
    private String telp;

//    public c_User(String username, String password, String nama, String email, int telp) {
//        this.username = username;
//        this.password = password;
//        this.nama = nama;
//        this.email = email;
//        this.telp = telp;
//    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
    
    public String getTelp() {
        return telp;
    }    
    
//    public String toString() {
//        String data = "ID Game : " + idGame + "\n"
//                + "Judul Game : " + judul + "\n"
//                + "Genre : " + genre  ;
//                
//        return data;
//    }    
}
