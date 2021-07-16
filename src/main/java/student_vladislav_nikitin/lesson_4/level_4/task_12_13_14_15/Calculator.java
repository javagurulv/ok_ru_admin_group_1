package student_vladislav_nikitin.lesson_4.level_4.task_12_13_14_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {
    public static int summing(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static double division(int firstNumber, int secondNumber) {
        return Double.valueOf(firstNumber) / Double.valueOf(secondNumber);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int max2num(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }

    public static int max3num(int firstNumber, int secondNumber, int thirdNumber) {
        int[] numbers = {firstNumber, secondNumber, thirdNumber};
        int maxNumber = firstNumber;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        return maxNumber;
    }
}

