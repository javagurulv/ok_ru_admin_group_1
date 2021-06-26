package student_sergey_egorichev.lesson_4.level_4.task_15;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        int modulo = number % 2;
        if (modulo == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        int result;

        int a = firstNumber;
        int b = secondNumber;
        int c = thirdNumber;

        if (((a > b) && (a > c)) ||
                ((a == b) && (a > c))) {
            result = a;
        } else if (((b > c) && (b > a)) ||
                ((b == c) && (b > a))) {
            result = b;
        } else if ((c > a) && (c > b) ||
                ((c == a) && (c > b))) {
            result = c;
        } else {
            result = firstNumber;
        }
        return result;
    }
}