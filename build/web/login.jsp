<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <style type = "text/css">
            body{
                background-color:  #DEE0D1;
                background-size: cover;
                 background-image: url(one.jpg);
            }	

            .one{
                position: absolute;
                top:5%;
                left: 30%;
                width:500px;
                height:300px; 
                background-color: rgba(0,0,0,0.5);
                margin: 0 auto;
                margin-top: 300px;
                padding-top: 8px;
                padding-left: 50px;
                border-radius: 15px;
                color:white;
                font-weight: bolder;
                box-shadow: inset -6px -6px rgba(0,0,0,0.5); 
                font-size:18px;

            }

            .one input[type="text"]{
                width:200px;
                height: 35px;
                border:0;
                border-radius: 5px;
                padding-left:5px;
            }

            .one input[type="submit"]{

                width:100px;
                height:35px;
                border:0;
                border-radius:5px;
                background-color:skyblue;
                font-weight:bolder;

            }

        </style>
    </head>

    <body> 
        <div class = "one">
            <h2>Login</h2><br>
            <form action="loginSServlet" method="POST">
                <i id="Wusps" style="color:red;display: ${WUP}" >You Entered Wrong Username/Password</i><br>
                Username/ : &nbsp;  <input type = "text" placeholder = "Enter your name" name="userName"><br>
                Card Number<br><br>
                Password : &nbsp;  <input type = "password" placeholder = "Enter your pasword" name="password"><br><br>
                <input type = "submit" value = "Login" >
            </form>
        </div>	
    </body>

</html>


