package com.hayevskyi.struts.form;

import com.hayevskyi.struts.model.HiddenNumber;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

public class MainForm extends ActionForm {
    private int number;
    private HiddenNumber hiddenNumber = new HiddenNumber();

    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        if (number < hiddenNumber.getMIN_NUMBER()
                || number > hiddenNumber.getMAX_NUMBER()) {
            errors.add("",
                    new ActionMessage("range.error"));

        } else if (number != hiddenNumber.getNumber()) {
            errors.add("", (number
                    > hiddenNumber.getNumber()
                    ? getMessageBiggerThanCurrent()
                    : getMessageLessThanCurrent()));

        }

        return errors;
    }

    private ActionMessage getMessageBiggerThanCurrent() {
        return new ActionMessage("bigger.error");
    }

    private ActionMessage getMessageLessThanCurrent() {
        return new ActionMessage("less.error");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public HiddenNumber getHiddenNumber() {
        return hiddenNumber;
    }

    public void setHiddenNumber(HiddenNumber hiddenNumber) {
        this.hiddenNumber = hiddenNumber;
    }
}
