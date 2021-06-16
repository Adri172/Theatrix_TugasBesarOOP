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
public class Sementara {
     Database db = new Database();
    
    
    public void tayang(String film){
        db.Query("insert into orders values ('"+film+"')");
    }
    
//    public void tayang2(String film){
//        db.Query("insert into orders values ('"+film+"')");
//    }
    
}
