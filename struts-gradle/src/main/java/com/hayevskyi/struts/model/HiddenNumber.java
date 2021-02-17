package com.hayevskyi.struts.model;

import java.util.Random;

public class HiddenNumber {
    private final int MIN_NUMBER = 0;
    private final int MAX_NUMBER = 10;
    private int hiddenNumber;

    public HiddenNumber() {
        this.hiddenNumber = getRandomNumberUsingNextInt(MIN_NUMBER, MAX_NUMBER);
    }

    private int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void changeHiddenNumber() {
        this.hiddenNumber = getRandomNumberUsingNextInt(MIN_NUMBER, MAX_NUMBER);
    }

    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public int getMIN_NUMBER() {
        return MIN_NUMBER;
    }

    public int getMAX_NUMBER() {
        return MAX_NUMBER;
    }
}
