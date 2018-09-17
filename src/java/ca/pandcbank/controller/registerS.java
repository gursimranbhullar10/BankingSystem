/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.controller;

import ca.pandcbank.beans.user;
import ca.pandcbank.beans.userProfile;
import ca.pandcbank.logic.registerL;
import java.io.IOException;
import java.io.PrintWriter;
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
public class registerS extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        String cardNum = (String) request.getParameter("cardNum");
        String username = (String) request.getParameter("username");
        String paswd = (String) request.getParameter("paswd");
        String firstName = (String) request.getParameter("firstName");
        String lastName = (String) request.getParameter("lastName");
        String add = (String) request.getParameter("add");
        String city = (String) request.getParameter("city");
        String prov = (String) request.getParameter("prov");
        String Q1 = (String) request.getParameter("Q1");
        String Q2 = (String) request.getParameter("Q2");
        String Q3 = (String) request.getParameter("Q3");
        String A1 = (String) request.getParameter("A1");
        String A2 = (String) request.getParameter("A2");
        String A3 = (String) request.getParameter("A3");
        if(registerL.checkC(cardNum)&&registerL.checkU(username)){
        registerL.createUser(cardNum, username, paswd, firstName, lastName, add, city, prov, Q1, Q2, Q3, A1, A2, A3);    
        session.setAttribute("WcarNum", "none");
             session.setAttribute("Wusername", "none");
               RequestDispatcher view = request.getRequestDispatcher("homePage.jsp");
        view.forward(request, response);
        }
        if(!registerL.checkC(cardNum)){
           session.setAttribute("WcarNum", "block");
            RequestDispatcher view = request.getRequestDispatcher("Register.jsp");
        view.forward(request, response);
        }
         if(!registerL.checkU(username)){
           session.setAttribute("Wusername", "block");
            RequestDispatcher view = request.getRequestDispatcher("Register.jsp");
        view.forward(request, response);
        }
    }
}
