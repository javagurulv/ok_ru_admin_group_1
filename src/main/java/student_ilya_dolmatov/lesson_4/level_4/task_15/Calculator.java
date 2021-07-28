package student_ilya_dolmatov.lesson_4.level_4.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {
    int firstNumber;
    int secondNumber;
    int thirdNumber;



    Calculator(int firstNumber){
        this.firstNumber = firstNumber;
    }
    Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    Calculator(int firstNumber, int secondNumber, int thirdNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    int sum() {
        return this.firstNumber + this.secondNumber;
    }
    int sub() {
        return this.firstNumber - this.secondNumber;
    }
    int mul() {
        return this.firstNumber * this.secondNumber;
    }
    int div() {
        return this.firstNumber / this.secondNumber;
    }
    boolean isEven() {
        if (this.firstNumber % 2 == 0) { return true; } else { return false;}
    }
    int maxOfTwoNumbers() {
        if (firstNumber == secondNumber) {
            return firstNumber;
        } else if(firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    int maxOfThreeNumbers() {
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            return firstNumber;
        } else if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            return firstNumber;
        } else if(secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}