<%-- 
    Document   : mybook
    Created on : Jun 28, 2015, 12:38:19 PM
    Author     : DELL
--%>
<%@page import="java.sql.* " %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body background="image/clouds1.jpg"><br><br><h1><i><center>Your bookings are-</center></i></h1><br><br><br><br>
        <%int flag=0;
            String name=(String)request.getAttribute("k11");
            String password=(String)request.getAttribute("k22");
            String email=(String)request.getAttribute("k33");
            
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from booking");
       
        while(rs.next()){
        if(name.equals(rs.getString(2)) && password.equals(rs.getString(8)) && email.equals(rs.getString(7))){
        String fno=rs.getString(1);
        int tic=rs.getInt(5);
         ResultSet rrs=stmt.executeQuery("Select * from flight");
        while(rrs.next()){
            flag=1;
        if(fno.equals(rrs.getString(1))){
        String so=rrs.getString(2);
        String de=rrs.getString(3);
        out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Flight no- "+fno+"&nbsp;&nbsp;&nbsp;&nbsp;Source- "+so+"&nbsp;&nbsp;&nbsp;&nbsp;Destination- "+de+"&nbsp;&nbsp;&nbsp;&nbsp;No of Seats-"+tic);
        }}}}
        if(flag==0)
        {
       out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;||OOPS|| &nbsp;&nbsp; YOU HAVE NOT MADE ANY BOOKINGS YET! &nbsp;&nbsp; GO AHEAD...BOOK A TICKET...PACK YOUR BAGS AND EXPLORE THE WORLD&nbsp;!!");
        }
        %>
    </body>
</html>
