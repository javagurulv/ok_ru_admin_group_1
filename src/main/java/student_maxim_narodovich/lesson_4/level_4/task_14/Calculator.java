package student_maxim_narodovich.lesson_4.level_4.task_14;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction (int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int multiplication (int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public double division (int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        }
        else {
            return secondNumber;
        }
    }

}
