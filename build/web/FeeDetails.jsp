<%-- 
    Document   : FeeDetails
    Created on : 16 Nov, 2018, 11:08:26 AM
    Author     : ashmitbakshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Import Google Icon Font-->
        <script src="https://use.fontawesome.com/7ab33ef109.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chitkara Bus Management</title>
         <link rel="icon" type="image/png" href="LOGO2.PNG" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style>
            body
            {
                background: #eceff1;
            }
            table,th, td 
            {
                padding: 15px;
                text-align: left;
                font-size: 15px !important;
                
                
            }
            table td ,tr,th
            {
                border-left: 1px solid #000;
                border-right: 1px solid #000;
            }
            tr:hover 
            {
                background-color:#cfd8dc;
            }
            p{
                font-size: 15px!important;
            }
        </style>
    </head>
    <body>
        <%
            
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //HTTP 1.1
            
            response.setHeader("Pragma", "no-cache");//HTTP 1.0s
            
            response.setHeader("Expires", "0");
            
            
            
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("Index.jsp");
            }
        %>
        <header>
            <div class="navbar-fixed">
                
                
                <nav class="nav-wrapper blue-grey darken-3">
                    <div class="container">
                         <ul class="left hide-on-small-only">
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
            <div class="row">
                <div class='col s10 m12 l12 '>
                    <h5 class="center-align" style="font-size:25px;"> Fee Details 
                        <i class="fa fa-id-card-o" aria-hidden="true"></i>
                    </h5>
                    <table class="white centered striped z-depth-4" style="border:1px solid black;">
                        <thead>
                            <tr>
                                <th>Location</th>
                                <th>Annual-Fee-Structure</th>
                                <th>Six-Months-Fee-Structure</th>
                                
                            </tr>
                        </thead>

                        <tbody>
                            <tr>
                                <td>Dera-Bassi</td>
                                <td>22000</td>
                                <td>11000</td>
                                
                            </tr>
                            <tr>
                                <td>Dhakoli</td>
                                <td>19500</td>
                                <td>9750</td>
                                
                            </tr>
                            <tr>
                                <td>Panchkula</td>
                                <td>17800</td>
                                <td>8900</td>
                               
                            </tr>
                            <tr>
                                <td>Chandigarh</td>
                                <td>16400</td>
                                <td>8200</td>
                            </tr>
                            <tr>
                                <td>Housing Board</td>
                                <td>15900</td>
                                <td>7950</td>
                            </tr>
                            <tr>
                                <td>Pinjore</td>
                                <td>12000</td>
                                <td>6000</td>
                            </tr>
                            <tr>
                                <td>Kalka</td>
                                <td>11000</td>
                                <td>5500</td>
                            </tr>
                            <tr>
                                <td>Una</td>
                                <td>12500</td>
                                <td>6250</td>
                            </tr>
                        </tbody>
                    </table>
                </div>

            </div>
           
        </div>
        
        <footer class="white-text blue-grey darken-4 " style="position: fixed;bottom:0px;left:0;width:100%;height:20px; font-size: 12px;">
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
                $('.tooltipped').tooltip();
                });
              $(document).ready(function(){
                $('.sidenav')
                    .sidenav()
                    .on('click tap', 'li a', () => {
                $('.sidenav').sidenav('close');
                    });
                });
        </script>               
    </body>
</html>
