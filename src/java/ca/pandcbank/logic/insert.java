
package ca.pandcbank.logic;

import ca.pandcbank.beans.security;
import ca.pandcbank.beans.user;
import ca.pandcbank.beans.userProfile;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class insert {

    public insert() {
    }
    
 public void insertH(String account1, String purchase, String when, String amnt){
        try {
            Random rand = new Random();
            int value = rand.nextInt();
            while(value<0){
                value=rand.nextInt();
            }
            String x="";
            DateFormat df= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date dt=new Date();
            String tdate=df.format(dt);
            DateFormat df1= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            Date d1=df.parse(tdate);
            Date d2=df1.parse(when);
            long dff=-(d1.getTime()-d2.getTime());
            long s=dff/1000;
            String Query1=" INSERT INTO history" +
                    " VALUES('"+account1+"','"+when+"','"+purchase+"','"+amnt+"','"+value+"'); ";  
            String Query2= "SELECT SLEEP("+s+");";
            DAO.addDelayed(Query1, Query2);
        } catch (ParseException ex) {
            Logger.getLogger(insert.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 public static void insertU(user usr){
     String query="";
     query="INSERT INTO user "+"VALUES('"+usr.getUserId()+"','"+usr.getUsername()+
             "','"+usr.getCardNo()+"','"+usr.getPassword()+"');";
     DAO.add(query);
 }
 public static void insertUP(userProfile up){
     String query="";
     query="INSERT INTO user_profile "+"VALUES('"+up.getUserId()+"','"+up.getFirstName()+
             "','"+up.getLastName()+"','"+up.getStreet()+"','"+up.getCity()+"','"+up.getProv()+"');";
     DAO.add(query);
 }
 public static void insertSC(security scr){
     String query="";
     query="INSERT INTO security "+"VALUES('"+scr.getUserId()+"','"+scr.getQuestion1()+
             "','"+scr.getQuestion2()+"','"+scr.getQuestion3()+"','"+scr.getAnswer1()+"','"+scr.getAnswer2()+"','"+scr.getAnswer3()+"');";
     DAO.add(query);
 }
}
