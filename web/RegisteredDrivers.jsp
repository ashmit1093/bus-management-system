<%-- 
    Document   : DriverDetails
    Created on : 16 Nov, 2018, 11:03:54 AM
    Author     : ashmitbakshi
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="mypack.Drivers"%>
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
            ArrayList<Drivers> driver=(ArrayList)request.getAttribute("driverlist");
            Iterator it = driver.iterator();
  

            
        %>
        
        <header>
            <div class="navbar-fixed">
                
                
                <nav class="nav-wrapper blue-grey darken-3">
                    <div class="container">
                        <ul class="right hide-on-small-only">
                            <li><a class ="waves-effect waves-light tooltipped"  data-position="bottom" data-tooltip="Home" href="adminLanding.jsp">
                                    <i class="material-icons" style="font-size:35px;">arrow_back</i>
                                </a>
                            </li>
                        </ul>
                         <a href="#" data-target="slide-out" class="sidenav-trigger show-on-large show-on-medium-and-down"><i class="fa fa-bars fa-2x"></i></a>
                    </div>
                </nav>
            </div>
            <ul id="slide-out" class="sidenav">
                
                <li>
                    <div class="user-view">
                        <div class="background blue-grey lighten-4">
                     
                        </div>
                        <i class="fa fa-user-circle-o fa-4x black-text"></i>

                        <span class=" name">${name}</span>
                        <span class="id">${username}</span>
                 
                    </div>
                </li>
                
                <li >
                  
                    <a class="waves-effect container " href="AddDrivers.jsp">Add-Drivers
                        <i class="material-icons right">add</i>
                    </a>
                </li>

             
                
            </ul>
        </header>
        
        <h5 class="center-align" style="font-size:25px;">Registered Driver Details 
            <i class="fa fa-id-card-o" aria-hidden="true"></i>
        </h5>
 
 
            
        <div class="container">
            <div class="row">
                <div class='col s10 m12 l12 '>
                    <table class=" white z-depth-4 centered  striped responsive-table" style="border:1px solid black;">
                        
                   
                           
                        
                            <tr>
                        
                                <th class="flow-text"><strong>Driver-ID </strong></th>
                                <th class="flow-text"><strong>Driver-Name </strong></th>
                                <th class="flow-text"><strong>Driver-Number </strong></th>
                                <th class="flow-text"><strong>Driver-Family-Contact </strong></th>
                                <th class="flow-text"><strong>Driver-Blood-Group </strong></th>
                                <th class="flow-text"><strong>Bus-Route </strong></th>
                                <th class="flow-text"><strong>Bus-Number </strong></th>
                                <th class="flow-text"><strong>Bus-Capacity </strong></th>
                               
                        
                            </tr>
                            <%
                            while(it.hasNext())
                            {
                
                                Drivers d =(Drivers)it.next();
                            %>

                                       
                            <tr>
                                <td class="flow-text"><%=d.driver_id%></td>
                                <td class="flow-text"><%=d.driver_name%></td>
                                <td class="flow-text"><%=d.driver_number%></td>
                                <td class="flow-text"><%=d.driver_fam_contact%></td>
                                <td class="flow-text"><%=d.driver_blood_group%></td>
                                <td class="flow-text"><%=d.bus_route%></td>
                                <td class="flow-text"><%=d.bus_number%></td>
                                <td class="flow-text"><%=d.bus_capacity%></td>
                            </tr>
                                
                            <%
                                }
                            %>

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
                        
    
    </body>
</html>