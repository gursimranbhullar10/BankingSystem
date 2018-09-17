/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.logic;

import ca.pandcbank.beans.history;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class accountsL {

    public accountsL() {
    }
public static String getSum(long accno){
double sum=0;
 ArrayList<history> hs=new ArrayList<>();
 hs=Select.getHistoryA(accno);
for(int i=0;i<hs.size();i++){
    sum+=hs.get(i).getAmount();
}
String y=String.format("%.2f", sum);
return y;
}

public static String getMoneyAvailable(long accno){
    double sum=0;
 ArrayList<history> hs=new ArrayList<>();
 hs=Select.getHistoryA(accno);
for(int i=0;i<hs.size();i++){
    sum+=hs.get(i).getAmount();
}
sum-=1000;
String y=String.format("%.2f", sum);
return y;
}
public static String getMinimumPayment(long accno){
    double sum=0;
 ArrayList<history> hs=new ArrayList<>();
 hs=Select.getHistoryA(accno);
for(int i=0;i<hs.size();i++){
    sum+=hs.get(i).getAmount();
}
double x=0.01*sum+0.01*sum;
String y=String.format("%.2f", x);
return y;
}
public static String getDueDate() throws ParseException{
    String x="";
    DateFormat df= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date dt=new Date();
    String tdate=df.format(dt);
        DateFormat df1= new SimpleDateFormat("yyyy/MM");
    String tmnth=df1.format(dt);
    String  ddate=tmnth+"/15 12:00:00";
    Date d1=df.parse(tdate);
    Date d2=df.parse(ddate);
    long dd=-((d1.getTime()-d2.getTime())/(24*60*60*1000));
    x=tmnth+"/15 due in "+dd+" days";
    return x;
}
}
