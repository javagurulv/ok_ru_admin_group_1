package student_sergey_egorichev.lesson_4.level_4.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.multTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersGreaterFirstTest();
        calculatorTest.maxOfTwoNumbersLessFirstTest();
        calculatorTest.maxOfTwoNumbersEqualTest();
        calculatorTest.maxOfThreeNumbersFirstGreaterTest();
        calculatorTest.maxOfThreeNumbersSecondGreaterTest();
        calculatorTest.maxOfThreeNumbersThirdGreaterTest();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
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

    public  void isEvenTest() {
        int evenNumber = 4;
        int oddNumber = 5;

        Calculator calc = new Calculator();

        boolean evenResult = calc.isEven(evenNumber);
        boolean oddResult = calc.isEven(oddNumber);

        if (evenResult && !oddResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void maxOfTwoNumbersGreaterFirstTest() {
        int greaterNumber = 8;
        int lessNumber = 3;
        int expectedResult = 8;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(greaterNumber, lessNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of two numbers test (greater first)= OK");
        } else {
            System.out.println("Max of two numbers test (greater first)= FAIL");
        }
    }

    public void maxOfTwoNumbersLessFirstTest() {
        int greaterNumber = 8;
        int lessNumber = 3;
        int expectedResult = 8;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(lessNumber, greaterNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of two numbers test (lower first) = OK");
        } else {
            System.out.println("Max of two numbers test (lower first) = FAIL");
        }
    }

    public void maxOfTwoNumbersEqualTest() {
        int firstNmuber = 8;
        int secondNumber = 8;
        int expectedResult = 8;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfTwoNumbers(firstNmuber, secondNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of two numbers test (equal) = OK");
        } else {
            System.out.println("Max of two numbers test (equal) = FAIL");
        }
    }

    public void maxOfThreeNumbersFirstGreaterTest() {
        int firstNmuber = 8;
        int secondNumber = 3;
        int thirdNumber = 6;
        int expectedResult = 8;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test (first greater) = OK");
        } else {
            System.out.println("Max of three numbers test (first greater) = FAIL");
        }
    }

    public void maxOfThreeNumbersSecondGreaterTest() {
        int firstNmuber = 8;
        int secondNumber = 12;
        int thirdNumber = 6;
        int expectedResult = 12;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test (second greater) = OK");
        } else {
            System.out.println("Max of three numbers test (second greater) = FAIL");
        }
    }

    public void maxOfThreeNumbersThirdGreaterTest() {
        int firstNmuber = 8;
        int secondNumber = 3;
        int thirdNumber = 14;
        int expectedResult = 14;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test (third greater) = OK");
        } else {
            System.out.println("Max of three numbers test (third greater) = FAIL");
        }
    }

    public void maxOfThreeNumbersTest2() {
        int firstNmuber = 8;
        int secondNumber = 8;
        int thirdNumber = 3;
        int expectedResult = 8;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test ((a=b)>c) = OK");
        } else {
            System.out.println("Max of three numbers test ((a=b)>c) = FAIL");
        }
    }

    public void maxOfThreeNumbersTest3() {
        int firstNmuber = 3;
        int secondNumber = 8;
        int thirdNumber = 8;
        int expectedResult = 8;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test (a<(b=c)) = OK");
        } else {
            System.out.println("Max of three numbers test (a<(b=c)) = FAIL");
        }
    }

    public void maxOfThreeNumbersTest4() {
        int firstNmuber = 13;
        int secondNumber = 8;
        int thirdNumber = 8;
        int expectedResult = 13;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test (a>(b=c)) = OK");
        } else {
            System.out.println("Max of three numbers test (a>(b=c)) = FAIL");
        }
    }

    public void maxOfThreeNumbersTest5() {
        int firstNmuber = 13;
        int secondNumber = 18;
        int thirdNumber = 13;
        int expectedResult = 18;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test (b>(a=c)) = OK");
        } else {
            System.out.println("Max of three numbers test (b>(a=c)) = FAIL");
        }
    }

    public void maxOfThreeNumbersTest6() {
        int firstNmuber = 13;
        int secondNumber = 13;
        int thirdNumber = 13;
        int expectedResult = 13;

        Calculator calc = new Calculator();
        int realResult = calc.maxOfThreeNumbers(firstNmuber, secondNumber, thirdNumber);

        if (realResult == expectedResult) {
            System.out.println("Max of three numbers test (b=a=c) = OK");
        } else {
            System.out.println("Max of three numbers test (b=a=c) = FAIL");
        }
    }
}
