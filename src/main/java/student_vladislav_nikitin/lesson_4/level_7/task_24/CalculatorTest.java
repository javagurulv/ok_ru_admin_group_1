package student_vladislav_nikitin.lesson_4.level_7.task_24;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;

        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);

        System.out.println(testResult(result == 75, "Sum"));
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;

        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);

        System.out.println(testResult(result == 20, "Sub"));
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;

        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);

        System.out.println(testResult(result == 25, "Mul"));
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;

        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);

        System.out.println(testResult(result == 5, "Div"));
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);

        System.out.println(testResult(result, "isEven"));
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);

        System.out.println(testResult(result == false, "isEven"));
    }

    public String testResult(boolean condition, String testName) {
        String testOut = testName + " test = ";
        return condition ? testOut + "OK" : testOut + "FAIL";
    }
}
