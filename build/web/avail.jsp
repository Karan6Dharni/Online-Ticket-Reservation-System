<%-- 
    Document   : avail
    Created on : Jun 21, 2015, 10:47:19 PM
    Author     : DELL
--%>
<%@page import="java.sql.* " %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><p:form method="post" action="/log11">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="image/clouds1.jpg">
        <h1>Flights are available!</h1>
        <h4>The details are-</h4>
        <%
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
          session.setAttribute("f",day);
          int price=rs.getInt(7);
          session.setAttribute("pp", price);
          String company=rs.getString(6);
          int seats=rs.getInt(8);
          out.println("<br> Flight no. -"+fno+"&nbsp;&nbsp;&nbsp;&nbsp;Time- "+time+"&nbsp;&nbsp;&nbsp;&nbsp;Price- "+price+"&nbsp;&nbsp;&nbsp;&nbsp;Company- "+company+"&nbsp;&nbsp;&nbsp;&nbsp;Available Seats-- "+seats);
          }
          }
        %>
        <br><br>
        Enter Desired Flight no-&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="t1" />
        <br><br>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" name="Submit" value="Book" />
      
    </p:form></body>
</html>
