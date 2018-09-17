package ca.pandcbank.controller;

import ca.pandcbank.beans.security;
import ca.pandcbank.beans.user;
import ca.pandcbank.beans.userProfile;
import ca.pandcbank.logic.Select;
import ca.pandcbank.logic.update;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class settingsS extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        int userid=(int) session.getAttribute("userid");
        userProfile up=(userProfile) session.getAttribute("up");
         security scr=(security)session.getAttribute("scr");
         user us=Select.getUserI(userid);
         
         String something=request.getParameter("something");
String fN=request.getParameter("firstName");
String lN=request.getParameter("lastName");
String ct=request.getParameter("city");
String adr=request.getParameter("address");
String prv=request.getParameter("province");

String oldpass=request.getParameter("oldPass");
String newpass=request.getParameter("newPass");
String newpass2=request.getParameter("newPass2");
if(oldpass == null ? us.getPassword() == null : oldpass.equals(us.getPassword())){
    if(newpass == null ? newpass2 == null : newpass.equals(newpass2)){
        us.setPassword(newpass);
        session.setAttribute("newpas", "display:none");
    }else{
        session.setAttribute("newpas", "display:block");
    }
    session.setAttribute("oldpas", "display:none");
}else{
    session.setAttribute("oldpas", "display:block");
}
String ques1=request.getParameter("select1");
String ques2=request.getParameter("select2");
String ques3=request.getParameter("select3");
String ans1=request.getParameter("ans1");
String ans2=request.getParameter("ans2");
String ans3=request.getParameter("ans3");
scr.setQuestion1(ques1);
scr.setQuestion2(ques2);
scr.setQuestion3(ques3);
scr.setAnswer1(ans1);
scr.setAnswer2(ans2);
scr.setAnswer3(ans3);

if(fN!=""){
up.setFirstName(fN);
}
if(lN!=""){
up.setLastName(lN);
}
if(ct!=""){
up.setCity(ct);
}
if(adr!=""){
up.setStreet(adr);
}
if(prv!=""){
up.setProv(prv); 
}
if("1".equals(something)){
update.updateUP(up);}
if("2".equals(something)){
    update.updateU(us);
}
if("3".equals(something)){
update.updateSC(scr);
    
}
RequestDispatcher view = request.getRequestDispatcher("settings.jsp");
        view.forward(request, response);
    }
}
