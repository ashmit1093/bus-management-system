<%-- 
    Document   : FeedBack
    Created on : 21 Nov, 2018, 11:54:06 PM
    Author     : ashmitbakshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="https://use.fontawesome.com/7ab33ef109.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
        
        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chitkara Bus Management</title>
         <link rel="icon" type="image/png" href="LOGO2.PNG" />
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
                        <ul class="left hide-on-med-and-down">
                            <li><a class ="waves-effect waves-light tooltipped"  data-position="bottom" data-tooltip="Home" href="adminLanding.jsp">
                                    <i class="material-icons" style="font-size:35px;">arrow_back</i>
                                </a>
                            </li>
                        </ul>
                         
                    </div>
                </nav>
            </div>
        </header>    
        
        <div class="center-align conatiner">
            <div class="row">
               
                <i class="material-icons prefix center-align medium">person_add</i>
                <h5 class="flow-text">Add-New-Drivers </h5>  
                    <div class="col s12 m10 l4 offset-l4">
                         
                        <form action="Add_drivers" method="post">
                            <div class="input-field">
                                
                                <input type="text" name="driver_id" id="id">
                                <label for="id">Driver-Id</label>
                            </div>
                             <div class="input-field">
                               
                                <input type="text" name="driver_name" id="name" class="validate">
                                <label for="name">Driver-Name</label>
                            </div>
                            <div class="input-field">
                               
                                <input type="text" name="driver_number" id="number" class="validate">
                                <label for="number">Driver-Contact</label>
                            </div>
                            <div class="input-field">
                               
                                <input type="text" name="driver_blood_group" id="blood" class="validate">
                                <label for="blood">Driver-Blood-Group</label>
                            </div>
                            <div class="input-field">
                               
                                <input type="text" name="driver_fam_contact" id="family" class="validate">
                                <label for="family">Driver-Family-Contact</label>
                            </div>
                            <div class="input-field">
                               
                                <input type="text" name="bus_route" id="route" class="validate">
                                <label for="route">Bus-Route_Number</label>
                            </div>
                            <div class="input-field">
                               
                                <input type="text" name="bus_number" id="bus_number" class="validate">
                                <label for="bus_number">Bus-Number</label>
                            </div>
                            <div class="input-field">
                               
                                <input type="text" name="bus_capacity" id="capacity" class="validate">
                                <label for="capacity">Bus-Capacity</label>
                            </div>
                            <div class="input-field">
                                <button class="btn waves-effect waves-light blue-grey" id="button-a">Submit</button>
                            </div>
                        </form>
                    </div>   
                </div>
            </div>
        </div>
        
        
                
 
            
        <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
        <script>
            $(document).ready(function(){
                $('.sidenav').sidenav();
            });
            
            $(document).ready(function(){
                $('select').formSelect();
            });
            
            $(document).ready(function() {
                $(' icon_prefix2').characterCounter();
            });
            $(document).ready(function(){
                $('.modal').modal();
            });
              $(document).ready(function() {
                $('input#input_text, textarea#textarea2').characterCounter();
            });
            $(document).ready(function(){
                swal ("Driver Added"," ","success");
            });
            
            $(document).ready(function(){
                swal ("Please Fill All the Details"," ","error");
            });
             $(document).ready(function(){
                $('.tooltipped').tooltip();
                });
        </script>
    </body>
</html>
