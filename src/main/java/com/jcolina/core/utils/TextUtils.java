package com.jcolina.core.utils;

public class TextUtils {

    public static String removeEmojis(final String text) {
        String allowedChars = "[\\x{0001f300}-\\x{0001f64f}]|[\\x{0001f680}-\\x{0001f914}]";
        return text.replaceAll(allowedChars, "");
    }

    public static void printCharsFromText(final String text, final int numberOfChars) {
        String textToPrint = text.substring(0, numberOfChars);
        System.out.println(textToPrint);
    }
}
