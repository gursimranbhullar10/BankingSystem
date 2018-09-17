<HTML>
    <head>
        <style type = "text/css">
            body{

                background-image: url(one.jpg);
                background-color: #DEE0D1;
                background-size: cover;
            }	

            .one{
                position: absolute;
                top: 30%;
                left: 15%;
                border: solid black;
                background-color: rgba(0,0,0,0.5);
                margin: 0 auto;
                height: 30%;
                width: 30%;
                border-radius: 15px;
                color:white;
                font-weight: bolder;
                box-shadow: inset -6px -6px rgba(0,0,0,0.5); 
                font-size:18px;

            }
            .options{
                display: inline-block;
            }
            .two{
                position: absolute;
                top: -10%;
                right: 15%;
                border: solid black;
                height: 30%;
                width: 30%;
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
            .button1{
                position: absolute;
                top: 30%;
                right: 32%;
                left: 32%;
                background:#cc0000;
                border-radius: 10px;
                text-shadow: 1px 1px 3px #666666;
                font-family: Georgia;
                color: #ffffff;
                font-size: 20px;
                padding: 10px 30px 10px 30px;
            }
            .button1:hover{
                background: #d9345d;
            }
        </style>
    </head>   
    <body>
        <div class="options">
            <div class = "one">
                <form action="loginAccess">
                    <h4 align="centre">Have Account</h4>
                    <BUTTON type="submit" class="button1">Login</BUTTON>
                </form>
            </div>


            <div class = "two">
                <form action="registerAccess" >
                    <h4 align="center">New to online banking? </H4><br><br>
                    <BUTTON type="submit" class="button1">Activate</BUTTON>
                </form>
            </div>
        </div>
    </body>
</HTML> 
