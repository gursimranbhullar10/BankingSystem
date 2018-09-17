/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.controller;

import ca.pandcbank.beans.acclist;
import ca.pandcbank.beans.accounts;
import ca.pandcbank.logic.Select;
import ca.pandcbank.logic.accountsL;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author gursimran bhullar
 */
public class transferA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
          double sum3=0;
          String mnmpymnt="";
          String PyAc="";
        int userid = (int)session.getAttribute("userid");
        accounts a = Select.getAccount(userid);
        ArrayList<acclist> list = new ArrayList<>();
        if (a.getChequingNo() != 0) {
            acclist al=new acclist("Chequing Account",a.getChequingNo());
            list.add(al);
        }
        if (a.getInvestmentNo() != 0) {
            acclist al=new acclist("Investment Account",a.getInvestmentNo());
            list.add(al);
        }
        if (a.getCreditNo() != 0) {
            PyAc="Credit Account";
            acclist al=new acclist("Credit Account",a.getCreditNo());
            list.add(al);
            sum3=Double.valueOf(accountsL.getSum(a.getCreditNo()));
            mnmpymnt=accountsL.getMinimumPayment(a.getCreditNo());
        }
        if (a.getSavingNo() != 0) {
            acclist al=new acclist("Saving Account",a.getSavingNo());
            list.add(al);
        }
        session.setAttribute("acc", a);
        session.setAttribute("list", list);
        session.setAttribute("sum3", sum3);
        session.setAttribute("MP", mnmpymnt);
        session.setAttribute("PyAc", PyAc);
        RequestDispatcher view = request.getRequestDispatcher("transfer.jsp");
        view.forward(request, response);
    }
}
