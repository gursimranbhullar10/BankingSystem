

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <style type = "text/css">
        body{
            background-color: #DEE0D1;
             background-image: url(ok.jpg);
        }
        .one{
            background-color: #CED7D6;
            width:550px;
            height: 450px

        }
        .two{
            background-color: #CED7D6; 
            width:550px;
            height: 450px
        }
        .three{
            background-color: #CED7D6; 
            width:550px;
            height: 450px
        }    

    </style>
    <body>
        <br><br><br>
    <center>
        <form action="registerServlet" method="POST">

            <div class="one">
                <div style="display:${WcarNum}">
                    <br>
                    <i style="color:red">Your Entered Credit Card Is Already Registered</i>
                </div>
                <h2>Enter your credit number</h2>
                <input type="text" name="cardNum" size="30" required/>
                <div style="display:${Wusername}">
                    <br>
                    <i style="color:red">Your Entered Username Is Already Registered</i>
                </div>
                <h2>Create a username</h2>
                <input type="text" name="username"size="30" required/>
                <h2>Create a password</h2>
                <input type="password" name="paswd"size="30"required/>
                <h2>Re-enter your password</h2>
                <input type="password" name="Repaswd"size="30" required/>
            </div>
            <br><br><br>

            <div class="two">
                <h1>Personal Information: </h1>
                <h2>Enter your first name</h2>
                <input type="text" name="firstName" size="30" required/>
                <h2>Enter your last name</h2>
                <input type="text" name="lastName" size="30" required/>
                <h2>Enter your address</h2>
                <input type="text" name="add"size="30"required/>
                <h2>Enter your city</h2>
                <input type="text" name="city" size="30" required/>
                <h2>Enter your Province</h2>
                <input type="text" name="prov" size="30" required/>
            </div>
            <br><br><br><br>
            <div class="three">
                <h1>Security: </h1> 
                <h2><select name="Q1">
                        <option value="1">What is your mother's Maiden name?</option>
                        <option value="2">What is your best friend's name?</option>
                        <option value="3">What is your first pet's name?</option>
                        <option value="4">In which city you was born?</option>
                        <option value="5">Which is your favorite animal?</option>
                    </select></h2>
                <input type="text" name="A1"size="50" required/><br><br>
                <select name="Q2">
                    <option value="1">What is your mother's Maiden name?</option>
                    <option value="2">What is your best friend's name?</option>
                    <option value="3">What is your first pet's name?</option>
                    <option value="4">In which city you was born?</option>
                    <option value="5">Which is your favorite animal?</option>
                </select><br>
                <input type="text" name="A2" size="50" required/><br><br>
                <select name="Q3">
                    <option value="1">What is your mother's Maiden name?</option>
                    <option value="2">What is your best friend's name?</option>
                    <option value="3">What is your first pet's name?</option>
                    <option value="4">In which city you was born?</option>
                    <option value="5">Which is your favorite animal?</option>
                </select><br>
                <input type="text" name="A3" size="50" required/>
                <br><br><br>
                <input type="submit" value="Submit" size="50"/>

            </div>
            <br><br><br>
        </form>
    </center>


</body>
</html>
