package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) {
            return false;
        }
        try {
            int num = Integer.parseInt(str);
            int firstLetter =  Integer.parseInt(str.substring(0, 1));
            return num > 0 && firstLetter > 0;
        } catch (NumberFormatException e) {
            try {
                double num = Double.parseDouble(str);
                return num > 0;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
    }
}
