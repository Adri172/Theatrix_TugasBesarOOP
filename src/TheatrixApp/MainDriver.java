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
public class MainDriver {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Database db = new Database();
        db.Query("delete from logged_in");
        f_Login start = new f_Login();
        start.setVisible(true);
        start.pack();
    }
    
}
