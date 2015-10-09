package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Body_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<title>Slideshow</title>\n");
      out.write("</head>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t* { margin:0; padding:0;}\n");
      out.write("\t#slide { width: 1342px; overflow: hidden; height: 400px; margin: 50px auto; box-shadow: 0 0 8px #000;position: relative;}\n");
      out.write("\t#slide img {position: absolute;z-index: 1; display: none; left: 0;}\n");
      out.write("\t#slide p {z-index:2;position: absolute; bottom: 0; left: 0; width: 100%; padding: 10px; font-family: Arial; font-size: 14px; background: rgba(0,0,0,0.7);  color: #fff;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("<body>\n");
      out.write("\t<figure id=\"slide\">\n");
      out.write("\t\t<img src=\"images/image1.jpg\" alt=\"Image 1\">\n");
      out.write("\t\t<img src=\"images/image2.jpg\" alt=\"Image 2\">\n");
      out.write("                <img src=\"images/image3.jpg\" alt=\"Image 3\">\n");
      out.write("                <img src=\"images/image4.jpg\" alt=\"Image 4\">\n");
      out.write("                <img src=\"images/image5.jpg\" alt=\"Image 5\">\n");
      out.write("                <img src=\"images/image6.jpg\" alt=\"Image 6\">\n");
      out.write("\t</figure>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\"#slide img:eq(0)\").addClass(\"active\").show();\n");
      out.write("\n");
      out.write("\t\t\tvar text = $(\".active\").attr(\"alt\");\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\tsetInterval(slide,3000);\n");
      out.write("\n");
      out.write("\t\t\tfunction slide(){\n");
      out.write("\t\t\t\tif($(\".active\").next().size()){\n");
      out.write("\t\t\t\t\t$(\".active\").fadeOut().removeClass(\"active\").next().fadeIn().addClass(\"active\");\n");
      out.write("\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t$(\".active\").fadeOut().removeClass(\"active\");\n");
      out.write("\t\t\t\t\t$(\"#slide img:eq(0)\").fadeIn().addClass(\"active\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\tvar text = $(\".active\").attr(\"alt\");\n");
      out.write("\t\t\t\t$(\"#slide p\").hide().html(text).delay(500).fadeIn();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
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
