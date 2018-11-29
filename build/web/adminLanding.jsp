<%-- 
    Document   : landingjsp
    Created on : 15 Nov, 2018, 10:48:10 PM
    Author     : ashmitbakshi
--%>

<%@page  language="java"contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
         
         
         <style>
             
             .card h5{
                 padding:10px 0px;
             }
             .card{
                 transition: .5s;
                 background: #eee; 
             }
             .card:hover i ,h5{
                   color: #64b5f6;
             }
             .card:hover {
                 transform: scale(1.03);
                 background: #fff;
             }
             .haha{
                 background-color: white;
             }
             .side-nav li>a {
                padding: 0 16px;
            }
            body{
                background: #eceff1;
            }
            
             


             
         </style>
    </head>
    
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
                        
                        <ul class="right hide-on-med-and-down">
                            <li><a class ="waves-effect waves-light tooltipped"  data-position="bottom" data-tooltip="Log Out" href="LogOutServlet2">
                                    <i class="material-icons" style="font-size:35px;">exit_to_app</i>
                                </a>
                            </li>
                        </ul>
                         <a href="#" data-target="slide-out" class="sidenav-trigger show-on-medium-and-down"><i class="fa fa-bars fa-2x"></i></a>
                    </div>
                </nav>
            </div>
            <ul id="slide-out" class="sidenav">
                
                <li>
                    <div class="user-view">
                        <div class="background blue-grey lighten-4">
                     
                        </div>
                        <i class="fa fa-user-circle-o fa-4x black-text"></i>

                        <br>
                        <span class="id">${username}</span>
                        
                 
                    </div>
                </li>
                <li>
                  
                    <a class="waves-effect container " href="LogOutServlet2">Sign Out
                        <i class="fa fa-sign-out fa-2x black-text"></i>

                    </a>
                </li>
             
                
            </ul>
        </header>
                

            
            

        
        
        
        
        <div class="container services">
            <h5 class="center black-text">Welcome Admin ${username} </h5>
            <div class="row">
                <div class="col s12 m6 l6 center-align">
                    
                    <div class="card z-depth-3">
                        <div class="card-content">
                            <i class="fa fa-user fa-5x" aria-hidden="true"></i>
                            <h5 class="">Admin Details</h5>

                        </div>
                        
                        <div class="card-action" >
                            <a href="detail" class="btn-floating btn-large btn tooltipped grey" data-position="bottom" data-tooltip="View">
                                    <i class="material-icons">add</i>
                            </a>
                        </div>
                    </div>
                    
                </div>
                
                <div class="col s12 m6 l6  center-align">
                    <div class="card z-depth-3">
                        <div class="card-content">
                            <i class="fa fa-id-card-o fa-5x"></i>
                            <h5> Registered Drivers</h5>
                          
                        </div>
                        
                        <div class="card-action" >
                            <a href="AdminDrivers" class="btn-floating btn-large btn tooltipped grey " data-position="bottom" data-tooltip="View">
                                <i class="material-icons">add</i>
                            </a>
                        </div>
                    </div>
                </div>
           
            
                <div class="col s12 m6 l6  center-align">
                        <div class="card z-depth-3">
                            <div class="card-content">
                                <i class="fa fa-bus fa-5x" aria-hidden="true"></i>
                                <h5> Registered Buses</h5>
                          
                            </div>
                        
                            <div class="card-action" >
                                <a href="AdminBus" class="btn-floating btn-large btn tooltipped grey" data-position="bottom" data-tooltip="View">
                                    <i class="material-icons">add</i>
                                </a>
                            </div>
                        </div>
                </div>
                
          
                <div class="col s12 m6 l6 center-align">
                 
                        <div class="card z-depth-3">
                            <div class="card-content">
                                <i class="fa fa-comment fa-5x" aria-hidden="true"></i>
                                <h5>Check  FeedBacks </h5>
                             
                            </div>
                        
                            <div class="card-action" >
                                <a href="#" class="btn-floating btn-large btn tooltipped grey" data-position="bottom" data-tooltip="View">
                                    <i class="material-icons">add</i>
                                </a>
                            </div>
                        </div>
                </div>
                               
                
       
                
            </div>
        </div>
        
            
            
            
        <footer class=" blue-grey darken-3 white-text navbar-fixed" style="position: fixed;bottom:0px;left:0;width:100%;height: 31.5px;">
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
    
</html>