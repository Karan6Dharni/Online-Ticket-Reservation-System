package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("#Image1\n");
      out.write("{\n");
      out.write("   border: 0px #000000 solid;\n");
      out.write("}\n");
      out.write("#Button1\n");
      out.write("{\n");
      out.write("   border: 1px #A9A9A9 solid;\n");
      out.write("   background-color: #F0F0F0;\n");
      out.write("   color: #000000;\n");
      out.write("   font-family: Arial;\n");
      out.write("   font-size: 13px;\n");
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
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>");
      if (_jspx_meth_p_form_0(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_p_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:form
    org.apache.struts.taglib.html.FormTag _jspx_th_p_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_p_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_p_form_0.setPageContext(_jspx_page_context);
    _jspx_th_p_form_0.setParent(null);
    _jspx_th_p_form_0.setAction("/log");
    _jspx_th_p_form_0.setMethod("post");
    int _jspx_eval_p_form_0 = _jspx_th_p_form_0.doStartTag();
    if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<div id=\"wb_Text3\" style=\"position:absolute;left:562px;top:103px;width:250px;height:16px;z-index:0;text-align:left;\">\n");
        out.write("&nbsp;</div>\n");
        out.write("<div id=\"wb_Image1\" style=\"position:absolute;left:0px;top:0px;width:1354px;height:633px;z-index:1;\">\n");
        out.write("<img src=\"images/f0.png\" id=\"Image1\" alt=\"\" style=\"width:1364.7px;height:640.7px;\"></div>\n");
        out.write("<input type=\"submit\" id=\"Button1\" name=\"\" value=\"Let's Fly\" style=\"position:absolute;left:492px;top:222px;width:119px;height:32px;z-index:2;\">\n");
        out.write("<div id=\"wb_Text1\" style=\"position:absolute;left:231px;top:130px;width:434px;height:72px;z-index:3;text-align:left;\">\n");
        out.write("<span style=\"color:#191970;font-family:'Comic Sans MS';font-size:17px;\"><em>It's time to fly .<br>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; Life is a journey, travel it well.<br>&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp; Fly the friendly sky with &quot;us&quot;....</em></span></div>\n");
        out.write("    ");
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
