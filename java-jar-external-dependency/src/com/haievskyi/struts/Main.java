package com.haievskyi.struts;

import org.apache.commons.text.RandomStringGenerator;

public class Main {

    public static final int SEQUENCE_LENGTH = 10;
    public static final int RANGE_START = 33;
    public static final int RANGE_STOP = 45;

    public static void main(String[] args) {
        System.out.println("Random characters sequence: " + generateRandomSpecialCharacters(SEQUENCE_LENGTH));
    }

    private static String generateRandomSpecialCharacters(int length) {
        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(RANGE_START, RANGE_STOP)
                .build();
        return pwdGenerator.generate(length);
    }
}
