package com.itb.wave8.demo.utils;

public class DemoUtils {

    private static final int STRING_LENGTH = 6;

    public static String[] generateRandomWords(int arrayLength) {
        String response[] = new String[arrayLength];
        for (int i = 0; i < response.length; i++) {
            response[i] = getAlphaNumericString(STRING_LENGTH);
        }
        return response;
    }

    static String getAlphaNumericString(int stringLength) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(stringLength);

        for (int i = 0; i < stringLength; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}
