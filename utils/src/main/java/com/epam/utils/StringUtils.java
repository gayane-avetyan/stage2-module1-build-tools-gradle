package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null) {
            return false;
        }

        try {
            int num = Integer.parseInt(str);
            return num > 0;
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
