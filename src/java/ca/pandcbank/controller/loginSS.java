/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.controller;

import ca.pandcbank.logic.loginL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginSS extends HttpServlet {

   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
HttpSession session = request.getSession();
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        if (loginL.checkUP(username, password)) {
             System.out.println(username+password);
            session.setAttribute("userid", loginL.getUsrid());
            RequestDispatcher view = request.getRequestDispatcher("accountsAccess");
            view.forward(request, response);
        } else {
            session.setAttribute("WUP", "block");
            RequestDispatcher view = request.getRequestDispatcher("login.jsp");
            view.forward(request, response);
        }
    }
}
