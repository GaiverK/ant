package com.hayevskyi.struts.model;

import java.util.Random;

public class HiddenNumber {
    private final int MIN_NUMBER = 0;
    private final int MAX_NUMBER = 10;
    private int number;

    public HiddenNumber() {
        this.number = getRandomNumberUsingNextInt(MIN_NUMBER, MAX_NUMBER);
    }

    private int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void changeHiddenNumber() {
        this.number = getRandomNumberUsingNextInt(MIN_NUMBER, MAX_NUMBER);
    }

    public int getNumber() {
        return number;
    }

    public int getMIN_NUMBER() {
        return MIN_NUMBER;
    }

    public int getMAX_NUMBER() {
        return MAX_NUMBER;
    }
}
