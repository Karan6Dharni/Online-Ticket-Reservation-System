/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author DELL
 */
public class Action2 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String SUCCESS = "success";
   
    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Bean2 lb=(Bean2)form;
        String source=lb.getT1();
        String destination=lb.getT2();
        String day=lb.getT3();
      
        Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
           Statement stmt=con.createStatement();
           ResultSet rs=stmt.executeQuery("Select * from flight");
           
           while(rs.next()){
            if(source.equals(rs.getString(2)) && destination.equals(rs.getString(3)) && day.equals(rs.getString(4)))
            {
            
           
           //HttpSession session=request.getSession(true);
            //session.setAttribute("key1",source);
            request.setAttribute("key1", source);
            request.setAttribute("key2", destination);
            request.setAttribute("key3", day);
            
            return mapping.findForward("avail");
            
            //session.setAttribute("key2",destination);
            //session.setAttribute("key3",day);
            }
            
           }
         
         
               
           
        return mapping.findForward("navail");
    }
}
