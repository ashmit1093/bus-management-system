/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

import com.oracle.jrockit.jfr.DataType;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static jdk.nashorn.internal.runtime.Debug.id;
import static org.omg.CORBA.AnySeqHelper.id;
import static org.omg.CORBA.ShortSeqHelper.id;

/**
 *
 * @author ashmitbakshi
 */
public class FeedBack_Form extends HttpServlet {

     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        String n = request.getParameter("id");
        String o = request.getParameter("email");
        String p = request.getParameter("textarea");


        
          if (n.isEmpty() || o.isEmpty() || p.isEmpty() ) {
              
                    
             
            RequestDispatcher rd = request.getRequestDispatcher("FeedBack.jsp");
            
            rd.include(request, response);
          }
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
           
            
            
            
           String sql_query = "INSERT INTO feedback_form values(?,?,?)";
           PreparedStatement pst = conn.prepareStatement(sql_query);
           
            pst.setString(1,n);
            pst.setString(2,o);
            pst.setString(3,p);
 

            
            int i = pst.executeUpdate();
            if(i>0)
            {
                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal('FeedBack Submitted',' ','success');");
                out.println("});");
                out.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("FeedBack.jsp");
                rd.include(request,response);
            }
          

        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        


     }
}
