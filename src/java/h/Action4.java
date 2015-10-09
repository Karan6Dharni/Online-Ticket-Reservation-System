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
public class Action4 extends org.apache.struts.action.Action {

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
        Bean4 bn=(Bean4)form;
        String name=bn.getT1();
        String age=bn.getT2();
        String phone=bn.getT3();
        int tickets=bn.getT4();
        String address=bn.getT5();
        String email=bn.getT6();
        String password=bn.getT7();
        HttpSession session=request.getSession(false);
        String fno=(String)session.getAttribute("key4");
        session.setAttribute("tt", tickets);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","password");
        PreparedStatement pst=con.prepareStatement("insert into booking values (?,?,?,?,?,?,?,?)");
        pst.setString(1, fno);
        pst.setString(2, name);
        pst.setString(3, age);
        pst.setString(4, phone);
        pst.setInt(5, tickets);
        pst.setString(6, address);
        pst.setString(7, email);
        pst.setString(8, password);
        int status=pst.executeUpdate();
        session.setAttribute("o", name);
        session.setAttribute("aaa", age);
        
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from flight");
        while(rs.next()){
        if(fno.equals(rs.getString(1))){
        int s=rs.getInt(8);
        s=s-tickets;
        PreparedStatement psst=con.prepareStatement("update flight set seats=? where fno =?");
        psst.setInt(1,s);
        psst.setString(2,fno);
        int statuss=psst.executeUpdate();
        }
        
        }
        
        
        
        SUCCESS="main20";
        return mapping.findForward(SUCCESS);
    }
}
