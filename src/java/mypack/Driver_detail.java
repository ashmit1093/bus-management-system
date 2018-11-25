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
public class Driver_detail extends HttpServlet {

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         ArrayList<Drivers> dlist = new ArrayList<Drivers>();
      
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
            HttpSession session = request.getSession();
            String var = (String) session.getAttribute("username");
            
            
            
            PreparedStatement pst = conn.prepareStatement("Select * from driver_detail where id="+var+"");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
               Drivers d = new Drivers();
               d.driver_id=rs.getString(2);
               d.driver_name=rs.getString(3);
               d.driver_number=rs.getString(4);
               d.driver_blood_group=rs.getString(5);
               d.driver_fam_contact=rs.getString(6);
               d.bus_route=rs.getString(7);
               d.bus_number=rs.getString(8);
               d.bus_capacity=rs.getString(9);
               
               dlist.add(d);
             
        
            }
            request.setAttribute("driverlist",dlist);
    conn.close();

    RequestDispatcher rd=request.getRequestDispatcher("DriverDetails.jsp");
    rd.forward(request,response);
          
            

            
            
       
            

        

             
            

            } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


     }
}
