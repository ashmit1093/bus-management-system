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
public class StudentDetail extends HttpServlet {

     @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         ArrayList<Person> list = new ArrayList<Person>();
      
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project?useSSL=false&allowPublicKeyRetrieval=true", "root", "Ashking123");
             
            HttpSession session = request.getSession();
            String var = (String) session.getAttribute("username");
            
            
            
            PreparedStatement pst = conn.prepareStatement("Select * from studet_details where id="+var+"");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            
                Person p = new Person();
                p.id=rs.getString(1);
                p.f_name=rs.getString(2);
                p.l_name=rs.getString(3);
                p.gender=rs.getString(4);
                p.s_status=rs.getString(5);
                p.age=rs.getInt(6);
                p.father_name=rs.getString(7);
                p.mother_name=rs.getString(8);
                p.email_student=rs.getString(9);
                p.mobile_student=rs.getString(10);
                p.date_admn=rs.getString(11);
                p.blood_group=rs.getString(12);
                p.parent_email=rs.getString(13);
                p.father_number=rs.getString(14);
                p.country=rs.getString(15);
                p.state=rs.getString(16);
                p.city=rs.getString(17);
                p.pin_code=rs.getInt(18);
                p.father_occ=rs.getString(19);
                p.mother_occ=rs.getString(20);
                
                list.add(p);


            }
            request.setAttribute("personlist",list);
    conn.close();

    RequestDispatcher rd=request.getRequestDispatcher("StudentDetails.jsp");
    rd.forward(request,response);
            
            
       
            

        

             
            

            } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }


     }
}
