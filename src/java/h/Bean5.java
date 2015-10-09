/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author POOJA YADAV
 */
public class Bean5 extends org.apache.struts.action.ActionForm {
    
    private String t1;
    private String t2;
    private String t3;

    /**
     * @return the t1
     */
    public String getT1() {
        return t1;
    }

    /**
     * @param t1 the t1 to set
     */
    public void setT1(String t1) {
        this.t1 = t1;
    }

    /**
     * @return the t2
     */
    public String getT2() {
        return t2;
    }

    /**
     * @param t2 the t2 to set
     */
    public void setT2(String t2) {
        this.t2 = t2;
    }

    /**
     * @return the t3
     */
    public String getT3() {
        return t3;
    }

    /**
     * @param t3 the t3 to set
     */
    public void setT3(String t3) {
        this.t3 = t3;
    }
    
    
}
