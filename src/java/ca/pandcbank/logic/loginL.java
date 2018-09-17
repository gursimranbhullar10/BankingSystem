/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.logic;

import ca.pandcbank.beans.user;
import java.util.ArrayList;

public class loginL {
private static int usrid;
    public static boolean checkUP(String usr, String pass) {
        ArrayList<user> us = DAO.getUser();
        for (int i = 0; i < us.size(); i++) {
            if (us.get(i).getUsername().equals(usr) && us.get(i).getPassword().equals(pass)) {
                usrid=us.get(i).getUserId();
                return true;
            }
            else if (us.get(i).getCardNo().equals(usr) && us.get(i).getPassword().equals(pass)) {
                usrid=us.get(i).getUserId();
                return true;
            }
        }
        return false;
    }
  /*  public static boolean checkU(String usr) {
        ArrayList<user> us = DAO.getUser();
        for (int i = 0; i < us.size(); i++) {
            if (us.get(i).getUsername().equals(usr)||us.get(i).getCardNo().equals(usr)) {
                return true;
            }          
        }
        return false;
    }
    public static boolean checkP(String pass) {
        ArrayList<user> us = DAO.getUser();
        for (int i = 0; i < us.size(); i++) {
            if (us.get(i).getPassword().equals(pass)) {
                return true;
            }          
        }
        return false;
    }
*/
    public static int getUsrid() {
        return usrid;
    }

    public void setUsrid(int usrid) {
        this.usrid = usrid;
    }
    
}
