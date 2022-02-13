package com.epam.jwd.controller;

import com.epam.jwd.input.MathInput;
import com.epam.jwd.logic.MathLogic;
import com.epam.jwd.view.MathView;

public class MathController {
    private MathInput input = new MathInput();
    private MathLogic logic = new MathLogic();
    private MathView view = new MathView();

    //task 1
    public void checkDigitsSumsEquality() {
        int num = input.inputFourDigitPositiveInteger("Enter 4-digit positive integer number.");
        boolean areEqual = logic.checkDigitsSumsEquality(num);
        view.printStatementValidity("Sums of first two and last two digits are equal", areEqual);
    }

    //task 5
    public void powRealNumbers() {
        double a = input.inputDouble("Enter first rational number.");
        double b = input.inputDouble("Enter second rational number.");
        double c = input.inputDouble("Enter third rational number.");
        double sum = logic.calcMinMaxSum(a, b, c);
        view.printDouble(sum);
    }

    //task 6
    public void calcMinMaxSum() {
        double a = input.inputDouble("Enter first rational number.");
        double b = input.inputDouble("Enter second rational number.");
        double c = input.inputDouble("Enter third rational number.");
        double[] increasedNumbers = logic.powRealNumbers(a, b, c);
        view.printDoubleArray(increasedNumbers);
    }

    public static void main(String[] args) {
        MathController controller = new MathController();
        controller.checkDigitsSumsEquality();
        controller.powRealNumbers();
        controller.calcMinMaxSum();
    }
}
