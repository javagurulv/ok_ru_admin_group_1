package student_yuri_grigorov.lesson_4.level_4_junior.task_11_15;

class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return (firstNumber >= secondNumber) ? firstNumber : secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int[] numSet = {firstNumber, secondNumber, thirdNumber};
        int maxVal = numSet[0];
        for (int i = 1; i < numSet.length; i++) {
            if (numSet[i] > maxVal) {
                maxVal = numSet[i];
            }
        }
        return maxVal;
    }
}
