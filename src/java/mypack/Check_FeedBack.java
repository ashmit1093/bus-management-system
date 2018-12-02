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
public class Check_FeedBack extends HttpServlet {

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         ArrayList<FeedBack> flist = new ArrayList<FeedBack>();
      
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
            HttpSession session = request.getSession();
            String var = (String) session.getAttribute("username");
            
            
            
            PreparedStatement pst = conn.prepareStatement("Select * from feedback_form");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                
               FeedBack f = new FeedBack();
               f.id=rs.getString(1);
               f.email=rs.getString(2);
               f.teatxarea=rs.getString(3);

             
               
               flist.add(f);
             
        
            }
            request.setAttribute("feedback",flist);
    conn.close();

    RequestDispatcher rd=request.getRequestDispatcher("AdminFeedBack.jsp");
    rd.forward(request,response);
          
            

            
            
       
            

        

             
            

            } 
        catch (ClassNotFoundException | SQLException e) {
           
        }


     }
}
