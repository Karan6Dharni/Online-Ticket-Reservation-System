<%-- 
    Document   : booked
    Created on : Jun 23, 2015, 11:57:34 AM
    Author     : DELL
--%>
<%@page import="java.sql.* " %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="image/clouds1.jpg"><p:form method="post" action="/log100">
        <table width="648" border="0" cellpadding="0" cellspacing="0"  >
  <!--DWLayoutTable-->
  <tr>
    <td width="83" height="44">&nbsp;</td>
    <td width="188">&nbsp;</td>
    <td width="56">&nbsp;</td>
    <td width="206">&nbsp;</td>
    <td width="115">&nbsp;</td>
  </tr>
  <tr>
    <td height="51">&nbsp;</td>
    <td colspan="3" valign="top"><div align="center">YOUR TICKETS HAVE BEEN SUCCESSFULLY BOOKED...!! </div></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="22">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="31">&nbsp;</td>
    <td valign="top">FLIGHT NO.- </td>
    <td>&nbsp;</td>
    <td valign="top"><label>
      <%out.println(session.getAttribute("key4"));%>
    </label></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="17"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="33"></td>
    <td valign="top">DAY-</td>
    <td></td>
    <td valign="top"><label>
            <%out.println(session.getAttribute("f"));%>
    
    </label></td>
    <td></td>
  </tr>
  <tr>
    <td height="16"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="32"></td>
    <td valign="top">TIME-</td>
    <td></td>
    <td valign="top"><label>
            <%out.println(session.getAttribute("t"));%>
    </label></td>
    <td></td>
  </tr>
  <tr>
    <td height="15"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="31"></td>
    <td valign="top">USER REGISTRATION ID- </td>
    <td></td>
    <td valign="top"><label>
            <% String s1=(String)session.getAttribute("o");
               String s2=(String)session.getAttribute("key4");
               String s3=(String)session.getAttribute("aaa");
               String s4=s3+s1+s2;
               out.println(s4);
            %>
    </label>
            
    </td>
    <td>
    </td>
  </tr>
  <tr>
    <td height="28"></td>
    <td>&nbsp;</td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
   <tr>
    <td height="51">&nbsp;</td>
    <td colspan="3" valign="top"><div align="center"><%
int ttt=(int)session.getAttribute("tt");
int ppp=(int)session.getAttribute("pp");
int cost=(ttt*ppp);
out.println("THE TOTAL PAYABLE COST IS:- "+ cost);
%> 
        <br><br><input type="submit" value="Pay Now" name="submit">
        </div></td>
    <td></td>
  </tr>
  
  
  
  
  
  
  <tr>
    <td height="54"></td>
    <td colspan="3" valign="top"><p align="center">For further details .. Login wih your UserName and Password using the 'My Bookings' tab...! </p>
    <p align="center"> Thank You </p></td>
    <td></td>
  </tr>
  <br><br>
  
</table>
    </p:form></body>
</html>
