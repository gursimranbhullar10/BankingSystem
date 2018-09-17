/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.controller;

import ca.pandcbank.beans.accounts;
import ca.pandcbank.beans.history;
import ca.pandcbank.logic.Select;
import ca.pandcbank.logic.accountsL;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class accountsA extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     HttpSession session = request.getSession();
          int userid = (int)session.getAttribute("userid");
        accounts a = Select.getAccount(userid);
          ArrayList<history> hs1=new ArrayList<>();
          ArrayList<history> hs2=new ArrayList<>();
          ArrayList<history> hs3=new ArrayList<>();
          ArrayList<history> hs4=new ArrayList<>(); 
         String sum1="0";
          String sum2="0";
          String sum3="0";
          String sum4="0";
          String mnyavlbl="0";
          String mnmpymnt="";
          String dueDate="";
     if (a.getChequingNo() != 0) {
            hs1=Select.getHistoryA(a.getChequingNo());
            sum1=accountsL.getSum(a.getChequingNo());
            
        }
        if (a.getInvestmentNo() != 0) {
            hs2=Select.getHistoryA(a.getInvestmentNo());
            sum2=accountsL.getSum(a.getInvestmentNo());
        }
        if (a.getCreditNo() != 0) {
            hs3=Select.getHistoryA(a.getCreditNo());
            sum3=accountsL.getSum(a.getCreditNo());
            mnyavlbl=accountsL.getMoneyAvailable(a.getCreditNo());
            mnmpymnt=accountsL.getMinimumPayment(a.getCreditNo());
            try {
                dueDate=accountsL.getDueDate();
            } catch (ParseException ex) {
                Logger.getLogger(accountsA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (a.getSavingNo() != 0) {
            hs4=Select.getHistoryA(a.getSavingNo());
            sum4=accountsL.getSum(a.getSavingNo());
        }
        session.setAttribute("hs1", hs1);
        session.setAttribute("hs2", hs2);
        session.setAttribute("hs3", hs3);
        session.setAttribute("hs4", hs4);
        session.setAttribute("sum1", sum1);
        session.setAttribute("sum2", sum2);
        session.setAttribute("sum3", sum3);
        session.setAttribute("sum4", sum4);
        session.setAttribute("MA", mnyavlbl);
        session.setAttribute("MP", mnmpymnt);
        session.setAttribute("DD", dueDate);
        
RequestDispatcher view = request.getRequestDispatcher("Accounts.jsp");
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
          int userid = (int)session.getAttribute("userid");
        accounts a = Select.getAccount(userid);
          ArrayList<history> hs1=new ArrayList<>();
          ArrayList<history> hs2=new ArrayList<>();
          ArrayList<history> hs3=new ArrayList<>();
          ArrayList<history> hs4=new ArrayList<>(); 
          String sum1="0";
          String sum2="0";
          String sum3="0";
          String sum4="0";
          String mnyavlbl="0";
          String mnmpymnt="";
          String dueDate="";
     if (a.getChequingNo() != 0) {
            hs1=Select.getHistoryA(a.getChequingNo());
            sum1=accountsL.getSum(a.getChequingNo());
            
        }
        if (a.getInvestmentNo() != 0) {
            hs2=Select.getHistoryA(a.getInvestmentNo());
            sum2=accountsL.getSum(a.getInvestmentNo());
        }
        if (a.getCreditNo() != 0) {
            hs3=Select.getHistoryA(a.getCreditNo());
            sum3=accountsL.getSum(a.getCreditNo());
            mnyavlbl=accountsL.getMoneyAvailable(a.getCreditNo());
            mnmpymnt=accountsL.getMinimumPayment(a.getCreditNo());
            try {
                dueDate=accountsL.getDueDate();
            } catch (ParseException ex) {
                Logger.getLogger(accountsA.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (a.getSavingNo() != 0) {
            hs4=Select.getHistoryA(a.getSavingNo());
            sum4=accountsL.getSum(a.getSavingNo());
        }
        session.setAttribute("hs1", hs1);
        session.setAttribute("hs2", hs2);
        session.setAttribute("hs3", hs3);
        session.setAttribute("hs4", hs4);
        session.setAttribute("sum1", sum1);
        session.setAttribute("sum2", sum2);
        session.setAttribute("sum3", sum3);
        session.setAttribute("sum4", sum4);
        session.setAttribute("MA", mnyavlbl);
        session.setAttribute("MP", mnmpymnt);
        session.setAttribute("DD", dueDate);
        
RequestDispatcher view = request.getRequestDispatcher("Accounts.jsp");
        view.forward(request, response);
        
    }
}
