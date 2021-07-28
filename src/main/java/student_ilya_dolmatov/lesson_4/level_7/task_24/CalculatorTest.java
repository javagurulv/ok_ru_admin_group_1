package student_ilya_dolmatov.lesson_4.level_7.task_24;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    int firstNumber = 7;
    int secondNumber = 10;
    Calculator test = new Calculator();

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.sumTest();
        test.subTest();
        test.mulTest();
        test.divTest();
        test.isEvenTest();
    }

    void sumTest() {
        int expectedResult = 17;
        String testName = "Sum test";
        int result = test.sum(firstNumber, secondNumber);
        checkResult(result, expectedResult, testName);
    }

    void subTest() {
        int expectedResult = -3;
        String testName = "Sub test";
        int result = test.sub(firstNumber, secondNumber);
        checkResult(result, expectedResult, testName);
    }

    void mulTest() {
        int expectedResult = 70;
        String testName = "Mul test";
        int result = test.mul(firstNumber, secondNumber);
        checkResult(result, expectedResult, testName);
    }

    void divTest() {
        int expectedResult = 0;
        String testName = "Div test";
        int result = test.div(firstNumber, secondNumber);
        checkResult(result, expectedResult, testName);
    }

    void isEvenTest() {
        boolean expectedResult = false;
        String testName = "Even test";
        boolean result = test.isEven(firstNumber);
        checkResult(result, expectedResult, testName);
    }

    void checkResult(int result, int expectedResult, String testName){
        if(result == expectedResult){
            System.out.println(testName + " is OK");
        } else System.out.println(testName + " is FALSE");
    }
    void checkResult(boolean result, boolean expectedResult, String testName){
        if(result == expectedResult){
            System.out.println(testName + " is OK");
        } else System.out.println(testName + " is FALSE");
    }
}
