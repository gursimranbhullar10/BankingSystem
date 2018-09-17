<%-- 
    Document   : transfer.jsp
    Created on : 13-Dec-2017, 10:36:10 PM
    Author     : gursimran bhullar
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P&B Bank</title>
        <link rel="stylesheet" type="text/css" href="transfer/style.css" />
        <script src="transfer/script.js"></script> 
        <style class="text/css">
        body{
             background-color:  #DEE0D1;
             background-image: url(ok.jpg);
        }
        h3{
            color:white;
        }
    </style>
    </head>
    <body>
        <c:import url="nav-header.jsp" />

        <ul id="nav1">
            <li class="horz"><button class="button1" onclick="box1()">Within Account</button></li>
            <li class="horz"><button class="button1" onclick="box2()">Interact</button></li>
            <li class="horz"><button class="button1" onclick="box3()">Pay Bill</button></li>
            <li class="horz"><button class="button1" type="submit" formaction="transferServlet" formmethod="GET" value="Abc">abc</button></li>
        </ul>
        <form name="myform" id="form1" method="POST" action="transferServlet"><input type="hidden" name="something" value="1" /></form>
        <div class="box1" id="box1" style="display: none;">   
            <div class="dropdown1">
                <h3 id="from">  From:</h3>   

                <select class="dropbtn1" name="select1" form="form1" >
                    <c:forEach var="item" items="${list}" varStatus='state'>
                    <option value="${item.accountNo}">${item.accountName}</option>
                    </c:forEach>
                </select>

            </div> 
            <div class="dropdown2">
                <h3 id="to">  To:</h3>   <select class="dropbtn2" name="select2" form="form1" >

                    <c:forEach var="item" items="${list}" varStatus='state'>
                    <option value="${item.accountNo}">${item.accountName}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="dropdown3"> 
                <h3 id="when">When:</h3>
                <input form="form1" name="whn" type="datetime-local" />
            </div>
            <div class="pay">
                <h3 id="paye">Pay: </h3>  $<input type="number" name="amnt" form="form1" min="0.01" step="0.01" />
            </div>
            <div class="submit">
                <button form="form1" type="submit"  class="submitB">Move</button>
            </div>
        </div>
 <form name="myform" id="form2" method="POST" action="transferServlet"><input type="hidden" name="something" value="2" /></form>
        <div class="box1" id="box2" style="display: none;">   
            <div class="dropdown1">
                <h3 id="from">  From:</h3>  <select class="dropbtn1" name="select1" form="form2" >

                   <c:forEach var="item" items="${list}" varStatus='state'>
                    <option value="${item.accountNo}">${item.accountName}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="dropdown2">
                <h3 id="to">  To:</h3>   <input type="number" min="0" name="accountno" form="form2" placeholder="Enter Account number">
            </div>
            <div class="dropdown3"> 
                <h3 id="when">When:</h3>
                <input form="form2" type="datetime-local" name="whn" />
            </div>
            <div class="pay">
                <h3 id="paye">Pay: </h3>  $<input type="number" name="amnt" form="form2" min="0.01" step="0.01">
            </div>
            <div class="submit">
                <button form="form2" type="submit" class="submitB">Move</button>
            </div>
        </div>
 <form name="myform" id="form3" method="POST" action="transferServlet"><input type="hidden" name="something" value="3" /></form>
        <div class="box1" id="box3" style="display: none;">   
            <div class="dropdown1">
                <h3 id="from">  From:</h3>   <select class="dropbtn1" name="select1" form="form3" >
                    <c:forEach var="item" items="${list}" varStatus='state'>
                    <option value="${item.accountNo}">${item.accountName}</option>
                    </c:forEach>
                    </select>
            </div>
            <div class="dropdown2">
                <h3 id="to">  To:</h3>   <select class="dropbtn2" name="select2" form="form3" >

                    <option value="1">${PyAc}</option>
                </select>
            </div>
            <div class="dropdown3"> 
                <h3 id="when">When:</h3>
               
                <input form="form3" name="whn" type="datetime-local" min=<?php 
                       echo date(y-m-d);
                       ?>
                       >
               
            </div>
            <div class="dropdown4">
                <h3 id="paye3">  Pay:</h3>   <select name="amnt" class="dropbtn2" onclick="if (this.selectedIndexed==2)payshw()" form="form3" >

                    <option value="${sum3}">Total Balance: ${sum3}</option>
                    <option value="${MP}">Minimum Payment: ${MP}</option>
                    <option value="3" onclick="payshw()">Custom Amount</option>
                </select>
            </div>
                    <div class="pay3" id="pay3">  $<input name="amnt2" type="number" form="form3" min="0.01" step="0.01">
            </div>
            <div class="submit">
                <button form="form3" type="submit" class="submitB">Move</button>
            </div>
        </div>


    </body>
</html>
