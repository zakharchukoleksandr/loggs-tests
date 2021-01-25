package ua.mainacademy.servic;

public class NumberServes {

    public static int getSum(int number) {
        int result = 0;
        String text =String.valueOf(number);
        char[]symbols =text.toCharArray();
        for (char symbol : symbols ) {
            result+=Character.getNumericValue(symbol);
        }
        return result;
    }
}1
