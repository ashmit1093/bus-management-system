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
public class Admindetails extends HttpServlet {

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         ArrayList<Admin> alist = new ArrayList<Admin>();
      
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
            HttpSession session = request.getSession();
            String var = (String) session.getAttribute("username");
            
            
            
            PreparedStatement pst = conn.prepareStatement("Select * from admin_details where admin_id="+var+"");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            
                Admin a = new Admin();
                a.admin_id=rs.getString(1);
                a.admin_name=rs.getString(2);
                a.admin_email=rs.getString(3);
                a.admin_number=rs.getString(4);
                a.admin_country=rs.getString(5);
                a.admin_state=rs.getString(6);
                a.admin_city=rs.getString(7);
                a.admin_pincode=rs.getString(8);
                
                alist.add(a);


            }
            request.setAttribute("adminlist",alist);
    conn.close();

    RequestDispatcher rd=request.getRequestDispatcher("admindetails.jsp");
    rd.forward(request,response);
            
            
       
            

        

             
            

            } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


     }
}
