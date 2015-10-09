package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class avail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>");
      //  p:form
      org.apache.struts.taglib.html.FormTag _jspx_th_p_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_p_form_method_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_p_form_0.setPageContext(_jspx_page_context);
      _jspx_th_p_form_0.setParent(null);
      _jspx_th_p_form_0.setMethod("post");
      _jspx_th_p_form_0.setAction("/log11");
      int _jspx_eval_p_form_0 = _jspx_th_p_form_0.doStartTag();
      if (_jspx_eval_p_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    <head>\n");
          out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
          out.write("        <title>JSP Page</title>\n");
          out.write("    </head>\n");
          out.write("    <body>\n");
          out.write("        <h1>Flights are available!</h1>\n");
          out.write("        <h4>The details are-</h4>\n");
          out.write("        ");

           String source=(String)request.getAttribute("key1");
          String destination=(String)request.getAttribute("key2");
          String day=(String)request.getAttribute("key3");
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
          Statement stmt=con.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from flight ");
          while(rs.next()){
          if(source.equals(rs.getString(2)) && destination.equals(rs.getString(3)) && day.equals(rs.getString(4))){
          String fno=rs.getString(1);
          String time=rs.getString(5);
          session.setAttribute("t",time);
          String company=rs.getString(6);
          String price=rs.getString(7);
          out.println("<br> Flight no. -"+fno+"&nbsp;&nbsp;&nbsp;&nbsp;Time- "+time+"&nbsp;&nbsp;&nbsp;&nbsp;Price- "+price+"&nbsp;&nbsp;&nbsp;&nbsp;Company- "+company);
          }
          }
        
          out.write("\n");
          out.write("        <br><br>\n");
          out.write("        Enter Desired Flight no-&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"t1\" />\n");
          out.write("        <br><br>\n");
          out.write("      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" name=\"Submit\" value=\"Book\" />\n");
          out.write("      \n");
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
