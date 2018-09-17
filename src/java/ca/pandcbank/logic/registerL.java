package ca.pandcbank.logic;

import ca.pandcbank.beans.security;
import ca.pandcbank.beans.user;
import ca.pandcbank.beans.userProfile;
import java.util.ArrayList;
import java.util.Random;

public class registerL {
public static void createUser(String card,String usr, String pass, String first, String last, String strt, String cty, String prov ,String q1, String q2, String q3, String a1, String a2, String a3){
    int usrID=createUserId();
    user us=new user(usrID,usr ,card,pass);
        userProfile up=new userProfile(usrID,first,last,strt,cty,prov);
        security scr=new security(usrID,q1,a1,q2,a2,q3,a3);
        insert.insertU(us);
        insert.insertUP(up);
        insert.insertSC(scr);
}

public static int createUserId(){
    int x=0;
    Random rand = new Random();
            int value = rand.nextInt();
         ArrayList<user>  usAr=DAO.getUser();
         for(int i=0;i<usAr.size();i++){
          int y=usAr.get(i).getUserId();
             while(value<0||y==value){
                value=rand.nextInt();
            }
         }
         x=value;
    return x;
}
public static boolean checkU(String usr){
    ArrayList<user> us=DAO.getUser();
    for(int i=0;i<us.size();i++){
        if(us.get(i).getUsername().equals(usr)){
            return false;
        }
    }
    return true;
}
public static boolean checkC(String card){
    ArrayList<user> us=DAO.getUser();
    for(int i=0;i<us.size();i++){
        if(us.get(i).getCardNo().equals(card)){
            return false;
        }
    }
    return true;
}

}
