package student_sergey_egorichev.lesson_6.level_1.task_6;

public class NumberUtilsTest {

    public static void main(String[] args) {
        isEvenTest();
    }

    private static void printTestResult(String testName, boolean result) {
        if (result) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    public static void isEvenTest() {
        NumberUtils nUtils = new NumberUtils();
        printTestResult("Is Even Test", nUtils.isEven(8));
    }

}
