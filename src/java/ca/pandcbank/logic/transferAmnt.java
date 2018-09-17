package ca.pandcbank.logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

 public class transferAmnt {

     public transferAmnt(String account1, String account2, String when, String amnt){
         Random rand = new Random(); 
long value = rand.nextLong();
         try{
            //create connection to jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //create connection to sql server
            Connection con=DriverManager.getConnection(""
                    + "jdbc:mysql://localhost/project1","root","root");
          Statement st=con.createStatement();
          String Query="INSERT INTO history" +
" VALUES('"+account1+"','"+when+"','"+account2+"','"+"-"+amnt+"','"+value+"') ";
          
          //ResultSet rs=st.executeQuery(Query);
           st.executeUpdate(Query);
          
          
          con.close();
        } catch(Exception e){
            System.out.println(e);
    }
 }
 }

