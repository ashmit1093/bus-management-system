package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLanding_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <script src=\"https://use.fontawesome.com/7ab33ef109.js\"></script>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <!--Import materialize.css-->\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("        \n");
      out.write("        <!--Let browser know website is optimized for mobile-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Chitkara Bus Management</title>\n");
      out.write("         <link rel=\"icon\" type=\"image/png\" href=\"LOGO2.PNG\" />\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <style>\n");
      out.write("             \n");
      out.write("             .card h5{\n");
      out.write("                 padding:10px 0px;\n");
      out.write("             }\n");
      out.write("             .card{\n");
      out.write("                 transition: .5s;\n");
      out.write("                 background: #eee; \n");
      out.write("             }\n");
      out.write("             .card:hover i ,h5{\n");
      out.write("                   color: #64b5f6;\n");
      out.write("             }\n");
      out.write("             .card:hover {\n");
      out.write("                 transform: scale(1.03);\n");
      out.write("                 background: #fff;\n");
      out.write("             }\n");
      out.write("             .haha{\n");
      out.write("                 background-color: white;\n");
      out.write("             }\n");
      out.write("             .side-nav li>a {\n");
      out.write("                padding: 0 16px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("             \n");
      out.write("         </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        ");

            
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //HTTP 1.1
            
            response.setHeader("Pragma", "no-cache");//HTTP 1.0s
            
            response.setHeader("Expires", "0");
            
            
            
            if(session.getAttribute("username")==null)
            {
                response.sendRedirect("Index.jsp");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <div class=\"navbar-fixed\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <nav class=\"nav-wrapper blue-grey darken-3\">\n");
      out.write("                   \n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        \n");
      out.write("                        <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                            <li><a class =\"waves-effect waves-light tooltipped\"  data-position=\"bottom\" data-tooltip=\"Log Out\" href=\"LogOutServlet2\">\n");
      out.write("                                    <i class=\"material-icons\" style=\"font-size:35px;\">exit_to_app</i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                         <a href=\"#\" data-target=\"slide-out\" class=\"sidenav-trigger show-on-medium-and-down\"><i class=\"fa fa-bars fa-2x\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <ul id=\"slide-out\" class=\"sidenav\">\n");
      out.write("                \n");
      out.write("                <li>\n");
      out.write("                    <div class=\"user-view\">\n");
      out.write("                        <div class=\"background blue-grey lighten-4\">\n");
      out.write("                     \n");
      out.write("                        </div>\n");
      out.write("                        <i class=\"fa fa-user-circle-o fa-4x black-text\"></i>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <span class=\"id\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        \n");
      out.write("                 \n");
      out.write("                    </div>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  \n");
      out.write("                    <a class=\"waves-effect container \" href=\"LogOutServlet2\">Sign Out\n");
      out.write("                        <i class=\"fa fa-sign-out fa-2x black-text\"></i>\n");
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("        </header>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container services\">\n");
      out.write("            <h5 class=\"center black-text\">Welcome Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h5>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s12 m6 l6 center-align\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"card z-depth-3\">\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <i class=\"fa fa-user fa-5x\" aria-hidden=\"true\"></i>\n");
      out.write("                            <h5 class=\"\">Admin Details</h5>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"card-action\" >\n");
      out.write("                            <a href=\"detail\" class=\"btn-floating btn-large btn tooltipped \" data-position=\"bottom\" data-tooltip=\"View\">\n");
      out.write("                                    <i class=\"material-icons\">add</i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col s12 m6 l6  center-align\">\n");
      out.write("                    <div class=\"card z-depth-3\">\n");
      out.write("                        <div class=\"card-content\">\n");
      out.write("                            <i class=\"fa fa-id-card-o fa-5x\"></i>\n");
      out.write("                            <h5> Registered Drivers</h5>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"card-action\" >\n");
      out.write("                            <a href=\"AdminDrivers\" class=\"btn-floating btn-large btn tooltipped \" data-position=\"bottom\" data-tooltip=\"View\">\n");
      out.write("                                <i class=\"material-icons\">add</i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("                <div class=\"col s12 m6 l6  center-align\">\n");
      out.write("                        <div class=\"card z-depth-3\">\n");
      out.write("                            <div class=\"card-content\">\n");
      out.write("                                <i class=\"fa fa-bus fa-5x\" aria-hidden=\"true\"></i>\n");
      out.write("                                <h5> Registered Buses</h5>\n");
      out.write("                          \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"card-action\" >\n");
      out.write("                                <a href=\"AdminBus\" class=\"btn-floating btn-large btn tooltipped \" data-position=\"bottom\" data-tooltip=\"View\">\n");
      out.write("                                    <i class=\"material-icons\">add</i>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("          \n");
      out.write("                <div class=\"col s12 m6 l6 center-align\">\n");
      out.write("                 \n");
      out.write("                        <div class=\"card z-depth-3\">\n");
      out.write("                            <div class=\"card-content\">\n");
      out.write("                                <i class=\"fa fa-comment fa-5x\" aria-hidden=\"true\"></i>\n");
      out.write("                                <h5>Check  FeedBacks </h5>\n");
      out.write("                             \n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"card-action\" >\n");
      out.write("                                <a href=\"Check_FeedBack\" class=\"btn-floating btn-large btn tooltipped \" data-position=\"bottom\" data-tooltip=\"View\">\n");
      out.write("                                    <i class=\"material-icons\">add</i>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("                               \n");
      out.write("                \n");
      out.write("       \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <footer class=\" blue-grey darken-3 white-text navbar-fixed\" style=\"position: fixed;bottom:0px;left:0;width:100%;height: 31.5px;\">\n");
      out.write("           <div class=\"footer-copyright\">\n");
      out.write("            <div class=\"container center-align\">\n");
      out.write("                &copy; 2018 CHITKARA UNIVERSITY\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("         \n");
      out.write("       \n");
      out.write(" \n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("                            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("              $(document).ready(function(){\n");
      out.write("                $('.tooltipped').tooltip();\n");
      out.write("                });\n");
      out.write("              $(document).ready(function(){\n");
      out.write("                $('.sidenav')\n");
      out.write("                    .sidenav()\n");
      out.write("                    .on('click tap', 'li a', () => {\n");
      out.write("                $('.sidenav').sidenav('close');\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("    \n");
      out.write("</html>");
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
