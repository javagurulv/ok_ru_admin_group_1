package student_sergey_egorichev.lesson_6.level_3.task_12;

public class ArrayServiceTest {

    public static void main(String[] args) {

        /**
         * Main function. Starts tests.
         */
        hasNumberTest();

    }

    private static void checkTestResult(String testName, boolean testResult) {

        /**
         * Check result and print tests execution status.
         *
         * @param testName Name of test for human-readable output.
         * @param testResult Result of test method.
         */
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    private static void hasNumberTest () {
        int[] array = {5, 12, 26, 14};
        int numberToSearch = 12;
        checkTestResult("Has Number",
                ArrayService.hasNumber(array, numberToSearch));

    }

}
