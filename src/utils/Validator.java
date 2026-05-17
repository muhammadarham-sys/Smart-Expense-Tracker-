package utils;

public class Validator {
    public static boolean isValidAmount(String text) {
        try {
            return Double.parseDouble(text) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}