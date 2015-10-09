package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   width: 1566\n");
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
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text2 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wb_Image1\" style=\"position:absolute;left:8px;top:700px;width:2208px;height:154px;z-index:0;\">\n");
      out.write("<img src=\"image/11.jpg\" id=\"Image1\" alt=\"\" style=\"width:2541;height:154px;\"></div>\n");
      out.write("<div id=\"wb_Text1\" style=\"position:absolute;left:252px;top:700px;width:156px;height:2px;text-align:center;z-index:1;\">\n");
      out.write("&nbsp;</div>\n");
      out.write("<div id=\"wb_JavaScript5\" style=\"position:absolute;left:459px;top:835px;width:706px;height:23px;z-index:2;\">\n");
      out.write("<div style=\"color:#FFFFFF;font-size:14px;font-family:Arial;font-weight:normal;font-style:italic;text-decoration:none\" id=\"copyrightnotice\"></div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("   var now = new Date();\n");
      out.write("   var startYear = \"2014\";\n");
      out.write("   var text =  \"Copyright &copy; \";\n");
      out.write("   if (startYear != '')\n");
      out.write("   {\n");
      out.write("      text = text + startYear + \"-\";\n");
      out.write("   }\n");
      out.write("   text = text + now.getFullYear() + \", SKYSCANNER PVT. LTD. (All rights reserved)\";\n");
      out.write("   var copyrightnotice = document.getElementById('copyrightnotice');\n");
      out.write("   copyrightnotice.innerHTML = text;\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div id=\"wb_JavaScript1\" style=\"position:absolute;left:651px;top:799px;width:97px;height:42px;z-index:3;\">\n");
      out.write("<a href=\"http://www.facebook.com/wysiwygwebbuilder\" rel=\"nofollow\"><img style=\"width:75px;height:30px;border-width:0;\" alt=\"WYSIWYG Web Builder on Facebook\" title=\"WYSIWYG Web Builder on Facebook\" src=\"image/logo_facebook.gif\"></a></div>\n");
      out.write("<div id=\"wb_JavaScript2\" style=\"position:absolute;left:996px;top:799px;width:98px;height:41px;z-index:4;\">\n");
      out.write("<a href=\"http://twitter.com/wysiwyg_wb\" rel=\"nofollow\"><img style=\"width:82px;height:28px;border-width:0;\" alt=\"WYSIWYG Web Builder on Twitter\" title=\"WYSIWYG Web Builder on Twitter\" src=\"image/logo_twitter.gif\"></a></div>\n");
      out.write("<div id=\"wb_JavaScript3\" style=\"position:absolute;left:883px;top:799px;width:88px;height:43px;z-index:5;\">\n");
      out.write("<a href=\"http://www.youtube.com/WebMovieMaker\" rel=\"nofollow\"><img style=\"width:75px;height:30px;border-width:0;\" alt=\"WYSIWYG Web Builder on YouTube\" title=\"WYSIWYG Web Builder on YouTube\" src=\"image/logo_youtube.gif\"></a></div>\n");
      out.write("<div id=\"wb_JavaScript4\" style=\"position:absolute;left:773px;top:799px;width:90px;height:39px;z-index:6;\">\n");
      out.write("<a href=\"http://www.linkedin.com/groups?gid=3090149\" rel=\"nofollow\"><img style=\"width:75px;height:30px;border-width:0;\" alt=\"WYSIWYG Web Builder on LinkedIn\" title=\"WYSIWYG Web Builder on LinkedIn\" src=\"image/logo_linkedin.gif\"></a></div>\n");
      out.write("<div id=\"wb_JavaScript7\" style=\"position:absolute;left:472px;top:799px;width:152px;height:41px;z-index:7;\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("// Location of this script:\n");
      out.write("// http://www.qiksearch.com/javascripts/blinking_text20.htm\n");
      out.write("//*********************************************\n");
      out.write("//* Blinking Text 2.0                         *\n");
      out.write("//* Blinks a text                             *\n");
      out.write("//* v 2.0 works on IE/NS6                     *\n");
      out.write("//* Modified 07 May 2002                      *\n");
      out.write("//* (c) Premshree Pillai,                     *\n");
      out.write("//* http://www.qiksearch.com                  *\n");
      out.write("//* E-mail : premshree@hotmail.com            *\n");
      out.write("//* Use the script freely as long as this     *\n");
      out.write("//* message is intact                         *\n");
      out.write("//*********************************************\n");
      out.write("window.onerror = null;\n");
      out.write("var IE4=document.all&&navigator.userAgent.indexOf(\"Opera\")==-1;\n");
      out.write("var NS6=document.getElementById&&navigator.userAgent.indexOf(\"Opera\")==-1;\n");
      out.write("var blink_speed=800; // Delay in milliseconds\n");
      out.write("var i=0;\n");
      out.write("var left_pos=330; // The Distance of text from left\n");
      out.write(" \n");
      out.write("if (IE4) \n");
      out.write("{\n");
      out.write("   layerRef=\"document.all\";\n");
      out.write("   styleSwitch=\".style\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("function Blink(layerName)\n");
      out.write("{\n");
      out.write("   if (IE4)\n");
      out.write("   { \n");
      out.write("      if(i%2==0)\n");
      out.write("      {\n");
      out.write("         eval(layerRef+'[\"'+layerName+'\"]'+\n");
      out.write("         styleSwitch+'.visibility=\"visible\"');\n");
      out.write("      }\n");
      out.write("      else\n");
      out.write("      {\n");
      out.write("         eval(layerRef+'[\"'+layerName+'\"]'+\n");
      out.write("         styleSwitch+'.visibility=\"hidden\"');\n");
      out.write("      }\n");
      out.write("   }\n");
      out.write(" \n");
      out.write("   if(NS6 && (navigator.appName!=\"Microsoft Internet Explorer\"))\n");
      out.write("   {\n");
      out.write("     if(i%2==0)\n");
      out.write("     {\n");
      out.write("        eval('document.getElementById(\"' + layerName + '\").style.display=\"\"');\n");
      out.write("     }\n");
      out.write("     else\n");
      out.write("     {\n");
      out.write("        eval('document.getElementById(\"' + layerName + '\").style.display=\"none\"');\n");
      out.write("     }\n");
      out.write("   }\n");
      out.write("   if(i<1)\n");
      out.write("   {\n");
      out.write("     i++;\n");
      out.write("   } \n");
      out.write("   else\n");
      out.write("   {\n");
      out.write("     i--;\n");
      out.write("   }\n");
      out.write("   setTimeout(\"Blink('\"+layerName+\"')\", blink_speed);\n");
      out.write("}\n");
      out.write("\n");
      out.write("if(IE4||NS6)\n");
      out.write("{\n");
      out.write("   if(IE4)\n");
      out.write("   {\n");
      out.write("     dispIENS=\"visibility:hidden;\";\n");
      out.write("   }\n");
      out.write("   else\n");
      out.write("   {\n");
      out.write("     dispIENS=\"display:none;\";\n");
      out.write("   }\n");
      out.write("   document.write('<div id=\"wb_blink\" style=\"' + dispIENS + '\"><font style=\"font-size:14px;font-family:Arial;font-weight:bold;font-style:italic;text-decoration:none\" color=\"#FFFFFF\">FOLLOW US ON:<\\/font><\\/div>');\n");
      out.write("   Blink('wb_blink');\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</div>\n");
      out.write("<div id=\"wb_Text2\" style=\"position:absolute;left:236px;top:733px;width:170px;height:85px;z-index:8;text-align:left;\">\n");
      out.write("<span style=\"color:#FFFFFF;font-family:Arial;font-size:15px;\"><strong><em>For any Queries, call us at 9826522565<br>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; OR<br>Email us at queries@sscanner.in</em></strong></span></div>\n");
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
