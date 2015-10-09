<%-- 
    Document   : Layout
    Created on : Oct 16, 2014, 10:11:18 AM
    Author     : Ankit Kushwaha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="100%" border="0" cellpadding="0" cellspacing="0">
            <tr>
                <td height="120" colspan="3" valign="top">
                    <t:insert attribute="HEADER"></t:insert>
                </td>
            </tr>
            <tr>
                <td height="30"  width="100%" valign="top">
                    <t:insert attribute="MENU"></t:insert>
                </td>
                </tr>
                <tr>
                <td  width="800" valign="top">
                    <t:insert attribute="BODY"></t:insert>
                </td>
            </tr>
             <tr>
                <td height="120" colspan="3" valign="top">
                    <t:insert attribute="FOOTER"></t:insert>
                </td>
            </tr>
        </table>
    </body>
</html>
