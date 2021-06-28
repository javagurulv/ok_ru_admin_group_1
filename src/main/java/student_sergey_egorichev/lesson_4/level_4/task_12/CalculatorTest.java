package student_sergey_egorichev.lesson_4.level_4.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.multTest();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;

        Calculator calc = new Calculator();
        int realResult = calc.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test  = OK");
        } else {
            System.out.println("Sum test  = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 15;
        int secondNumber = 10;
        int expectedResult = 5;

        Calculator calc = new Calculator();
        int realResult = calc.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test  = OK");
        } else {
            System.out.println("Sub test  = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 15;
        int secondNumber = 3;
        int expectedResult = 5;

        Calculator calc = new Calculator();
        int realResult = calc.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test  = OK");
        } else {
            System.out.println("Div test  = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        int expectedResult = 15;

        Calculator calc = new Calculator();
        int realResult = calc.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mult test = OK");
        } else {
            System.out.println("Mult test = FAIL");
        }
    }
}
