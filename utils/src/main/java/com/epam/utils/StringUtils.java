package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            double num = Double.parseDouble(str);
            return num > 0;
        } catch (NumberFormatException e) {
            try {
                int num = Integer.parseInt(str);
                return num > 0;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
    }
}
