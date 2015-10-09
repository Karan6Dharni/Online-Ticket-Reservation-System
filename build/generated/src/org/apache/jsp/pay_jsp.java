package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("#wb_Text1 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text1 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#Image1\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image2\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image3\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image4\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image5\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image6\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image7\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image8\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Image9\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wb_Text1\" style=\"position:absolute;left:541px;top:73px;width:250px;height:30px;z-index:0;text-align:left;\">\n");
      out.write("<span style=\"color:#191970;font-family:'Comic Sans MS';font-size:21px;\"><strong><u>Select your BANK</u></strong></span></div>\n");
      out.write("<div id=\"wb_Image1\" style=\"position:absolute;left:75px;top:158px;width:348px;height:150px;z-index:1;\">\n");
      out.write("<a href=\"http://www.sbi.co.in\"><img src=\"images/b2.jpg\" id=\"Image1\" alt=\"\" style=\"width:348px;height:150px;\"></a></div>\n");
      out.write("<div id=\"wb_Image2\" style=\"position:absolute;left:462px;top:173px;width:385px;height:131px;z-index:2;\">\n");
      out.write("<a href=\"http://www.axisbank.com\"><img src=\"images/b5.jpg\" id=\"Image2\" alt=\"\" style=\"width:385px;height:131px;\"></a></div>\n");
      out.write("<div id=\"wb_Image3\" style=\"position:absolute;left:51px;top:365px;width:494px;height:102px;z-index:3;\">\n");
      out.write("<a href=\"http://www.idbi.com\"><img src=\"images/b4.jpg\" id=\"Image3\" alt=\"\" style=\"width:494px;height:102px;\"></a></div>\n");
      out.write("<div id=\"wb_Image4\" style=\"position:absolute;left:88px;top:515px;width:423px;height:96px;z-index:4;\">\n");
      out.write("<a href=\"http://centralbankofindia.co.in\"><img src=\"images/b7.jpg\" id=\"Image4\" alt=\"\" style=\"width:423px;height:96px;\"></a></div>\n");
      out.write("<div id=\"wb_Image5\" style=\"position:absolute;left:930px;top:188px;width:292px;height:116px;z-index:5;\">\n");
      out.write("<a href=\"http://unionbankonline.co.in\"><img src=\"images/b1.jpg\" id=\"Image5\" alt=\"\" style=\"width:292px;height:116px;\"></a></div>\n");
      out.write("<div id=\"wb_Image6\" style=\"position:absolute;left:592px;top:505px;width:362px;height:139px;z-index:6;\">\n");
      out.write("<a href=\"http://www.pnbindia.in\"><img src=\"images/b6.jpg\" id=\"Image6\" alt=\"\" style=\"width:362px;height:139px;\"></a></div>\n");
      out.write("<div id=\"wb_Image7\" style=\"position:absolute;left:594px;top:324px;width:170px;height:170px;z-index:7;\">\n");
      out.write("<a href=\"http://www.icicibank.com\"><img src=\"images/images%20%283%29.jpg\" id=\"Image7\" alt=\"\" style=\"width:170px;height:170px;\"></a></div>\n");
      out.write("<div id=\"wb_Image8\" style=\"position:absolute;left:1014px;top:489px;width:288px;height:175px;z-index:8;\">\n");
      out.write("<a href=\"http://www.hdfcbank.com\"><img src=\"images/images.jpg\" id=\"Image8\" alt=\"\" style=\"width:288px;height:175px;\"></a></div>\n");
      out.write("<div id=\"wb_Image9\" style=\"position:absolute;left:829px;top:364px;width:491px;height:102px;z-index:9;\">\n");
      out.write("<a href=\"http://www.federalbank.co.in\"><img src=\"images/images%20%287%29.jpg\" id=\"Image9\" alt=\"\" style=\"width:491px;height:102px;\"></a></div>\n");
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
