package com.epam.jwd.view;

import java.util.Arrays;

public class MathView {
    public void printStatementValidity(String statement, boolean isValid) {
        System.out.println("Statement \"" + statement + "\" is" + (isValid ? "" : "not") + " valid");
    }

    public void printDouble(double num) {
        System.out.println("Expression result is " + num);
    }

    public void printDoubleArray(double[] arr) {
        System.out.println("Resulting array is " + Arrays.toString(arr));
    }
}
