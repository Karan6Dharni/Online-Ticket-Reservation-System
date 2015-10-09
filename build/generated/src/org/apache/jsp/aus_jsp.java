package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Untitled Page</title>\n");
      out.write("<meta name=\"generator\" content=\"WYSIWYG Web Builder 9 - http://www.wysiwygwebbuilder.com\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body\n");
      out.write("{\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color: #000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("   margin: 0;\n");
      out.write("   padding: 0;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("a\n");
      out.write("{\n");
      out.write("   color: #0000FF;\n");
      out.write("   text-decoration: underline;\n");
      out.write("}\n");
      out.write("a:visited\n");
      out.write("{\n");
      out.write("   color: #800080;\n");
      out.write("}\n");
      out.write("a:active\n");
      out.write("{\n");
      out.write("   color: #FF0000;\n");
      out.write("}\n");
      out.write("a:hover\n");
      out.write("{\n");
      out.write("   color: #0000FF;\n");
      out.write("   text-decoration: underline;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#Image1\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#wb_Text1 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("#wb_Text1 div\n");
      out.write("{\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("#wb_Text2 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("#wb_Text2 div\n");
      out.write("{\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("#wb_Text3 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("#wb_Text3 div\n");
      out.write("{\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wb_Image1\" style=\"position:absolute;left:4px;top:201px;width:1318px;height:401px;z-index:0;\">\n");
      out.write("<img src=\"images/img0001.png\" id=\"Image1\" alt=\"\" style=\"width:1318px;height:401px;\"></div>\n");
      out.write("<div id=\"wb_Text1\" style=\"position:absolute;left:288px;top:212px;width:557px;height:175px;text-align:center;z-index:1;\">\n");
      out.write("<span style=\"color:#0000CD;font-family:'Lucida Sans Unicode';font-size:19px;\"><strong><u>ABOUT SKYSCANNER</u></strong></span><span style=\"color:#0000FF;font-family:Arial;font-size:13px;\"><br></span><span style=\"color:#696969;font-family:Arial;font-size:16px;\"><strong>Skyscanner is a leading Indian travel search site, providing instant online comparisons for thousands of flights on over a week's time.<br>Skyscanner?s flexible search options mean you can browse prices across a whole week, allowing you to get the best deals. You always book direct with the airline or travel agent, so you get the lowest price, with no extra fees added.<br>We have over 60,000&nbsp; visitors every month who use us to find flights&nbsp; we hope we can help you find yours too!</strong></span></div>\n");
      out.write("<div id=\"wb_Text2\" style=\"position:absolute;left:267px;top:412px;width:572px;height:23px;text-align:center;z-index:2;\">\n");
      out.write("<span style=\"color:#0000CD;font-family:'Lucida Sans Unicode';font-size:19px;\"><strong><u>ABOUT THE TEAM</u></strong></span></div>\n");
      out.write("<div id=\"wb_Text3\" style=\"position:absolute;left:270px;top:443px;width:571px;height:89px;text-align:center;z-index:3;\">\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:15px;\"><strong>This website has been developed by:<br><em>Name&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; Email<br></em>&#8226;Karan Dharni&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; karan.dharni67@gmail<br>&#8226;Radhika Sharma&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; rimjhimrads12@gmail<br>&#8226;Pooja Yadav&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; poojayadav99@gmail</strong></span></div>\n");
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
