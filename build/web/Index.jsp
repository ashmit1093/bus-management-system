<%-- 
    Document   : newjsp
    Created on : 15 Nov, 2018, 10:23:55 PM
    Author     : ashmitbakshi
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      
         <script>   
            window.history.forward(0);
            
        </script>
        
         <script src="https://use.fontawesome.com/7ab33ef109.js"></script>
        <!--Import Google Icon Font-->
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!--Import materialize.css-->
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

        <!--Let browser know website is optimized for mobile-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         

    <style>
     
        .login{
            margin-top: 20px;
        }
  
        ul.dropdown-content.select-dropdown li span {
            color: #808080;
        }
        nav {
            height: 60px;
            line-height: 55px;
        }
        
        .logo{
            height:55px;
            width:55px;
        }
        body {
            display: flex;
            min-height: 100vh;
            flex-direction: column;
        }
        main {
            flex: 1 0 auto;
        }
        html{
            line-height: 1.5;
        }
    </style>
    
    <title>Chitakara Bus Management</title>
    <link rel="icon" type="image/png" href="LOGO2.PNG" />
    
    
    </head>
    <body>
    
        <%
       
        %>
        <header>
            <div class="navbar-fixed">
                <nav class="nav-wrapper blue-grey darken-2">
                    
                    <div class="container">
                        <a href="#" class="sidenav-trigger" data-target="mobile-links">
                            <i class="material-icons">menu</i>
                        </a>
                    </div>
                    <div class="container">
                        <ul class="right hide-on-med-and-down">
                            <li class="waves-effect waves-light">
                                <a class="waves-effect waves-light  modal-trigger  center modal-close" href="#modal1">About
                                    <i class="material-icons white-text left ">info</i>
                                </a>
                                <div id="modal1" class="modal">
       
                                    <div class="modal-content">
                                        <h4 class="black-text center">About Chitkara University HP</h4>
                                        <p class="black-text fow-text">
                                        Chitkara University in Himachal Pradesh has been founded by Dr. Ashok Chitkara and Dr. Madhu Chitkara 
                                        who have been passionate teachers for more than 40 years now. Since inception, Chitkara University has 
                                        been different. Our students have been different. So are our faculty, our academic strengths and our 
                                        outlook on teaching and learning.Within a decade, most of our academic programs are ranked in top 50 
                                        programs in the country. The unique difference being that Chitkara University has been established and
                                        managed by passionate academicians with the sole mission of making each and every student industry-ready.                   
                                        </p>
                                    </div>
                                    <div class="modal-footer">
                                        <a href="#!" class="modal-close waves-effect waves-green btn blue-grey lighten-1 black-text ">Close</a>
                                    </div>
                              
                                </div>
                            </li>
                            
                            <li class="waves-effect waves-light">
                                <a class="waves-effect waves-light  modal-trigger  center modal-close" href="#modal3">Contact Us
                                  <i class="material-icons white-text left ">contacts</i>
                                </a>
    
                                <div id="modal3" class="modal">
                                    <div class="modal-content">
                                        
                                        <h4 class="black-text center">Contact</h4>
                                        <ul class="collection white">
                                            <li class="collection-item black-text">For more information
                                              give a miss call on
                                            <b>1800 267 1999</b>
                                            </li>
                                            <br>
                                            <li class="collection-item black-text">Admission Helpline
                                              <b>+91 9501105714 ,  
                                              +91 9501105715</b>
                                            </li>
                                            <br>
                                            <li class="collection-item black-text">Delhi & NCR
                                              please call on
                                              <b>+91 9599368734</b>
                                            </li>
                                        </ul>
                                    </div>
                                    
                                    <div class="modal-footer">
                                        <a href="#!" class="modal-close waves-effect waves-green btn-flat blue-grey lighten-1 black-text ">Close</a>
                                    </div>
                                  
                                  </div>
                                 
                            </li>
                
                        </ul>
                    </div>
                </nav>
            </div>
        
            <ul class="sidenav" id = "mobile-links">
                <li>
                    
                    <a class="waves-effect waves-light  modal-trigger" href="#modal2">About
                        <i class="material-icons black-text left ">info</i>
                    </a>
                    <div id="modal2" class="modal">
                        <div class="modal-content">
                            <h4 class="black-text center">About Chitkara University HP</h4>
                            <p class="black-text fow-text">
                                Chitkara University in Himachal Pradesh has been founded by Dr. Ashok Chitkara and Dr. Madhu Chitkara 
                                who have been passionate teachers for more than 40 years now. Since inception, Chitkara University has
                                been different. Our students have been different. So are our faculty, our academic strengths and our 
                                outlook on teaching and learning.Within a decade, most of our academic programs are ranked in top 50 
                                programs in the country. The unique difference being that Chitkara University has been established and
                                managed by passionate academicians with the sole mission of making each and every student industry-ready.                   
                            </p>
                        </div>
                        <div class="container">
                            <div class="modal-footer">
                                <a href="#!" class="modal-close waves-effect waves-green btn-flat blue-grey lighten-1 black-text ">Close</a>
                            </div>
                        </div>
                    </div>
                    
                </li>
                    
                    
                           
                <li>
                    
                    <a class="waves-effect waves-light  modal-trigger" href="#modal4">Contact Us
                        <i class="material-icons black-text left ">contacts</i>
                    </a>
                    <div id="modal4" class="modal">
                        <div class="modal-content">
                            <h4 class="black-text center">Contact</h4>
                            <ul class="collection white">
                                <li class="collection-item black-text">For more information give a miss call on<b>1800 267 1999</b></li>
                                <br>
                                <li class="collection-item black-text">Admission Helpline <b>+91 9501105714 , +91 9501105715</b></li>
                                <br>
                                <li class="collection-item black-text">Delhi & NCR please call on<b>+91 9599368734</b></li>
                            </ul>
                        </div>
                        <div class="container">
                            <div class="modal-footer">
                                <a href="#!" class="modal-close waves-effect waves-green btn-flat blue-grey lighten-1 black-text ">Close</a>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </header> 
        
        <form action="LoginServlet2" method="post">
            <div class="row login">
                <div class="col s12  l4 offset-l4 ">
                    <div class="card z-depth-4 ">
                        <div class="card-action blue-grey darken-1 center">
                            <img src="CU.png" class="responsive-img">
                        </div>
                    
                        <div class="card-content">
                            <div class="input-field black-text col s12 ">
                                <i class="material-icons prefix ">account_circle</i>
                                <label for="username">Username</label>
                                <input name ="id"type="text"id="username" data-length="10" class="validate">
                            </div>
                        </div>

                    
                    
                        <div class="card-content">
                    
                            <div class="input-field back-text col s12">
                            
                                <i class="material-icons prefix ">lock</i>
                                <label for="pass">Password</label>
                                <input type="password"id="pass" name="pass">
                            
                            </div>    
                        </div>
                        


                        <div class="card-content">
                            <div class="input-field black-text col s12 ">
                            
                                <i class="material-icons prefix ">view_list</i>
                                <label>Institute</label><br>
                                <select>
                                    <option value="1">CSOET</option>>
                               
                              
                                </select>
                            </div>
                        </div>
                        <div class="card-content center">
                            <div class="input-field ">
                           
                                <button class="btn-large blue-grey darken-1 black-text z-depth-2 waves-effect waves-light center">Login
                                   <i class="fa fa-sign-in right"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>  
        </form>
        
        
        <footer class="white-text blue-grey darken-4 " style="position: fixed;bottom:0px;left:0;width:100%;height: 40px;">
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
                $('input#username, textarea#textarea2').characterCounter();
            });
            $(document).ready(function(){
                $('.modal').modal();
            });
            $(document).ready(function(){
                swal ("Incorrect username or password"," ","error")
            });
        </script>
          
    </body>
</html>

