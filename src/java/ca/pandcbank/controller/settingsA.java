/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.pandcbank.controller;

import ca.pandcbank.beans.questionList;
import ca.pandcbank.beans.security;
import ca.pandcbank.beans.userProfile;
import ca.pandcbank.logic.DAO;
import ca.pandcbank.logic.Select;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class settingsA extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 HttpSession session = request.getSession();
          int userid = (int)session.getAttribute("userid");
          userProfile up=Select.getUserProfile(userid);
          security scr=Select.getSecurity(userid);
          session.setAttribute("up", up);
          session.setAttribute("scr", scr);
          session.setAttribute("oldpas", "display:none");
        session.setAttribute("newpas", "display:none");
        ArrayList<questionList> ql=DAO.getQuestionList();
        session.setAttribute("qlist", ql);
    RequestDispatcher view = request.getRequestDispatcher("settings.jsp");
        view.forward(request, response);
    }
}