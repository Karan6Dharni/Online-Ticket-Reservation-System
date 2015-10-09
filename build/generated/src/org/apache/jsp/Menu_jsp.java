package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_p_link_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_p_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_p_link_action.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("        <html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("                <head>\n");
      out.write("                        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("                        <title>Free CSS Navigation Menu Designs 1 at exploding-boy.com</title>\n");
      out.write("                        <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("    body {\n");
      out.write("        margin:0;\n");
      out.write("        padding:0;\n");
      out.write("        font: bold 11px/1.5em Verdana;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("        font: bold 14px Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("        color: #000;\n");
      out.write("        margin: 20px;\n");
      out.write("        padding: 0px 0px 0px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*- Menu Tabs J--------------------------- */\n");
      out.write("\n");
      out.write("    #tabsJ {\n");
      out.write("      float:left;\n");
      out.write("      width:100%;\n");
      out.write("      background:#F4F4F4;\n");
      out.write("      font-size:160%;\n");
      out.write("      line-height:normal;\n");
      out.write("          border-bottom:1px solid #24618E;\n");
      out.write("      }\n");
      out.write("    #tabsJ ul {\n");
      out.write("        margin:0;\n");
      out.write("        padding:10px 10px 0 50px;\n");
      out.write("        list-style:none;\n");
      out.write("      }\n");
      out.write("    #tabsJ li {\n");
      out.write("      display:inline;\n");
      out.write("      margin:0;\n");
      out.write("      padding:0;\n");
      out.write("      }\n");
      out.write("    #tabsJ a {\n");
      out.write("      float:left;\n");
      out.write("      background:url(images/tableftJ.gif) no-repeat left top;\n");
      out.write("      margin:0;\n");
      out.write("      padding:0 0 0 5px;\n");
      out.write("      text-decoration:none;\n");
      out.write("      }\n");
      out.write("    #tabsJ a span {\n");
      out.write("      float:left;\n");
      out.write("      display:block;\n");
      out.write("      background:url(images/tabrightJ.gif) no-repeat right top;\n");
      out.write("      padding:5px 15px 4px 6px;\n");
      out.write("      color:#24618E;\n");
      out.write("      }\n");
      out.write("    /* Commented Backslash Hack hides rule from IE5-Mac \\*/\n");
      out.write("    #tabsJ a span {float:none;}\n");
      out.write("    /* End IE5-Mac hack */\n");
      out.write("    #tabsJ a:hover span {\n");
      out.write("      color:#FFF;\n");
      out.write("      }\n");
      out.write("    #tabsJ a:hover {\n");
      out.write("      background-position:0% -42px;\n");
      out.write("      }\n");
      out.write("    #tabsJ a:hover span {\n");
      out.write("      background-position:100% -42px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("        #tabsJ #current a {\n");
      out.write("                background-position:0% -42px;\n");
      out.write("        }\n");
      out.write("        #tabsJ #current a span {\n");
      out.write("                background-position:100% -42px;\n");
      out.write("                color:#FFF;\n");
      out.write("        }\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <table width=\"100%\" border=\"0\">\n");
      out.write("            <tr>\n");
      out.write("                <td width =\"150\" height=\"30\">\n");
      out.write("                    ");
      out.write("\n");
      out.write("                        <div id=\"tabsJ\">\n");
      out.write("                                <ul>\n");
      out.write("                                        <!-- CSS Tabs -->\n");
      out.write("   <li id=\"current\">");
      if (_jspx_meth_p_link_0(_jspx_page_context))
        return;
      out.write("</li>                                     \n");
      out.write("<li>");
      if (_jspx_meth_p_link_1(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_p_link_2(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_p_link_3(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_p_link_4(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_p_link_5(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_p_link_6(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_p_link_7(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_p_link_8(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("                                </ul>\n");
      out.write("                        </div>\n");
      out.write("                    ");
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');
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

  private boolean _jspx_meth_p_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_0.setPageContext(_jspx_page_context);
    _jspx_th_p_link_0.setParent(null);
    _jspx_th_p_link_0.setAction("/log0");
    int _jspx_eval_p_link_0 = _jspx_th_p_link_0.doStartTag();
    if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_0.doInitBody();
      }
      do {
        out.write("<span><b>Home</b></span>");
        int evalDoAfterBody = _jspx_th_p_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_0);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_0);
    return false;
  }

  private boolean _jspx_meth_p_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_1.setPageContext(_jspx_page_context);
    _jspx_th_p_link_1.setParent(null);
    _jspx_th_p_link_1.setAction("/log1");
    int _jspx_eval_p_link_1 = _jspx_th_p_link_1.doStartTag();
    if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_1.doInitBody();
      }
      do {
        out.write("<span><b>About us</b></span>");
        int evalDoAfterBody = _jspx_th_p_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_1);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_1);
    return false;
  }

  private boolean _jspx_meth_p_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_2.setPageContext(_jspx_page_context);
    _jspx_th_p_link_2.setParent(null);
    _jspx_th_p_link_2.setAction("/log2");
    int _jspx_eval_p_link_2 = _jspx_th_p_link_2.doStartTag();
    if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_2.doInitBody();
      }
      do {
        out.write("<span>My bookings</span>");
        int evalDoAfterBody = _jspx_th_p_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_2);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_2);
    return false;
  }

  private boolean _jspx_meth_p_link_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_3.setPageContext(_jspx_page_context);
    _jspx_th_p_link_3.setParent(null);
    _jspx_th_p_link_3.setAction("/log3");
    int _jspx_eval_p_link_3 = _jspx_th_p_link_3.doStartTag();
    if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_3.doInitBody();
      }
      do {
        out.write("<span>Availability</span>");
        int evalDoAfterBody = _jspx_th_p_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_3);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_3);
    return false;
  }

  private boolean _jspx_meth_p_link_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_4.setPageContext(_jspx_page_context);
    _jspx_th_p_link_4.setParent(null);
    _jspx_th_p_link_4.setAction("/log4");
    int _jspx_eval_p_link_4 = _jspx_th_p_link_4.doStartTag();
    if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_4.doInitBody();
      }
      do {
        out.write("<span>Companies</span>");
        int evalDoAfterBody = _jspx_th_p_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_4);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_4);
    return false;
  }

  private boolean _jspx_meth_p_link_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_5 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_5.setPageContext(_jspx_page_context);
    _jspx_th_p_link_5.setParent(null);
    _jspx_th_p_link_5.setAction("/log5");
    int _jspx_eval_p_link_5 = _jspx_th_p_link_5.doStartTag();
    if (_jspx_eval_p_link_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_5.doInitBody();
      }
      do {
        out.write("<span>Gallery</span>");
        int evalDoAfterBody = _jspx_th_p_link_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_5);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_5);
    return false;
  }

  private boolean _jspx_meth_p_link_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_6 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_6.setPageContext(_jspx_page_context);
    _jspx_th_p_link_6.setParent(null);
    _jspx_th_p_link_6.setAction("/log6");
    int _jspx_eval_p_link_6 = _jspx_th_p_link_6.doStartTag();
    if (_jspx_eval_p_link_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_6.doInitBody();
      }
      do {
        out.write("<span>Feedback</span>");
        int evalDoAfterBody = _jspx_th_p_link_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_6);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_6);
    return false;
  }

  private boolean _jspx_meth_p_link_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_7 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_7.setPageContext(_jspx_page_context);
    _jspx_th_p_link_7.setParent(null);
    _jspx_th_p_link_7.setAction("/log7");
    int _jspx_eval_p_link_7 = _jspx_th_p_link_7.doStartTag();
    if (_jspx_eval_p_link_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_7.doInitBody();
      }
      do {
        out.write("<span>Contact us</span>");
        int evalDoAfterBody = _jspx_th_p_link_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_7);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_7);
    return false;
  }

  private boolean _jspx_meth_p_link_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  p:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_p_link_8 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_p_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_p_link_8.setPageContext(_jspx_page_context);
    _jspx_th_p_link_8.setParent(null);
    _jspx_th_p_link_8.setAction("/log8");
    int _jspx_eval_p_link_8 = _jspx_th_p_link_8.doStartTag();
    if (_jspx_eval_p_link_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_p_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_p_link_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_p_link_8.doInitBody();
      }
      do {
        out.write("<span>FAQs</span>");
        int evalDoAfterBody = _jspx_th_p_link_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_p_link_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_p_link_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_8);
      return true;
    }
    _jspx_tagPool_p_link_action.reuse(_jspx_th_p_link_8);
    return false;
  }
}
