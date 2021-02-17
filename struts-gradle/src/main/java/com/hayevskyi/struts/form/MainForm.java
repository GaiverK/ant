package com.hayevskyi.struts.form;

import org.apache.struts.action.ActionForm;

public class MainForm extends ActionForm {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
