package com.iot.app.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private Parser() {

    }

    public static String getFirstWord(String input) {
        Matcher match = Pattern.compile("(?<=^[\\s\"']*)(\\w+)").matcher(input);

        if (match.find()) {
            return match.group(1);
        }

        return "";
    }
}
