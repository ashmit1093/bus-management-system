<%-- 
    Document   : StudentDetails
    Created on : 16 Nov, 2018, 10:54:55 AM
    Author     : ashmitbakshi
--%>

<%@page import="java.awt.print.Book"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="java.util.*"%>
<%@ page import="mypack.Person" %>
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
            table td 
            {
                border-left: 1px solid #000;
                border-right: 1px solid #000;
            }
            tr:hover {background-color:#cfd8dc;}
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
                
            ArrayList<Person> person = (ArrayList)request.getAttribute("personlist");
            Iterator it = person.iterator();
            while(it.hasNext())
            {
                Person p =(Person)it.next();
            
            
        %>
                
     
    
    </tr>
        <header>
            <div class="navbar-fixed">
                <nav class="nav-wrapper blue-grey darken-3 navbar-fixed">
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
                <div class='col s8 m12 l12 '>
                    <table class=" white z-depth-4 centered  striped" style="border:1px solid black;">
                        <tbody>
                   
                            <h5 class="center-align" style="font-size:25px;">Student Details 
                                <i class="fa fa-id-card-o" aria-hidden="true"></i>
                            </h5>
                    
                            <tr>
                        
                                <td class="flow-text"><strong>Student-ID </strong></td>
                                <td class="flow-text"><%=p.id%></td>
                        
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>First-Name </strong></td>
                                <td class="flow-text"><%=p.f_name%></td>
                        
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Last-Name </strong></td></b>
                                <td class="flow-text"><%=p.l_name%></td>
                        
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Student E-mail </strong></td>
                                <td class="flow-text"><%=p.email_student%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Student-Contact</strong></td>
                                <td class="flow-text"><%=p.mobile_student%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Student-Status</strong></td>
                                <td class="flow-text"><%=p.s_status%></td>
                            <tr>
                                <td class="flow-text"><strong>Student-Gender</strong></td>
                                <td class="flow-text"><%=p.gender%></td>
                            </tr>
         
                            <tr>
                                <td class="flow-text"><strong>Father-Name</strong></td>
                                <td class="flow-text"><%=p.father_name%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Father Occupation</strong></td>
                                <td class="flow-text"><%=p.father_occ%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Date-Of-Admission</strong></td>
                                <td class="flow-text"><%=p.date_admn%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Mother-Name</strong></td>
                                <td class="flow-text"><%=p.mother_name%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Mother-Occupation</strong></td>
                                <td class="flow-text"><%=p.mother_occ%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Parent's-Contact</strong></td>
                                <td class="flow-text"><%=p.father_number%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Parents's E-mail</strong></td>
                                <td class="flow-text"><%=p.parent_email %></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Student Blood-Group</strong></td>
                                <td class="flow-text"><%=p.blood_group%></td>
                            </tr>

                            <tr>
                                <td class="flow-text"><strong>Country</strong></td>
                                <td class="flow-text"><%=p.country%></td>
                            </tr>   
                            <tr>
                                <td class="flow-text"><strong>State</strong></td>
                                <td class="flow-text"><%=p.state%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>City</strong></td>
                                <td class="flow-text"><%=p.city%></td>
                            </tr>
                            <tr>
                                <td class="flow-text"><strong>Pin-Code</strong></td>
                                <td class="flow-text"><%=p.pin_code%></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>               
                        
  
        
   
       
        

        <%
            }
        %>

                        
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
                
        <footer class="white-text blue-grey darken-4 " style="position: fixed;bottom:0px;left:0;width:100%;height: 15px; font-size: 12px;">
           <div class="footer-copyright">
            <div class="container center-align">
                &copy; 2018 CHITKARA UNIVERSITY
            </div>
          </div>
        </footer>
            
        
    </body>
</html>
