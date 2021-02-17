package com.hayevskyi.struts.form;

import org.apache.struts.action.ActionForm;

public class AboutForm extends ActionForm {
    private String rule = "Try to find a hidden number in range 0-10, " +
            "the system will give you some advice after every input";
    private String buttonText = "Back to game";

    public String getRule() {
        return rule;
    }

    public String getButtonText() {
        return buttonText;
    }
}
