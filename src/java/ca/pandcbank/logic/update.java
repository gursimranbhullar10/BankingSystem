
package ca.pandcbank.logic;

import ca.pandcbank.beans.security;
import ca.pandcbank.beans.user;
import ca.pandcbank.beans.userProfile;

public class update {

public void update(){
    
}   
public static void updateUP(userProfile up){
    String query="UPDATE user_profile SET first_name='"+up.getFirstName()+
            "',last_name='"+up.getLastName()+"',street='"+up.getStreet()+
            "',city='"+up.getCity()+"',prov='"+up.getProv()+"'"
            + " WHERE user_id="+up.getUserId()+";" ;
DAO.update(query);
}
public static void updateSC(security scr){
    String query="UPDATE security SET Q1='"+scr.getQuestion1()+"',Q2='"
            +scr.getQuestion2()+"',Q3='"+scr.getQuestion3()+"',A1='"
            +scr.getAnswer1()+"',A2='"+scr.getAnswer2()+"',A3='"+scr.getAnswer3()+"'"
            +" WHERE user_id="+scr.getUserId()+";";
DAO.update(query);
}
public static void updateU(user usr){
    String query="UPDATE user SET password='"+usr.getPassword()+"'"+
            "WHERE user_id="+usr.getUserId()+";";
    DAO.update(query);
}
}
