package com.hayevskyi.struts.controller;

import com.hayevskyi.struts.form.MainForm;
import com.hayevskyi.struts.model.HiddenNumber;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction extends Action {
    private static final String REQUEST_RESTART = "restart";
    private static final String DO_RESTART = "1";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        ActionForward forward;
        String restart = request.getParameter(REQUEST_RESTART);
        MainForm mainForm = (MainForm) form;

        if (restart != null && restart.equals(DO_RESTART)) {
            mainForm.getHiddenNumber().changeHiddenNumber();
            forward = mapping.findForward(REQUEST_RESTART);
            return forward;
        }

        return mapping.findForward("success");
    }
}
