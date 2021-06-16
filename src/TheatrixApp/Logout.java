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
public class Logout {
    public void LogOff(){
        Database db = new Database();
        db.Query("delete from logged_in");
        db.Query("delete from orders");
        db.Query("delete from transaksi");
        
    }    
}
