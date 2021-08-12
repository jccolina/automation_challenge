package com.jcolina.core.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextUtils {

    public static String getRegexPattern(final String text, final String regex, final int group) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        return matcher.group(group);
    }

    public static void printCharsFromText(final String text, final int numberOfChars) {
        String textToPrint = text.substring(0, numberOfChars);
        System.out.println(textToPrint);
    }
}
