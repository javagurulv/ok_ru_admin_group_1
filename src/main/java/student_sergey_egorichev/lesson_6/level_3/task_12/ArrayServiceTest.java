package student_sergey_egorichev.lesson_6.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayServiceTest {

    public static void main(String[] args) {

        /**
         * Main function. Starts tests.
         */
        hasNumberTest();
        hasNumberFailTest();

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
        /**
         * Test situation "the number is contained in the array"
         */
        int[] array = {5, 12, 26, 14};
        int numberToSearch = 12;
        checkTestResult("Has Number",
                ArrayService.hasNumber(array, numberToSearch));

    }

    private static void hasNumberFailTest () {
        /**
         * Test situation "the number is not contained in the array"
         */
        int[] array = {5, 12, 26, 14};
        int numberToSearch = 24;
        checkTestResult("Has Number (Fail)",
                !ArrayService.hasNumber(array, numberToSearch));

    }

}
