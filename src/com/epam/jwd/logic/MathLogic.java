package com.epam.jwd.logic;

public class MathLogic {
    //task 1
    public boolean checkDigitsSumsEquality(int num) {
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits[0] + digits[1] == digits[2] + digits[3];
    }

    //task 5
    public double[] powRealNumbers(double a, double b, double c) {
        double[] numbers = {a, b, c};
        for (int i = 0; i < 3; i++) {
            numbers[i] = (numbers[i] > 0) ? Math.pow(numbers[i], 2) : Math.pow(numbers[i], 4);
        }
        return numbers;
    }

    //task 6
    public double calcMinMaxSum(double a, double b, double c) {
        double min = Math.min(Math.min(a, b), c);
        double max = Math.max(Math.max(a, b), c);
        return min + max;
    }
}
