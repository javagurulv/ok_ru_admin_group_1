package student_maxim_narodovich.lesson_4.level_4.task_15;

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
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            return firstNumber;
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }

}
