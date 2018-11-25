package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("      \n");
      out.write("         <script>   \n");
      out.write("            window.history.forward(0);\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("         <script src=\"https://use.fontawesome.com/7ab33ef109.js\"></script>\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         \n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("     \n");
      out.write("        .login{\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("  \n");
      out.write("        ul.dropdown-content.select-dropdown li span {\n");
      out.write("            color: #808080;\n");
      out.write("        }\n");
      out.write("        nav {\n");
      out.write("            height: 60px;\n");
      out.write("            line-height: 55px;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        .logo{\n");
      out.write("            height:55px;\n");
      out.write("            width:55px;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            display: flex;\n");
      out.write("            min-height: 100vh;\n");
      out.write("            flex-direction: column;\n");
      out.write("        }\n");
      out.write("        main {\n");
      out.write("            flex: 1 0 auto;\n");
      out.write("        }\n");
      out.write("        html{\n");
      out.write("            line-height: 1.5;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <title>Chitakara Bus Management</title>\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"LOGO2.PNG\" />\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        ");

       
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class=\"navbar-fixed\">\n");
      out.write("                <nav class=\"nav-wrapper blue-grey darken-2\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <a href=\"#\" class=\"sidenav-trigger\" data-target=\"mobile-links\">\n");
      out.write("                            <i class=\"material-icons\">menu</i>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                            <li class=\"waves-effect waves-light\">\n");
      out.write("                                <a class=\"waves-effect waves-light  modal-trigger  center modal-close\" href=\"#modal1\">About\n");
      out.write("                                    <i class=\"material-icons white-text left \">info</i>\n");
      out.write("                                </a>\n");
      out.write("                                <div id=\"modal1\" class=\"modal\">\n");
      out.write("       \n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                        <h4 class=\"black-text center\">About Chitkara University HP</h4>\n");
      out.write("                                        <p class=\"black-text fow-text\">\n");
      out.write("                                        Chitkara University in Himachal Pradesh has been founded by Dr. Ashok Chitkara and Dr. Madhu Chitkara \n");
      out.write("                                        who have been passionate teachers for more than 40 years now. Since inception, Chitkara University has \n");
      out.write("                                        been different. Our students have been different. So are our faculty, our academic strengths and our \n");
      out.write("                                        outlook on teaching and learning.Within a decade, most of our academic programs are ranked in top 50 \n");
      out.write("                                        programs in the country. The unique difference being that Chitkara University has been established and\n");
      out.write("                                        managed by passionate academicians with the sole mission of making each and every student industry-ready.                   \n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("                                        <a href=\"#!\" class=\"modal-close waves-effect waves-green btn blue-grey lighten-1 black-text \">Close</a>\n");
      out.write("                                    </div>\n");
      out.write("                              \n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("                            <li class=\"waves-effect waves-light\">\n");
      out.write("                                <a class=\"waves-effect waves-light  modal-trigger  center modal-close\" href=\"#modal3\">Contact Us\n");
      out.write("                                  <i class=\"material-icons white-text left \">contacts</i>\n");
      out.write("                                </a>\n");
      out.write("    \n");
      out.write("                                <div id=\"modal3\" class=\"modal\">\n");
      out.write("                                    <div class=\"modal-content\">\n");
      out.write("                                        \n");
      out.write("                                        <h4 class=\"black-text center\">Contact</h4>\n");
      out.write("                                        <ul class=\"collection white\">\n");
      out.write("                                            <li class=\"collection-item black-text\">For more information\n");
      out.write("                                              give a miss call on\n");
      out.write("                                            <b>1800 267 1999</b>\n");
      out.write("                                            </li>\n");
      out.write("                                            <br>\n");
      out.write("                                            <li class=\"collection-item black-text\">Admission Helpline\n");
      out.write("                                              <b>+91 9501105714 ,  \n");
      out.write("                                              +91 9501105715</b>\n");
      out.write("                                            </li>\n");
      out.write("                                            <br>\n");
      out.write("                                            <li class=\"collection-item black-text\">Delhi & NCR\n");
      out.write("                                              please call on\n");
      out.write("                                              <b>+91 9599368734</b>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("                                        <a href=\"#!\" class=\"modal-close waves-effect waves-green btn-flat blue-grey lighten-1 black-text \">Close</a>\n");
      out.write("                                    </div>\n");
      out.write("                                  \n");
      out.write("                                  </div>\n");
      out.write("                                 \n");
      out.write("                            </li>\n");
      out.write("                \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            <ul class=\"sidenav\" id = \"mobile-links\">\n");
      out.write("                <li>\n");
      out.write("                    \n");
      out.write("                    <a class=\"waves-effect waves-light  modal-trigger\" href=\"#modal2\">About\n");
      out.write("                        <i class=\"material-icons black-text left \">info</i>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"modal2\" class=\"modal\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <h4 class=\"black-text center\">About Chitkara University HP</h4>\n");
      out.write("                            <p class=\"black-text fow-text\">\n");
      out.write("                                Chitkara University in Himachal Pradesh has been founded by Dr. Ashok Chitkara and Dr. Madhu Chitkara \n");
      out.write("                                who have been passionate teachers for more than 40 years now. Since inception, Chitkara University has\n");
      out.write("                                been different. Our students have been different. So are our faculty, our academic strengths and our \n");
      out.write("                                outlook on teaching and learning.Within a decade, most of our academic programs are ranked in top 50 \n");
      out.write("                                programs in the country. The unique difference being that Chitkara University has been established and\n");
      out.write("                                managed by passionate academicians with the sole mission of making each and every student industry-ready.                   \n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <a href=\"#!\" class=\"modal-close waves-effect waves-green btn-flat blue-grey lighten-1 black-text \">Close</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                           \n");
      out.write("                <li>\n");
      out.write("                    \n");
      out.write("                    <a class=\"waves-effect waves-light  modal-trigger\" href=\"#modal4\">Contact Us\n");
      out.write("                        <i class=\"material-icons black-text left \">contacts</i>\n");
      out.write("                    </a>\n");
      out.write("                    <div id=\"modal4\" class=\"modal\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <h4 class=\"black-text center\">Contact</h4>\n");
      out.write("                            <ul class=\"collection white\">\n");
      out.write("                                <li class=\"collection-item black-text\">For more information give a miss call on<b>1800 267 1999</b></li>\n");
      out.write("                                <br>\n");
      out.write("                                <li class=\"collection-item black-text\">Admission Helpline <b>+91 9501105714 , +91 9501105715</b></li>\n");
      out.write("                                <br>\n");
      out.write("                                <li class=\"collection-item black-text\">Delhi & NCR please call on<b>+91 9599368734</b></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <div class=\"modal-footer\">\n");
      out.write("                                <a href=\"#!\" class=\"modal-close waves-effect waves-green btn-flat blue-grey lighten-1 black-text \">Close</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </header> \n");
      out.write("        \n");
      out.write("        <form action=\"LoginServlet2\" method=\"post\">\n");
      out.write("            <div class=\"row login\">\n");
      out.write("                <div class=\"col s12  l4 offset-l4 \">\n");
      out.write("                    <div class=\"card z-depth-4 \">\n");
      out.write("                        <div class=\"card-action blue-grey darken-1 center\">\n");
      out.write("                            <img src=\"CU.png\" class=\"responsive-img\">\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <div class=\"input-field black-text col s12 \">\n");
      out.write("                                <i class=\"material-icons prefix \">account_circle</i>\n");
      out.write("                                <label for=\"username\">Username</label>\n");
      out.write("                                <input name =\"id\"type=\"text\"id=\"username\" data-length=\"10\" class=\"validate\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                    \n");
      out.write("                            <div class=\"input-field back-text col s12\">\n");
      out.write("                            \n");
      out.write("                                <i class=\"material-icons prefix \">lock</i>\n");
      out.write("                                <label for=\"pass\">Password</label>\n");
      out.write("                                <input type=\"password\"id=\"pass\" name=\"pass\">\n");
      out.write("                            \n");
      out.write("                            </div>    \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                            <span style=\"color:red\">");
      out.print((request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage"));
      out.write("</span>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <div class=\"input-field black-text col s12 \">\n");
      out.write("                            \n");
      out.write("                                <i class=\"material-icons prefix \">view_list</i>\n");
      out.write("                                <label>Institute</label><br>\n");
      out.write("                                <select>\n");
      out.write("                                    <option value=\"1\">CSOET</option>>\n");
      out.write("                                    <option value=\"2\">CBS</option>\n");
      out.write("                                    <option value=\"3\">CSPS</option>\n");
      out.write("                              \n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-content center\">\n");
      out.write("                            <div class=\"input-field \">\n");
      out.write("                           \n");
      out.write("                                <button class=\"btn-large blue-grey darken-1 black-text z-depth-2 waves-effect waves-light center\">Login\n");
      out.write("                                   <i class=\"fa fa-sign-in right\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <footer class=\"white-text blue-grey darken-4 \" style=\"position: fixed;bottom:0px;left:0;width:100%;height: 40px;\">\n");
      out.write("           <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container center-align\">\n");
      out.write("                &copy; 2018 CHITKARA UNIVERSITY\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("            \n");
      out.write("        \n");
      out.write("                            \n");
      out.write("       \n");
      out.write("            \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('.sidenav').sidenav();\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('select').formSelect();\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('input#username, textarea#textarea2').characterCounter();\n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                $('.modal').modal();\n");
      out.write("            });\n");
      out.write("            $(document).ready(function(){\n");
      out.write("                swal (\"Incorrect username or password\",\" \",\"error\")\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}