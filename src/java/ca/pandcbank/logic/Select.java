package ca.pandcbank.logic;
import ca.pandcbank.beans.accounts;
import ca.pandcbank.beans.history;
import ca.pandcbank.beans.questionList;
import ca.pandcbank.beans.security;
import ca.pandcbank.beans.user;
import ca.pandcbank.beans.userProfile;
import java.util.ArrayList;

public class Select {

    public Select() {
    }
    
   public static accounts getAccount(int userid){
        accounts a=new accounts();
       ArrayList<accounts> acc=DAO.getAccounts();
       for(int i=0;i<acc.size();i++){
           accounts x=acc.get(i);
           if(x.getUserId()==userid){
               a=x;
           }
       } 
   return a;
   }
   public static ArrayList<history> getHistoryA(long accountno){
        ArrayList<history> his=new ArrayList<>();
       ArrayList<history> his2=DAO.getHistory();
       for(int i=0;i<his2.size();i++){
           history x=his2.get(i);
           if(x.getAccountNo()==accountno){
               his.add(x);
           }
       } 
       return his;
   }
   
   public  static userProfile getUserProfile(int userid){
       userProfile x=new userProfile();
       ArrayList<userProfile> up=DAO.getUserProfile();
       for(int i=0;i<up.size();i++){
           userProfile a=up.get(i);
           if(a.getUserId()==userid){
               x=a;
           }
       }
       return x;
   }
   public static security getSecurity(int userid){
       security x=new security();
       ArrayList<security> scr=DAO.getSecurity();
       for(int i=0;i<scr.size();i++){
           security a=scr.get(i);
           if(a.getUserId()==userid){
               x=a;
           }
       }
       return x;
   }
   public static user getUser(String usr){
       user x=new user();
       ArrayList<user> u=DAO.getUser();
       for(int i=0;i<u.size();i++){
           user a=u.get(i);
           if(a.getUsername().equals(usr)){
               x=a;
           }
       }
       return x;
   }
   public static user getUserC(String crd){
       user x=new user();
       ArrayList<user> u=DAO.getUser();
       for(int i=0;i<u.size();i++){
           user a=u.get(i);
           if(a.getCardNo().equals(crd)){
               x=a;
           }
       }
       return x;
   }
   public static user getUserI(int userid){
       user x=new user();
       ArrayList<user> u=DAO.getUser();
       for(int i=0;i<u.size();i++){
           user a=u.get(i);
           if(a.getUserId()==userid){
               x=a;
           }
       }
       return x;
   }
   
   public static questionList getQuestion(int ques){
       questionList ql=new questionList();
       ArrayList<questionList> u=DAO.getQuestionList();
       for(int i=0;i<u.size();i++){
           questionList a=u.get(i);
           if(a.getQuestionNo()==ques){
               ql=a;
           }
       }
       return ql;
   }
}
