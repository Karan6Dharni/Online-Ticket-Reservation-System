/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h;
import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author POOJA YADAV
 */
public class Action5 extends org.apache.struts.action.Action {

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
        
        Bean5 bf=(Bean5)form;
        String name=bf.getT1();
        String password=bf.getT2();
        String email=bf.getT3();
        request.setAttribute("k11", name);
        request.setAttribute("k22", password);
        request.setAttribute("k33", email);
        SUCCESS="main19";
        
        return mapping.findForward(SUCCESS);
    }
}
