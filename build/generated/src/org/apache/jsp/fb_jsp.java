package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("#wb_Text2 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text2 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
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
      out.write("#wb_Text4 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text4 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text5 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text5 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text6 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text6 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#Editbox1\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color :#000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("   text-align: left;\n");
      out.write("   vertical-align: middle;\n");
      out.write("}\n");
      out.write("#Editbox2\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color :#000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("   text-align: left;\n");
      out.write("   vertical-align: middle;\n");
      out.write("}\n");
      out.write("#TextArea1\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color :#000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("   text-align: left;\n");
      out.write("   resize: none;\n");
      out.write("}\n");
      out.write("#wb_Text7 \n");
      out.write("{\n");
      out.write("   background-color: transparent;\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("   padding: 0;\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text7 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#Editbox3\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color :#000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("   text-align: left;\n");
      out.write("   vertical-align: middle;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"image/clouds1.jpg\">\n");
      out.write("        <div id=\"wb_Text1\" style=\"position:absolute;left:277px;top:169px;width:250px;height:2px;z-index:0;text-align:left;\">\n");
      out.write("<span style=\"color:#000000;font-family:Arial;font-size:8px;\"></span></div>\n");
      out.write("<div id=\"wb_Text2\" style=\"position:absolute;left:275px;top:163px;width:317px;height:38px;z-index:1;text-align:left;\">\n");
      out.write("<span style=\"color:#191970;font-family:Arial;font-size:17px;\"><strong></strong></span><span style=\"color:#000000;font-family:Arial;font-size:17px;\"><strong> </strong></span></div>\n");
      out.write("<div id=\"wb_Text3\" style=\"position:absolute;left:300px;top:209px;width:250px;height:38px;text-align:center;z-index:2;\">\n");
      out.write("<span style=\"color:#DC143C;font-family:'Comic Sans MS';font-size:13px;\"><strong><em>Please leave behind your valuable FEEDBACK , so that we can serve you better..!</em></strong></span></div>\n");
      out.write("<div id=\"wb_Text4\" style=\"position:absolute;left:311px;top:301px;width:250px;height:18px;z-index:3;text-align:left;\">\n");
      out.write("<span style=\"color:#000000;font-family:Georgia;font-size:15px;\"><strong>Name-</strong></span></div>\n");
      out.write("<div id=\"wb_Text5\" style=\"position:absolute;left:301px;top:371px;width:250px;height:18px;z-index:4;text-align:left;\">\n");
      out.write("<span style=\"color:#000000;font-family:Georgia;font-size:15px;\"><strong>Email-</strong></span></div>\n");
      out.write("<div id=\"wb_Text6\" style=\"position:absolute;left:288px;top:528px;width:250px;height:18px;z-index:5;text-align:left;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<span style=\"color:#000000;font-family:Georgia;font-size:15px;\"><strong>Feedback-</strong></span></div>\n");
      out.write("<input type=\"text\" id=\"Editbox1\" style=\"position:absolute;left:427px;top:301px;width:135px;height:19px;line-height:19px;z-index:6;\" name=\"Editbox1\" value=\"\">\n");
      out.write("<input type=\"text\" id=\"Editbox2\" style=\"position:absolute;left:425px;top:370px;width:139px;height:19px;line-height:19px;z-index:7;\" name=\"Editbox2\" value=\"\">\n");
      out.write("<textarea name=\"TextArea1\" id=\"TextArea1\" style=\"position:absolute;left:421px;top:525px;width:236px;height:98px;z-index:8;\" rows=\"5\" cols=\"33\"></textarea>\n");
      out.write("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("&nbsp;<input value=\"submit\" type=\"submit\" name=\"submit\">\n");
      out.write("<div id=\"wb_Text7\" style=\"position:absolute;left:275px;top:443px;width:250px;height:18px;z-index:9;text-align:left;\">\n");
      out.write("<span style=\"color:#000000;font-family:Georgia;font-size:15px;\"><strong>Star Rating-</strong></span></div>\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"0\" width=\"133\" bgcolor=white style=\"position:absolute;left:425px;top:441px;width:136px;height:19px;line-height:19px;z-index:10;\">\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <iframe src=\"http://www.ratingcode.com/show.php?id=143531316768&st=3&bg=FFCCFF\" border=\"0\" width=\"115\" height=\"37\" marginwidth=\"0\" marginheight=\"0\" hspace=\"0\" vspace=\"0\" frameborder=\"0\" scrolling=\"no\" bgcolor=white></iframe></td><td width=\"18\" align=\"center\" valign=\"top\" style=\"padding-top:5px\">\n");
      out.write("            <a href=\"http://www.ratingcode.com\" target=\"_blank\">\n");
      out.write("                <img src=\"http://www.ratingcode.com/images/info.png\" alt=\"no internet!\" >\n");
      out.write("            </a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("     </body>\n");
      out.write("</html>\n");
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
