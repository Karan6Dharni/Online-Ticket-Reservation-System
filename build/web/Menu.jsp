<%-- 
    Document   : Menu
    Created on : Oct 16, 2014, 10:10:34 AM
    Author     : Ankit Kushwaha
--%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
        <html xmlns="http://www.w3.org/1999/xhtml">
                <head>
                        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
                        <title>Free CSS Navigation Menu Designs 1 at exploding-boy.com</title>
                        <style type="text/css">
<!--
    body {
        margin:0;
        padding:0;
        font: bold 11px/1.5em Verdana;
}

h2 {
        font: bold 14px Verdana, Arial, Helvetica, sans-serif;
        color: #000;
        margin: 0px;
        padding: 0px 0px 0px 15px;
}

/*- Menu Tabs H--------------------------- */

    #tabsH {
      float:left;
      width:100%;
      background:#333333;
      font-size:160%;
      line-height:normal;
      }
    #tabsH ul {
        margin:0;
        padding:10px 10px 0 50px;
        list-style:none;
      }
    #tabsH li {
      display:inline;
      margin:0;
      padding:0;
      }
    #tabsH a {
      float:left;
      background:url(images/tableftH.gif) no-repeat left top;
      margin:0;
      padding:0 0 0 4px;
      text-decoration:none;
      }
    #tabsH a span {
      float:left;
      display:block;
      background:url(images/tabrightH.gif) no-repeat right top;
      padding:5px 15px 4px 6px;
      color:#0CE8F3;
      }
    /* Commented Backslash Hack hides rule from IE5-Mac \*/
    #tabsH a span {float:none;}
    /* End IE5-Mac hack */
    #tabsH a:hover span {
      color:#FFF;
      }
    #tabsH a:hover {
      background-position:0% -42px;
      }
    #tabsH a:hover span {
      background-position:100% -42px;
      }

        #tabsH #current a {
                background-position:0% -42px;
        }
        #tabsH #current a span {
                background-position:100% -42px;
        }
-->
</style>
         
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <table width="100%" border="0">
            <tr>
                <td width ="150" height="30">
                    <%--<h2>Tab Menu J</h2>    id="current"   --%>
                        <div id="tabsH">
                                <ul>
                                        <!-- CSS Tabs -->
   <li><p:link action="/log0"><span><b>Home</b></span></p:link></li>                                     
<li><p:link action="/log1"><span><b>About us</b></span></p:link></li>
<li><p:link action="/log2"><span>My bookings</span></p:link></li>
<li><p:link action="/log3"><span>Availability</span></p:link></li>
<li><p:link action="/log4"><span>Companies</span></p:link></li>
<li><p:link action="/log5"><span>Gallery</span></p:link></li>
<li><p:link action="/log6"><span>Feedback</span></p:link></li>
<li><p:link action="/log7"><span>Contact us</span></p:link></li>
<li><p:link action="/log8"><span>FAQs</span></p:link></li>
                                </ul>
                        </div>
                    <%--Menu<br><br>
                    <p:link action="/log1">Model</p:link><br><br>
                    <p:link action="/log2">Shop</p:link>--%>
                </td>
            </tr>
        </table>
    </body>
</html>


<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" uri="http://struts.apache.org/tags-html"%>
<!DOCTYPE html>
<html>
    
    <body>
       
        <table width="100%" border="1" cellpadding="0" cellspacing="0">
            <tr bgcolor="#99FFCC"> 
                <td width="150" height="400" valign="top">
                    <h4>MENU:-</h4><br><br>
                    <t:link action="/log1"><b>Availability</b></t:link>
                   
                </td>
            </tr>
        </table>
    </body>
</html>--%>
