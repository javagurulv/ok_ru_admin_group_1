package student_ilya_dolmatov.lesson_4.level_4.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    CalculatorTest(){}

    void sumTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 7;
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        int realResult = calculator.sum();
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    void subTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        int realResult = calculator.sub();
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    void mulTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 10;
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        int realResult = calculator.mul();
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    void divTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 2;
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        int realResult = calculator.div();
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    void isEvenTest() {
        int firstNumber = 2;
        Boolean expectedResult = true;
        Calculator calculator = new Calculator(firstNumber);
        Boolean realResult = calculator.isEven();
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }
    void isFirstGreaterTest() {
        int firstNumber = 5;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        int realResult = calculator.maxOfTwoNumbers();
        if (realResult == expectedResult) {
            System.out.println("IsFirstGreaterTest test = OK");
        } else {
            System.out.println("IsFirstGreaterTest test = FAIL");
        }
    }
    void isSecondGreaterTest() {
        int firstNumber = 2;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        int realResult = calculator.maxOfTwoNumbers();
        if (realResult == expectedResult) {
            System.out.println("IsSecondGreaterTest test = OK");
        } else {
            System.out.println("IsSecondGreaterTest test = FAIL");
        }
    }
    void isBothEqTest() {
        int firstNumber = 2;
        int secondNumber = 2;
        int expectedResult = 2;
        Calculator calculator = new Calculator(firstNumber, secondNumber);
        int realResult = calculator.maxOfTwoNumbers();
        if (realResult == expectedResult) {
            System.out.println("IsBothEqTest test = OK");
        } else {
            System.out.println("IsBothEqTest test = FAIL");
        }
    }

    void firstOfThreeTest() {
        int firstNumber = 4;
        int secondNumber = 2;
        int thirdNumber = 3;
        int expectedResult = 4;
        Calculator calculator = new Calculator(firstNumber, secondNumber, thirdNumber);
        int realResult = calculator.maxOfThreeNumbers();
        if (realResult == expectedResult) {
            System.out.println("firstOfThreeTest test = OK");
        } else {
            System.out.println("firstOfThreeTest test = FAIL");
        }
    }
    void secondOfThreeTest() {
        int firstNumber = 4;
        int secondNumber = 5;
        int thirdNumber = 3;
        int expectedResult = 5;
        Calculator calculator = new Calculator(firstNumber, secondNumber, thirdNumber);
        int realResult = calculator.maxOfThreeNumbers();
        if (realResult == expectedResult) {
            System.out.println("secondOfThreeTest test = OK");
        } else {
            System.out.println("secondOfThreeTest test = FAIL");
        }
    }
    void thirdOfThreeTest() {
        int firstNumber = 4;
        int secondNumber = 2;
        int thirdNumber = 6;
        int expectedResult = 6;
        Calculator calculator = new Calculator(firstNumber, secondNumber, thirdNumber);
        int realResult = calculator.maxOfThreeNumbers();
        if (realResult == expectedResult) {
            System.out.println("thirdOfThreeTest test = OK");
        } else {
            System.out.println("thirdOfThreeTest test = FAIL");
        }
    }
    void firstTwoOfThreeTest() {
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 3;
        int expectedResult = 4;
        Calculator calculator = new Calculator(firstNumber, secondNumber, thirdNumber);
        int realResult = calculator.maxOfThreeNumbers();
        if (realResult == expectedResult) {
            System.out.println("firstTwoOfThreeTest test = OK");
        } else {
            System.out.println("firstTwoOfThreeTest test = FAIL");
        }
    }
    void equalOfThreeTest() {
        int firstNumber = 4;
        int secondNumber = 4;
        int thirdNumber = 4;
        int expectedResult = 4;
        Calculator calculator = new Calculator(firstNumber, secondNumber, thirdNumber);
        int realResult = calculator.maxOfThreeNumbers();
        if (realResult == expectedResult) {
            System.out.println("equalOfThreeTest test = OK");
        } else {
            System.out.println("equalOfThreeTest test = FAIL");
        }
    }
}