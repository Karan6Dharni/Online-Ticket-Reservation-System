package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_form_method_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_form_method_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_form_method_action.release();
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
      out.write("   text-align: left;\n");
      out.write("}\n");
      out.write("#wb_Text3 div\n");
      out.write("{\n");
      out.write("   text-align: left;\n");
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
      out.write("#Combobox1\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color: #000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("}\n");
      out.write("#Combobox2\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color: #000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("}\n");
      out.write("#Combobox3\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #FFFFFF;\n");
      out.write("   color: #000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("}\n");
      out.write("#Button1\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #F0F0F0;\n");
      out.write("   color: #000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>");
      if (_jspx_meth_p_form_0(_jspx_page_context))
        return;
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_p_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:form
    org.apache.struts.taglib.html.FormTag _jspx_th_p_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_p_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_p_form_0.setPageContext(_jspx_page_context);
    _jspx_th_p_form_0.setParent(null);
    _jspx_th_p_form_0.setMethod("post");
    _jspx_th_p_form_0.setAction("/log9");
    int _jspx_eval_p_form_0 = _jspx_th_p_form_0.doStartTag();
    if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<div id=\"wb_Image1\" style=\"position:absolute;left:0px;top:172px;width:100%;height:100%;z-index:0;\">\n");
        out.write("<img src=\"image/airplane-sunset-130927.jpg\" id=\"Image1\" alt=\"\" style=\"width:100%;height:100%;\"></div>\n");
        out.write("<div id=\"wb_Text1\" style=\"position:absolute;left:128px;top:390px;width:250px;height:24px;z-index:1;text-align:left;\">\n");
        out.write("<span style=\"color:#FF8C00;font-family:'Arial Black';font-size:17px;\">Check Availability</span></div>\n");
        out.write("<div id=\"wb_Text2\" style=\"position:absolute;left:97px;top:454px;width:250px;height:21px;z-index:2;text-align:left;\">\n");
        out.write("<span style=\"color:#000000;font-family:'Comic Sans MS';font-size:15px;\"><strong>Source-</strong></span></div>\n");
        out.write("<div id=\"wb_Text3\" style=\"position:absolute;left:96px;top:513px;width:250px;height:21px;z-index:3;text-align:left;\">\n");
        out.write("<span style=\"color:#000000;font-family:'Comic Sans MS';font-size:15px;\"><strong>Destination-</strong></span></div>\n");
        out.write("<div id=\"wb_Text4\" style=\"position:absolute;left:111px;top:574px;width:250px;height:21px;z-index:4;text-align:left;\">\n");
        out.write("<span style=\"color:#000000;font-family:'Comic Sans MS';font-size:15px;\"><strong>Day-</strong></span></div>\n");
        out.write("<select name=\"t1\" size=\"1\" id=\"Combobox1\" style=\"position:absolute;left:230px;top:456px;width:96px;height:21px;z-index:5;\">\n");
        out.write("<option value=\"Mumbai\">Mumbai</option>\n");
        out.write("<option value=\"Jaipur\">Jaipur</option>\n");
        out.write("<option value=\"Bhopal\">Bhopal</option>\n");
        out.write("<option value=\"Lucknow\">Lucknow</option>\n");
        out.write("<option value=\"Delhi\">Delhi</option>\n");
        out.write("<option value=\"Banglore\">Banglore</option>\n");
        out.write("<option value=\"Kolkata\">Kolkata</option>\n");
        out.write("</select>\n");
        out.write("<select name=\"t2\" size=\"1\" id=\"Combobox2\" style=\"position:absolute;left:230px;top:510px;width:96px;height:21px;z-index:6;\">\n");
        out.write("<option value=\"Mumbai\">Mumbai</option>\n");
        out.write("<option value=\"Jaipur\">Jaipur</option>\n");
        out.write("<option value=\"Bhopal\">Bhopal</option>\n");
        out.write("<option value=\"Lucknow\">Lucknow</option>\n");
        out.write("<option value=\"Delhi\">Delhi</option>\n");
        out.write("<option value=\"Banglore\">Banglore</option>\n");
        out.write("<option value=\"Kolkata\">Kolkata</option>\n");
        out.write("</select>\n");
        out.write("<select name=\"t3\" size=\"1\" id=\"Combobox3\" style=\"position:absolute;left:230px;top:572px;width:96px;height:21px;z-index:7;\">\n");
        out.write("<option value=\"Monday\">Monday</option>\n");
        out.write("<option value=\"Tuesday\">Tuesday</option>\n");
        out.write("<option value=\"Wednesday\">Wednesday</option>\n");
        out.write("<option value=\"Thurday\">Thursday</option>\n");
        out.write("<option value=\"Friday\">Friday</option>\n");
        out.write("<option value=\"Saturday\">Saturday</option>\n");
        out.write("<option value=\"Sunday\">Sunday</option>\n");
        out.write("</select>\n");
        out.write("<input type=\"submit\" id=\"Button1\" name=\"\" value=\"Submit\" style=\"position:absolute;left:153px;top:632px;width:96px;height:25px;z-index:8;\">\n");
        int evalDoAfterBody = _jspx_th_p_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_p_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
      return true;
    }
    _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
    return false;
  }
}
