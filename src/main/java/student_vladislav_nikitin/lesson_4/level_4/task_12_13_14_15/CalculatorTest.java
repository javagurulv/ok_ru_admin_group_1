package student_vladislav_nikitin.lesson_4.level_4.task_12_13_14_15;

import java.text.DecimalFormat;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.minusTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();

        calculatorTest.isEvenTrueTest();
        calculatorTest.isEvenFalseTest();

        calculatorTest.max2numFirstGreaterTest();
        calculatorTest.max2numSecondGreaterTest();
        calculatorTest.max2numEqualsTest();

        calculatorTest.max3numFirstGreaterThanOtherTest();
        calculatorTest.max3numSecondGreaterThanOtherTest();
        calculatorTest.max3numThirdGreaterThanOtherTest();

        calculatorTest.max3numFirst2EqualsGreaterTest();
        calculatorTest.max3numLast2EqualsGreaterTest();
        calculatorTest.max3numFirstLastEqualsGreaterTest();

        calculatorTest.max3numFirst2EqualsLessTest();
        calculatorTest.max3numLast2EqualsLessTest();
        calculatorTest.max3numFirstLastEqualsLessTest();

        calculatorTest.max3numAllEqualsTest();
    }

    void sumTest() {
        int firstNumber = 23;
        int secondNumber = 42;
        int expectedResult = 65;

        if (expectedResult == Calculator.summing(firstNumber, secondNumber)) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void minusTest() {
        int firstNumber = 23;
        int secondNumber = 42;
        int expectedResult = -19;

        if (expectedResult == Calculator.subtraction(firstNumber, secondNumber)) {
            System.out.println("Minus test = OK");
        } else {
            System.out.println("Minus test = FAIL");
        }
    }

    void multiplyTest() {
        int firstNumber = 23;
        int secondNumber = 42;
        int expectedResult = 966;

        if (expectedResult == Calculator.multiplication(firstNumber, secondNumber)) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    void divideTest() {
        int firstNumber = 23;
        int secondNumber = 42;
        double expectedResult = 0.547619;

        String realResult = new DecimalFormat("#.######").format(Calculator.division(firstNumber, secondNumber));

        if (expectedResult == Double.valueOf(realResult)) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    void isEvenTrueTest() {
        int number = 42;
        boolean expectedResult = true;

        if (Calculator.isEven(number)) {
            System.out.println("isEvenTrue test = OK");
        } else {
            System.out.println("isEvenTrue test = FAIL");
        }
    }

    void isEvenFalseTest() {
        int number = 777;
        boolean expectedResult = false;

        if (Calculator.isEven(number)) {
            System.out.println("isEvenFalse test = FAIL");
        } else {
            System.out.println("isEvenFalse test = OK");
        }
    }

    void max2numFirstGreaterTest() {
        int firstNumber = 42;
        int secondNumber = 34;

        if (firstNumber == Calculator.max2num(firstNumber, secondNumber)) {
            System.out.println("max2numFirstGreater test = OK");
        } else {
            System.out.println("max2numFirstGreater test = FAIL");
        }
    }

    void max2numSecondGreaterTest() {
        int firstNumber = 34;
        int secondNumber = 42;

        if (secondNumber == Calculator.max2num(firstNumber, secondNumber)) {
            System.out.println("max2numFirstGreater test = OK");
        } else {
            System.out.println("max2numFirstGreater test = FAIL");
        }
    }

    void max2numEqualsTest() {
        int firstNumber = 42;
        int secondNumber = 42;
        int expectedResult = 42;

        if (expectedResult == Calculator.max2num(firstNumber, secondNumber)) {
            System.out.println("max2numEquals test = OK");
        } else {
            System.out.println("max2numEquals test = FAIL");
        }
    }

    void max3numFirstGreaterThanOtherTest() {
        int firstNumber = 42;
        int secondNumber = 23;
        int thirdNumber = 34;

        if (firstNumber == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numFirstGreaterThanOther test = OK");
        } else {
            System.out.println("max3numFirstGreaterThanOther test = FAIL");
        }
    }

    void max3numSecondGreaterThanOtherTest() {
        int firstNumber = 23;
        int secondNumber = 42;
        int thirdNumber = 34;

        if (secondNumber == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numSecondGreaterThanOther test = OK");
        } else {
            System.out.println("max3numSecondGreaterThanOther test = FAIL");
        }
    }

    void max3numThirdGreaterThanOtherTest() {
        int firstNumber = 23;
        int secondNumber = 34;
        int thirdNumber = 42;

        if (thirdNumber == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numThirdGreaterThanOther test = OK");
        } else {
            System.out.println("max3numThirdGreaterThanOther test = FAIL");
        }
    }

    void max3numFirst2EqualsGreaterTest() {
        int firstNumber = 42;
        int secondNumber = 42;
        int thirdNumber = 34;
        int expectedResult = 42;

        if (expectedResult == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numFirst2EqualsGreater test = OK");
        } else {
            System.out.println("max3numFirst2EqualsGreater test = FAIL");
        }
    }

    void max3numLast2EqualsGreaterTest() {
        int firstNumber = 34;
        int secondNumber = 42;
        int thirdNumber = 42;
        int expectedResult = 42;

        if (expectedResult == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numLast2EqualsGreater test = OK");
        } else {
            System.out.println("max3numLast2EqualsGreater test = FAIL");
        }
    }

    void max3numFirstLastEqualsGreaterTest() {
        int firstNumber = 42;
        int secondNumber = 34;
        int thirdNumber = 42;
        int expectedResult = 42;

        if (expectedResult == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numFirstLastEqualsGreater test = OK");
        } else {
            System.out.println("max3numFirstLastEqualsGreater test = FAIL");
        }
    }

    void max3numFirst2EqualsLessTest() {
        int firstNumber = 34;
        int secondNumber = 34;
        int thirdNumber = 42;
        int expectedResult = 42;

        if (expectedResult == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numFirst2EqualsLess test = OK");
        } else {
            System.out.println("max3numFirst2EqualsLess test = FAIL");
        }
    }

    void max3numLast2EqualsLessTest() {
        int firstNumber = 42;
        int secondNumber = 34;
        int thirdNumber = 34;
        int expectedResult = 42;

        if (expectedResult == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numLast2EqualsLess test = OK");
        } else {
            System.out.println("max3numLast2EqualsLess test = FAIL");
        }
    }

    void max3numFirstLastEqualsLessTest() {
        int firstNumber = 34;
        int secondNumber = 42;
        int thirdNumber = 34;
        int expectedResult = 42;

        if (expectedResult == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numFirstLastEqualsLess test = OK");
        } else {
            System.out.println("max3numFirstLastEqualsLess test = FAIL");
        }
    }

    void max3numAllEqualsTest() {
        int firstNumber = 42;
        int secondNumber = 42;
        int thirdNumber = 42;
        int expectedResult = 42;

        if (expectedResult == Calculator.max3num(firstNumber, secondNumber, thirdNumber)) {
            System.out.println("max3numAllEquals test = OK");
        } else {
            System.out.println("max3numAllEquals test = FAIL");
        }
    }

}
