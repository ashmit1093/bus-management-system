<%-- 
    Document   : Guidelines
    Created on : 22 Nov, 2018, 5:51:01 PM
    Author     : ashmitbakshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://use.fontawesome.com/7ab33ef109.js"></script>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
        <style>
            body{
                background-color: #fafafa;
            }

        </style>
        
        <title>Chitakara Bus Management</title>
        <link rel="icon" type="image/png" href="LOGO2.PNG" />
    </head>
    <body>
            
        <%
            
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //HTTP 1.1
            
            response.setHeader("Pragma", "no-cache");//HTTP 1.0s
            
            response.setHeader("Expires", "0");
            
            
            
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("newjsp.jsp");
            }
        %>
            <header>
            <div class="navbar-fixed">
                <nav class="nav-wrapper blue-grey darken-3">
                    <div class="container">
                        <ul class="left hide-on-med-and-down">
                            <li><a class ="waves-effect waves-light tooltipped"  data-position="bottom" data-tooltip="Home" href="landingjsp.jsp">
                                    <i class="material-icons" style="font-size:35px;">arrow_back</i>
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>
        </header> 
        <div class="container">
            <h4 class="center-align">DISCIPLINE : TRAVELLING IN UNIVERSITY BUSES<h4>
        </div>
        
        <div class="container">
            
             
            <ul class="collapsible popout">
   
                <li>
                    <div class="collapsible-header"><i class="fa fa-clock-o" aria-hidden="true"></i>Time Management</div>
                    <div class="collapsible-body"><span>Students and staff are required to be present at designated stops before schedule time.</span></div>
                </li>
                
                <li>
                    <div class="collapsible-header"><i class="fa fa-ticket" aria-hidden="true"></i>Valid Pass</div>
                    <div class="collapsible-body"><span>Students with valid Bus Pass /Temporary Pass issued by Transport Department will only be allowed to travel by buses plying on the designated routes.</span></div>
                </li>
                
                <li>
                    <div class="collapsible-header"><i class="fa fa-smile-o" aria-hidden="true"></i>Stay Calm</div>
                    <div class="collapsible-body"><span>No one will do disembarking from the running bus. Students should NOT lean out from windows, when they are travelling in the Bus.</span></div>
                </li>
                <li>
                    <div class="collapsible-header"><i class="fa fa-laptop" aria-hidden="true"></i>Stay Alert</div>
                    <div class="collapsible-body"><span>Everyone is required to take care of their belongings e.g. purse, laptop, mobile phone, books and any other valuable things. Please do check before you exit the bus to make sure you are not leaving anything important behind..</span></div>
                </li>
                <li>
                    <div class="collapsible-header"><i class="fa fa-user" aria-hidden="true"></i>For The V.I.P.s</div>
                    <div class="collapsible-body"><span>First two/three row are reserved for University staff.</span></div>
                </li>
                <li>
                    <div class="collapsible-header"><i class="fa fa-exclamation-triangle" aria-hidden="true"></i>Strictly Prohibited</div>
                    <div class="collapsible-body"><span>Ragging in any form is STRICTLY PROHIBITED. Any activity if noticed should immediately be brought to the notice of Management.</span></div>
                </li>
                <li>
                    <div class="collapsible-header"><i class="fa fa-bus" aria-hidden="true"></i>Do Not Damage</div>
                    <div class="collapsible-body"><span>Please do not damage Seats and other fixtures in the bus.</span></div>
                </li>
            </ul>
        </div>
        <footer class=" page-footer blue-grey darken-4 navbar-fixed" style="position: fixed;bottom:0px;left:0;width:100%;">
           <div class="footer-copyright">
            <div class="container center-align">
                &copy; 2018 CHITKARA UNIVERSITY
            </div>
          </div>
        </footer>
                
        
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(document).ready(function(){
                $('.collapsible').collapsible();
            });
            $(document).ready(function(){
                $('.tooltipped').tooltip();
            });
        </script>
    </body>
</html>
