<%-- 
    Document   : Accounts.jsp
    Created on : 13-Dec-2017, 10:35:42 PM
    Author     : gursimran bhullar
--%>
<%@page import="ca.pandcbank.beans.history"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>P&B Bank</title>
        <link rel="stylesheet" type="text/css" href="accounts/style.css" />
        <script src="accounts/script.js">
        </script> 
        </script> 
          <style class="text/css">
        body{
             background-color:  #DEE0D1;
              background-image: url(ok.jpg);
        }
    </style>
    </head>
    <body onload="abc()">
        <c:import url="nav-header.jsp" />
        <div class="summarybox" id="summarybox">
            <div id="accountAH" class="accountAH">
                <button class="button1" onclick="accntA()">Chequing Account</button>
                <div id="accountA" class="accountA">
                    <h4>Account No. </h4><h4 id="chqngno"> ${hs1[0].accountNo}</h4>
                    <h4>Total Available Amount: ${sum1}</h4> 
                    

                    <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>
                        <c:forEach items="${hs1}" begin="0" end="3" var="item">
                            <tr>
                                <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>

                    </table>  
                </div>
                <button class="button1" onclick="detailsA()">Details</button>
            </div>
            <div id="accountBH" class="accountBH">
                <button class="button1" onclick="accntB()">Investment Account</button>
                <div id="accountB" class="accountB">

                    <h4>Account No. </h4><h4 id="invstno">${hs2[0].accountNo}</h4>
                    <h4>Total Available Amount: ${sum2}</h4> 

                    <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>

                        <c:forEach items="${hs2}" begin="0" end="2"  var="item">
                            <tr>
                                 <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <button class="button1" onclick="detailsB()">Details</button>
            </div>
            <div id="accountCH" class="accountCH">
                <button class="button1" onclick="accntC()">Credit Account</button>
                <div id="accountC" class="accountC">

                     <h4>Account No. </h4><h4 id="crdtno"> ${hs3[0].accountNo}</h4>
                    <h4>Total Available Amount: ${MA}</h4> 
                    <h4>Total money owe: ${sum3}</h4> 
                    <h4>Minimum Payment Due: ${MP}</h4>
                    <h4>Due Date: ${DD}</h4>
                       <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>

                        <c:forEach items="${hs3}" begin="0" end="3"  var="item">
                            <tr>
                                 <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <button class="button1" onclick="detailsC()">Details</button>
            </div>
        </div>
<div id="accountDH" class="accountDH">
                <button class="button1" onclick="accntD()">Saving Account</button>
                <div id="accountD" class="accountD">

                     <h4>Account No. </h4><h4 id="svngno"> ${hs4[0].accountNo}</h4>
                    <h4>Total Available Amount: ${sum4}</h4> 
                       <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>

                        <c:forEach items="${hs4}" begin="0" end="3"  var="item">
                            <tr>
                                 <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <button class="button1" onclick="detailsD()">Details</button>
            </div>
        </div>
        <div id="accountAD" class="accountAD" style="display: none">
            <h3>Chequing Account</h3>
              <h4>Account No. </h4><h4 id="chqngno"> ${hs1[0].accountNo}</h4>
                    <h4>Total Available Amount: ${sum1}</h4> 
 <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>

                        <c:forEach items="${hs1}"  var="item">
                            <tr>
                                 <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>
                    </table>
            <button class="button1" onclick="summary()">Summary</button>
        </div>

        <div id="accountBD" class="accountAD" style="display: none">
            <h3>Investment Account</h3>
                <h4>Account No. </h4><h4 id="invstno">${hs2[0].accountNo}</h4>
                    <h4>Total Available Amount: ${sum2}</h4> 
 <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>

                        <c:forEach items="${hs2}"  var="item">
                            <tr>
                                 <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>
                    </table>
            <button class="button1" onclick="summary()">Summary</button>
        </div>

        <div id="accountCD" class="accountAD" style="display: none">
            <h3>Credit Account</h3>
           <h4>Account No. </h4><h4 id="crdtno"> ${hs3[0].accountNo}</h4>
                    <h4>Total Available Amount: ${MA}</h4> 
                    <h4>Total money owe: ${sum3}</h4> 
                    <h4>Minimum Payment Due: ${MP}</h4>
                    <h4>Due Date: ${DD}</h4>
            <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>

                        <c:forEach items="${hs3}"  var="item">
                            <tr>
                                 <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>
                    </table>
            <button class="button1" onclick="summary()">Summary</button>
        </div>
        <div id="accountDD" class="accountAD" style="display: none">
            <h3>Saving Account</h3>
           <h4>Account No. </h4><h4 id="svngno"> ${hs4[0].accountNo}</h4>
                    <h4>Total Available Amount: ${sum4}</h4>
            <table style="width: 50%">
                        <tr>
                            <th>Date</th>
                            <th>Purchase</th>
                            <th>Amount</th>
                        </tr>

                        <c:forEach items="${hs4}"  var="item">
                            <tr>
                                 <td>${item.date}</td>
                                <td>${item.purchase}</td>
                                <td>${item.amount}</td>
                            </tr>
                        </c:forEach>
                    </table>
            <button class="button1" onclick="summary()">Summary</button>
        </div>
    </body>
</html>
