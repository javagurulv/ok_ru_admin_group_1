package student_yuri_grigorov.lesson_4.level_4_junior.task_11_15;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.addTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
        calculatorTest.maxOfThreeNumbersTest8();
        calculatorTest.maxOfThreeNumbersTest9();
    }

    public void addTest() {
        int a = 10;
        int b = 5;
        int res = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.add(a, b);
        if (realResult == res) {
            System.out.println("Add test = OK");
        } else {
            System.out.println("Add test = FAIL");
        }
    }

    public void subTest() {
        int a = 8;
        int b = 2;
        int res = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(a, b);
        if (realResult == res) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int a = 3;
        int b = 4;
        int res = 12;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(a, b);
        if (realResult == res) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int a = 24;
        int b = 6;
        int res = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(a, b);
        if (realResult == res) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest1() {
        int a = 1;
        int b = 2;
        String testName = "maxOfTwoNumbers test: " + a + b;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfTwoNumbers(a, b) == 2, testName);
    }

    public void maxOfTwoNumbersTest2() {
        int a = 2;
        int b = 1;
        String testName = "maxOfTwoNumbers test: " + a + b;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfTwoNumbers(a, b) == 2, testName);
    }

    public void maxOfTwoNumbersTest3() {
        int a = 2;
        int b = 2;
        String testName = "maxOfTwoNumbers test: " + a + b;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfTwoNumbers(a, b) == 2, testName);
    }

    public void maxOfThreeNumbersTest1() {
        int a = 3;
        int b = 3;
        int c = 3;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest3() {
        int a = 2;
        int b = 3;
        int c = 3;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest4() {
        int a = 1;
        int b = 2;
        int c = 3;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest5() {
        int a = 1;
        int b = 3;
        int c = 2;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest6() {
        int a = 2;
        int b = 1;
        int c = 3;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest7() {
        int a = 2;
        int b = 3;
        int c = 1;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest8() {
        int a = 3;
        int b = 1;
        int c = 2;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    public void maxOfThreeNumbersTest9() {
        int a = 3;
        int b = 2;
        int c = 1;
        String testName = "maxOfThreeNumbers test: " + a + b + c;
        Calculator calculator = new Calculator();
        doTest(calculator.maxOfThreeNumbers(a, b, c) == 3, testName);
    }

    private void doTest(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK" : testName + " = FAIL";
        System.out.println(msg);
    }

}
