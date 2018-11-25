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
                            <li><a class ="waves-effect waves-light tooltipped"  data-position="bottom" data-tooltip="Home" href="landingjsp.jsp">
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
                
                    <div class="col s12 l4 offset-l4">
                        <div class=" center">
                            
                            <h1>Get In Touch </h1>
                             <i class="fa fa-envelope-o fa-4x" aria-hidden="true"></i>
                            <p>
                                Suggestions / any problems regarding overloading, accident and rash driving
                                be intimated on following Numbers by bus coordinators and students.
                            </p>
                        </div>
                    </div>
                    <div class="col s12  l4 offset-l4">
                         
                        <form>
                            <div class="input-field">
                                <i class="material-icons prefix">person</i>
                                <input type="text" name="name" id="user">
                                <label for="user">Username</label>
                            </div>
                             <div class="input-field">
                                <i class="material-icons prefix">email</i>
                                <input type="email" name="email" id="email" class="validate">
                                <label for="email">E-mail</label>
                            </div>
                            <div class="input-field">
                               <i class="material-icons prefix">mode_edit</i>
                               <textarea id="textarea2" class="materialize-textarea" data-length="80"></textarea>
                               <label for="textarea2">Textarea</label>
                            </div>
                            <div class="input-field">
                                <button class="btn waves-effect waves-light blue-grey">Submit</button>
                            </div>
                        </form>
                    </div>   
                </div>
            </div>
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
                swal ("Incorrect username or password"," ","error")
            });
             $(document).ready(function(){
                $('.tooltipped').tooltip();
                });
        </script>
    </body>
</html>
