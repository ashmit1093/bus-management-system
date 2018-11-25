/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ashmitbakshi
 */
public class LoginServlet2 extends HttpServlet {

     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
            PreparedStatement pst = conn.prepareStatement("Select * from login_credentials");
    
            ResultSet rs = pst.executeQuery();
             int x = 0;

                while (rs.next()) {

                    if ((rs.getString("id").equals(id)) && rs.getString("pass").equals(pass)) {

                        String stp = rs.getString("roleDb");

                        if (stp.equals("admin")) {

                            x = 1;

                            break;

                        } else if(stp.equals("teacher")) {

                            x = 2;

                            break;

                        }
                        else if(stp.equals("student"))
                        {
                            x=3;
                        }

                    }

                }


                if(x==3){
                HttpSession session = request.getSession();
                session.setAttribute("username",id);
                session.setMaxInactiveInterval(10*60);
                response.sendRedirect("landingjsp.jsp");
                }
                else if(x==1)
                {
                HttpSession session = request.getSession();
                session.setAttribute("username",id);
                session.setMaxInactiveInterval(10*60);
                response.sendRedirect("adminLanding.jsp");
                }
                else if(x==2)
                {
                HttpSession session = request.getSession();
                session.setAttribute("username",id);
                session.setMaxInactiveInterval(10*60);
               
                response.sendRedirect("Teacher.jsp");  
                }
               else {
                    out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                    out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                    out.println("<script>");
                    out.println("$(document).ready(function(){");
                    out.println("swal('incorrect id or password!',' ','error');");
                    out.println("});");
                    out.println("</script>");
                    RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
                    rd.include(request,response);
                } 
                
                
                

            

            }
        
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


     }
}
