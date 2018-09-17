<%-- 
    Document   : settings
    Created on : 15-Dec-2017, 5:38:49 PM
    Author     : gursimran bhullar
--%>
<%@page import="ca.pandcbank.beans.userProfile"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="settings/style.css" />
        <script src="settings/script.js"></script> 
        <style class="text/css">
        body{
             background-color:  #DEE0D1;
             background-image: url(ok.jpg);
        }
    </style>
    </head>
    <body>
        <c:import url="nav-header.jsp" />
         <ul id="nav1">
            <li class="horz"><button class="button1" onclick="profile()">Profile</button></li>
            <li class="horz"><button class="button1" onclick="security()">Security</button></li>
        </ul>
         <div id="profile" class="box1" style="display: none;">
             <div> <form name="myform1" id="form1" method="POST" action="settingsServlet">
                     <input type="hidden" name="something" value="1">
                <div>  <h4 style="display: inline-block">First Name: </h4> <input type="text" name="firstName" placeholder="${up.firstName}" style="display: inline-block" > </div><br>
                <div>  <h4 style="display: inline-block">Last Name: </h4> <input type="text" name="lastName" placeholder="${up.lastName}" style="display: inline-block" > </div><br>
                <div>  <h4 style="display: inline-block">Address: </h4> <input type="text" name="address" placeholder="${up.street}" style="display: inline-block" > </div><br>
                <div>  <h4 style="display: inline-block">City: </h4> <input type="text" name="city" placeholder="${up.city}" style="display: inline-block" > </div><br>
                <div>  <h4 style="display: inline-block">Province: </h4> <input type="text" name="province" placeholder="${up.prov}" style="display: inline-block" > </div><br>
                <button type="submit" >Submit</button>
                 </form>
            </div>
        </div>
        <div id="security" class="box1"  style="display: none;">
            <div class="dropbox">
                <button onclick="dropbox()" class="dropbtn1">Select Here</button>
                <div id="dropcontent" class="dropcontent" style="display: none">
                    <a href="#" onclick="passbox()">Change Password</a>
                    <a href="#" onclick="quesbox()">Change Security Questions</a>
                </div>
            </div>
            <div id="passbox" class="box1" style="display: none">
            <form name="myform2" id="form2" method="POST" action="settingsServlet">
                <input type="hidden" name="something" value="2">
                <h4 style=${oldpas}>Your Old Password is Incorrect </h4>
                <h4 style=${newpas}>Your New Passwords don't match </h4>
                <div>  <h4 style="display: inline-block">Enter Old Password: </h4> <input type="password" name="oldPass"  style="display: inline-block" > </div><br>
                <div>  <h4 style="display: inline-block">Enter New Password: </h4> <input type="password" name="newPass" title="Password must be 8 chracter"  style="display: inline-block" required pattern=".{8,20}"> </div><br>
                <div>  <h4 style="display: inline-block">Enter New Password Again: </h4> <input type="password" name="newPass2" title="Password must be 8 chracter"  style="display: inline-block" required pattern=".{8,20}"> </div><br>
            <button type="submit" >Submit</button>
            </form>
            </div>
            <div id="quesbox" class="box1" style="display: none">
                <form name="myform3" id="form3" method="POST" action="settingsServlet">
                    <input type="hidden" name="something" value="3">
                <select class="dropbtn1" name="select1" form="form3" >
                    <c:forEach items="${qlist}" var="item" >
                        <option value="${item.questionNo}">${item.question} </option>
                    </c:forEach>
                </select><br>
                    <input type="text" style="display: inline-block" name="ans1" required>
                <select class="dropbtn1" name="select2" form="form3" >
                     <c:forEach items="${qlist}" var="item" >
                        <option value="${item.questionNo}">${item.question} </option>
                    </c:forEach>
                </select><br>
                    <input type="text" style="display: inline-block" name="ans2" required>
                    
                   
                <select class="dropbtn1" name="select3" form="form3" >
                     <c:forEach items="${qlist}" var="item" >
                        <option value="${item.questionNo}">${item.question} </option>
                    </c:forEach>
                </select><br>
                    <input type="text" style="display: inline-block" name="ans3" required>
                    
                <button type="submit" form="form3" >Submit</button>
                </form>
                    
            </div>
        </div>
    </body>
</html>
