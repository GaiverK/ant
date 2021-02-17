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
    public static final String NO_INPUT_ERROR = "Please input number in range %d - %d";
    private HiddenNumber hiddenNumber = new HiddenNumber();


    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {

        MainForm mainForm = (MainForm) form;
        ActionForward forward = mapping.getInputForward();
        ActionErrors errors = new ActionErrors();
        String restart = request.getParameter("restart");

        if (restart != null && restart.equals("1")) {
            hiddenNumber.changeHiddenNumber();
            forward = mapping.findForward("restart");
            return forward;
        }

        return getActionForward(mapping, request, mainForm, forward, errors);
    }

    private ActionForward getActionForward(ActionMapping mapping,
                                           HttpServletRequest request,
                                           MainForm mainForm,
                                           ActionForward forward,
                                           ActionErrors errors) {
        if (mainForm == null) {
            errors.add("",
                    new ActionMessage(NO_INPUT_ERROR,
                            hiddenNumber.getMIN_NUMBER(),
                            hiddenNumber.getMAX_NUMBER()));
            saveErrors(request, errors);
        } else if (mainForm.getNumber() == hiddenNumber.getHiddenNumber()) {
            forward = mapping.findForward("success");
        } else {
            errors.add("", (mainForm.getNumber()
                    > hiddenNumber.getHiddenNumber()
                    ? getMessageBiggerThanCurrent()
                    : getMessageLessThanCurrent()));

            saveErrors(request, errors);
        }
        return forward;
    }

    private ActionMessage getMessageBiggerThanCurrent() {
        return new ActionMessage("bigger.error");
    }

    private ActionMessage getMessageLessThanCurrent() {
        return new ActionMessage("less.error");
    }

}
