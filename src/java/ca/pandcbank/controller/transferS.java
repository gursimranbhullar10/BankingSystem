/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.controller;

import ca.pandcbank.logic.insert;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class transferS extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String formno = request.getParameter("something");
        if ("1".equals(formno)) {
            String select1 = request.getParameter("select1");
            String select2 = request.getParameter("select2");
            String whn = request.getParameter("whn");
            String amnt = request.getParameter("amnt");
            insert a = new insert();
            a.insertH(select1, select2, whn, "-"+amnt);
            a.insertH(select2, select1, whn, amnt);
        }
        if ("2".equals(formno)) {
            String select1 = request.getParameter("select1");
            String accountno = request.getParameter("accountno");
            String whn = request.getParameter("whn");
            String amnt = request.getParameter("amnt");
            insert a = new insert();
            a.insertH(select1, accountno, whn, "-"+amnt);
            a.insertH(accountno, select1, whn, amnt);
        }
        if ("3".equals(formno)) {
            String select1 = request.getParameter("select1");
            String select2 = request.getParameter("select2");
            String whn = request.getParameter("whn");
            String amnt = request.getParameter("amnt");
            if ("3".equals(amnt)) {
                amnt = request.getParameter("amnt2");
            }
            insert a = new insert();
            a.insertH(select1, select2, whn,"-"+ amnt);
        }
        RequestDispatcher view = request.getRequestDispatcher("accountsAccess");
        view.forward(request, response);
    }
}
