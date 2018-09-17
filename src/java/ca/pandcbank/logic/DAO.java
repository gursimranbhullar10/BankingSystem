package ca.pandcbank.logic;

import ca.pandcbank.beans.accounts;
import ca.pandcbank.beans.history;
import ca.pandcbank.beans.questionList;
import ca.pandcbank.beans.security;
import ca.pandcbank.beans.user;
import ca.pandcbank.beans.userProfile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {
    
    public DAO() {
    }

public static void add(String Query){
     try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
           st.executeUpdate(Query);
          con.close();
        } catch(Exception e){
            System.out.println(e);
    }
} 
  
    public static ArrayList<accounts> getAccounts() {
        ArrayList<accounts> config=new ArrayList<>();
        try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          String Query="SELECT * FROM accounts";
          
          ResultSet rs=st.executeQuery(Query);
          // st.executeUpdate(Query);
          
          ResultSetMetaData rsmd=rs.getMetaData();
          int numColumns=rsmd.getColumnCount();
          
          while(rs.next()){
             accounts s=new accounts(rs.getLong(1),rs.getLong(2),
                     rs.getLong(3),rs.getLong(4),rs.getLong(5));
              
             config.add(s);
             
          }
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    return config;
    }
    
      public static ArrayList<history> getHistory() {
        ArrayList<history> config=new ArrayList<history>();
        try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          String Query="SELECT * FROM history";
          ResultSet rs=st.executeQuery(Query);
          // st.executeUpdate(Query);
          
          ResultSetMetaData rsmd=rs.getMetaData();
          int numColumns=rsmd.getColumnCount();
          
          while(rs.next()){
             history s=new history(rs.getLong(1),rs.getString(2),
                     rs.getString(3),rs.getDouble(4),rs.getLong(5));
              
             config.add(s);
             
          }
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    return config;
    }
      public static ArrayList<userProfile> getUserProfile(){
            ArrayList<userProfile> config=new ArrayList<>();
        try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          String Query="SELECT * FROM user_profile";
          ResultSet rs=st.executeQuery(Query);
          // st.executeUpdate(Query);
          
          ResultSetMetaData rsmd=rs.getMetaData();
          int numColumns=rsmd.getColumnCount();
          
          while(rs.next()){
             userProfile s=new userProfile(rs.getInt(1),rs.getString(2),
                     rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
              
             config.add(s);
             
          }
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    return config;
      }
      public static void addDelayed(String a, String b){
          new Thread(new Runnable(){
              @Override
              public void run(){
                  queryU(a,b);
              }
          }).start();;
      }
      private static void queryU(String a, String b){
          try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          ResultSet as=st.executeQuery(b); 
          st.executeUpdate(a); 
          con.close();
        } catch(Exception e){
            System.out.println(e);
    }
      }
      public static void update(String a){
          try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          st.executeUpdate(a); 
          con.close();
        } catch(Exception e){
            System.out.println(e);
    }
      }
      public static ArrayList<security> getSecurity(){
               ArrayList<security> config=new ArrayList<>();
        try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          String Query="SELECT * FROM security";
          ResultSet rs=st.executeQuery(Query);
          // st.executeUpdate(Query);
          
          ResultSetMetaData rsmd=rs.getMetaData();
          int numColumns=rsmd.getColumnCount();
          
          while(rs.next()){
             security s=new security(rs.getInt(1),rs.getString(2),rs.getString(3),
                     rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
             config.add(s);
          }
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    return config;
      
      }
      public static ArrayList<user> getUser(){
                         ArrayList<user> config=new ArrayList<>();
        try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          if(con.isValid(40)){
              System.out.println("Is valid");
          }
          String Query="SELECT * FROM user";
          ResultSet rs=st.executeQuery(Query);
          // st.executeUpdate(Query);
          
          ResultSetMetaData rsmd=rs.getMetaData();
          int numColumns=rsmd.getColumnCount();
          
          while(rs.next()){
             user s=new user(rs.getInt(1),rs.getString(2),rs.getString(3),
                     rs.getString(4));
             config.add(s);
          }
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    return config;
      }
      public static ArrayList<questionList> getQuestionList(){
                               ArrayList<questionList> config=new ArrayList<>();
        try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          Statement st=con.createStatement();
          String Query="SELECT * FROM question_list";
          ResultSet rs=st.executeQuery(Query);
          // st.executeUpdate(Query);
          
          ResultSetMetaData rsmd=rs.getMetaData();
          int numColumns=rsmd.getColumnCount();
          
          while(rs.next()){
             questionList s=new questionList(rs.getInt(1),rs.getString(2));
             config.add(s);
          }
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
        }
    return config;
      }
       private static void isValid(){
          try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://35.226.13.76:3306/project1","bhullar","bhullar1234");
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
    }
      }
}
