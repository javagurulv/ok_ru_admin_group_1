package student_petr_zaytsev.lesson_4.level_4;

import java.util.Scanner;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        int remains = number% 2;
        if (remains == 0)
            return true;
        else
            return false;
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int dif = firstNumber - secondNumber;
        if (dif > 0) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int CompareThreeIntegers(int x, int y, int z) {
            int first_set = x - y; // 5   10
            int second_set = y - z; // -15   5
            int third_set = z - x; // 10   20

            if  (first_set <= 0) { //  y > x
                if (second_set <= 0) { // z > y
                    return z;
                } else {
                    return y;
                }
            } else { // y < x
                if ( third_set <= 0) { // x > z
                    return x;
                } else {
                    return z;
                }
            }
        }


}

