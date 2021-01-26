package ua.mainacademy.servis;

public class NumberServes {


    public static Integer getSum(int number) {//12345 -> 15
        int result = 0;

        String text = getText(number);
        char[] symbols = text.toCharArray();
        for (char symbol : symbols) {
            result += Character.getNumericValue(symbol);

        }
        return result;
    }

    private static String getText(int number) {
        return String.valueOf(number);
    }
}
