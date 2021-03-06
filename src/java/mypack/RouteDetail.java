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
public class RouteDetail extends HttpServlet {

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         ArrayList<Route> rlist = new ArrayList<Route>();
      
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
            HttpSession session = request.getSession();
            String var = (String) session.getAttribute("username");
            
            
            
            PreparedStatement pst = conn.prepareStatement("Select * from Route_details where id="+var+"");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            
                Route r = new Route();
                r.id=rs.getString(1);
                r.route_id=rs.getString(2);
                r.stop1=rs.getString(3);
                r.stop2=rs.getString(4);
                r.stop3=rs.getString(5);
                r.stop4=rs.getString(6);
                r.Arrival1=rs.getString(7);
                r.Arrival2=rs.getString(8);
                r.Arrival3=rs.getString(9);
                r.Arrival4=rs.getString(10);
                r.Dep1=rs.getString(11);
                r.Dep2=rs.getString(12);
                r.Dep3=rs.getString(13);

                
                rlist.add(r);


            }
            request.setAttribute("routelist",rlist);
    conn.close();

    RequestDispatcher rd=request.getRequestDispatcher("RouteDetails.jsp");
    rd.forward(request,response);
            
            
       
            

        

             
            

            } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


     }
}
