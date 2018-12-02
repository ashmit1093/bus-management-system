<%-- 
    Document   : DriverDetails
    Created on : 16 Nov, 2018, 11:03:54 AM
    Author     : ashmitbakshi
--%>

<%@page import="mypack.FeedBack"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

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
        
            tr:hover 
            {
                background-color:#cfd8dc;
            }
            table td
            {
                border-left: 1px solid #000;
                border-right: 1px solid #000;
            }
            table th {
                background-color: #90a4ae!important;
                color: black!important;
                border-left: 1px solid black;
                border-right: 1px solid black;
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
            ArrayList<FeedBack> feedback=(ArrayList)request.getAttribute("feedback");
            Iterator it = feedback.iterator();
   
            
        %>
        <header>
            <div class="navbar-fixed">
                
                
                <nav class="nav-wrapper blue-grey darken-3">
                    <div class="container">
                        <ul class="left hide-on-small-only">
                            <li><a class ="waves-effect waves-light tooltipped"  data-position="bottom" data-tooltip="Home" href="adminLanding.jsp">
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
                <div class='col s12 m12 l12 '>
                    <table class=" white z-depth-4 centered  striped responsive-table" style="border:1px solid black;">
                        <tbody>
                   
                            <h5 class="center-align" style="font-size:25px;">FeedBack 
                                <i class="fa fa-id-card-o" aria-hidden="true"></i>
                            </h5>
                    
                            <tr>
                        
                                <th class="flow-text center-align"><strong>Id </strong></th>
                                <th class="flow-text center-align"><strong>E-mail </strong></th>
                                <th class="flow-text center-align"><strong>FeedBack </strong></th>
                      
                               
                        
                            </tr>
                            <%
                            while(it.hasNext())
                            {
                
                                FeedBack f =(FeedBack)it.next();
                            %>

                                       
                            <tr>
                                <td class="flow-text"><%=f.id%></td>
                                <td class="flow-text"><%=f.email%></td>
                                <td class="flow-text"><%=f.teatxarea%></td>
                                
                                
                
                            </tr>
                                
                            <%
                                }
                            %>

                            </tbody>
                        </table>
                    </div>
                </div>   
            </div>                    
      
          
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
                        
        <footer class="white-text blue-grey darken-4 " style="position: fixed;bottom:0px;left:0;width:100%;height:20px; font-size: 12px;">
           <div class="footer-copyright">
            <div class="container center-align">
                &copy; 2018 CHITKARA UNIVERSITY
            </div>
          </div>
        </footer>
    </body>
</html>