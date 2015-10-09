package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class booked_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"image/cloud1.jpg\">");
      //  p:form
      org.apache.struts.taglib.html.FormTag _jspx_th_p_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_p_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_p_form_0.setPageContext(_jspx_page_context);
      _jspx_th_p_form_0.setParent(null);
      _jspx_th_p_form_0.setMethod("post");
      _jspx_th_p_form_0.setAction("/log100");
      int _jspx_eval_p_form_0 = _jspx_th_p_form_0.doStartTag();
      if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <table width=\"648\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"  >\n");
          out.write("  <!--DWLayoutTable-->\n");
          out.write("  <tr>\n");
          out.write("    <td width=\"83\" height=\"44\">&nbsp;</td>\n");
          out.write("    <td width=\"188\">&nbsp;</td>\n");
          out.write("    <td width=\"56\">&nbsp;</td>\n");
          out.write("    <td width=\"206\">&nbsp;</td>\n");
          out.write("    <td width=\"115\">&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"51\">&nbsp;</td>\n");
          out.write("    <td colspan=\"3\" valign=\"top\"><div align=\"center\">YOUR TICKETS HAVE BEEN SUCCESSFULLY BOOKED...!! </div></td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"22\">&nbsp;</td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"31\">&nbsp;</td>\n");
          out.write("    <td valign=\"top\">FLIGHT NO.- </td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("    <td valign=\"top\"><label>\n");
          out.write("      ");
out.println(session.getAttribute("key4"));
          out.write("\n");
          out.write("    </label></td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"17\"></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"33\"></td>\n");
          out.write("    <td valign=\"top\">DAY-</td>\n");
          out.write("    <td></td>\n");
          out.write("    <td valign=\"top\"><label>\n");
          out.write("    ");
out.println(session.getAttribute("key3"));
          out.write("\n");
          out.write("    \n");
          out.write("    </label></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"16\"></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"32\"></td>\n");
          out.write("    <td valign=\"top\">TIME-</td>\n");
          out.write("    <td></td>\n");
          out.write("    <td valign=\"top\"><label>\n");
          out.write("            ");
out.println(session.getAttribute("t"));
          out.write("\n");
          out.write("    </label></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"15\"></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"31\"></td>\n");
          out.write("    <td valign=\"top\">USER REGISTRATION ID- </td>\n");
          out.write("    <td></td>\n");
          out.write("    <td valign=\"top\"><label>\n");
          out.write("      <input type=\"text\" name=\"textfield4\" />\n");
          out.write("    </label>\n");
          out.write("            \n");
          out.write("    </td>\n");
          out.write("    <td>\n");
          out.write("    </td>\n");
          out.write("  </tr>\n");
          out.write("  <tr>\n");
          out.write("    <td height=\"28\"></td>\n");
          out.write("    <td>&nbsp;</td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("   <tr>\n");
          out.write("    <td height=\"51\">&nbsp;</td>\n");
          out.write("    <td colspan=\"3\" valign=\"top\"><div align=\"center\">");

int ttt=(int)session.getAttribute("tt");
int ppp=(int)session.getAttribute("pp");
int cost=(ttt*ppp);
out.println("THE TOTAL PAYABLE COST IS:- "+ cost);

          out.write(" \n");
          out.write("        <br><br><input type=\"submit\" value=\"Pay Now\" name=\"submit\">\n");
          out.write("        </div></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("  \n");
          out.write("  \n");
          out.write("  \n");
          out.write("  \n");
          out.write("  \n");
          out.write("  \n");
          out.write("  <tr>\n");
          out.write("    <td height=\"54\"></td>\n");
          out.write("    <td colspan=\"3\" valign=\"top\"><p align=\"center\">For further details .. Login wih your UserName and Password using the 'My Bookings' tab...! </p>\n");
          out.write("    <p align=\"center\"> Thank You </p></td>\n");
          out.write("    <td></td>\n");
          out.write("  </tr>\n");
          out.write("  <br><br>\n");
          out.write("  \n");
          out.write("</table>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_p_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_p_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
        return;
      }
      _jspx_tagPool_p_form_method_action.reuse(_jspx_th_p_form_0);
      out.write("</body>\n");
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
