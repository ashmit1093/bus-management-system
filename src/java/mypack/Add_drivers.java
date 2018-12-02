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
public class Add_drivers extends HttpServlet {

     @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String m = request.getParameter("-");
        String n = request.getParameter("driver_id");
        String o = request.getParameter("driver_name");
        String p = request.getParameter("driver_number");
        String q = request.getParameter("driver_blood_group");
        String r = request.getParameter("driver_fam_contact");
        String s = request.getParameter("bus_route");
        String t = request.getParameter("bus_number");
        String u = request.getParameter("bus_capacity");
        
          if (n.isEmpty() || o.isEmpty() || p.isEmpty() || q.isEmpty() || r.isEmpty() || s.isEmpty() || t.isEmpty() || u.isEmpty()) 
          {
              
                out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                out.println("<script>");
                out.println("$(document).ready(function(){");
                out.println("swal('Please fill All Details',' ','error');");
                out.println("});");
                out.println("</script>");
                RequestDispatcher rd = request.getRequestDispatcher("AddDrivers.jsp");
                rd.include(request,response);        
            }
        
          else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
           
            
            
            
                String sql_query = "INSERT INTO driver_detail values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql_query);
           
                pst.setString(1,m);
                pst.setString(2,n);
                pst.setString(3,o);
                pst.setString(4,p);
                pst.setString(5,q);
                pst.setString(6,r);
                pst.setString(7,s);
                pst.setString(8,t);
                pst.setString(9,u);
            
                int i = pst.executeUpdate();
                if(i>0)
                {
                    out.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js'></script>");
                    out.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>");
                    out.println("<script>");
                    out.println("$(document).ready(function(){");
                    out.println("swal('Driver Added',' ','success');");
                    out.println("});");
                    out.println("</script>");
                    RequestDispatcher rd = request.getRequestDispatcher("adminLanding.jsp");
                    rd.include(request,response);
                }
            }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            }   
        }
     }
}
        


     
 
