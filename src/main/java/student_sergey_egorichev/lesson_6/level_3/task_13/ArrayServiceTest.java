package student_sergey_egorichev.lesson_6.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayServiceTest {

    /**
     * Main function. Starts tests.
     */
    public static void main(String[] args) {
        hasNumberTest();
        hasNumberNegativeTest();
        countOccurrencesTest();
        countOccurrencesZeroCountTest();

    }

    /**
     * Check result and print tests execution status.
     *
     * @param testName Name of test for human-readable output.
     * @param testResult Result of test method.
     */
    private static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    /**
     * Test situation "the number is contained in the array"
     */
    private static void hasNumberTest () {
        int[] array = {5, 12, 26, 14};
        int numberToSearch = 12;
        checkTestResult("Has Number",
                ArrayService.hasNumber(array, numberToSearch));

    }

    /**
     * Test situation "the number is not contained in the array"
     */
    private static void hasNumberNegativeTest () {
        int[] array = {5, 12, 26, 14};
        int numberToSearch = 24;
        checkTestResult("Has Number (Negative)",
                !ArrayService.hasNumber(array, numberToSearch));

    }

    /**
     * Tests the method counts number of occurrences numberToSearch in array
     */
    private static void countOccurrencesTest () {
        int[] testArray = new int[]{3, 2, 4, 3, 6};
        int numberToSearch = 3;
        int expectedResult = 2;

        checkTestResult("Count Occurences",
                ArrayService.countOccurrences(testArray, numberToSearch) == expectedResult);
    }

    /**
     * Tests the method returns 0 if number is not contained in array
     */
    private static void countOccurrencesZeroCountTest () {
        int[] testArray = new int[]{3, 2, 4, 3, 6};
        int numberToSearch = 8;
        int expectedResult = 0;

        checkTestResult("Count Occurences (zero count)",
                ArrayService.countOccurrences(testArray, numberToSearch) == expectedResult);
    }

}
