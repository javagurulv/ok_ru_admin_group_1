package student_sergey_egorichev.lesson_7.level_6.task_30;

public class CalculatorTest {

    public static void main(String[] args) {
        sumNumbersTest1();
        sumNumbersTest2();
    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    static void sumNumbersTest1() {
        checkTestResult("Sum Numbers (4 numbers)",
                Calculator.sumNumbers(1,2,3,4) == 10);
    }

    static void sumNumbersTest2() {
        checkTestResult("Sum Numbers (6 numbers)",
                Calculator.sumNumbers(1,2,3,4,7,1) == 18);
    }
}
