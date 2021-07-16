package student_sergey_egorichev.lesson_6.level_3.task_17;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayServiceTest {

    /**
     * Main function. Starts tests.
     */
    public static void main(String[] args) {
        // hasNumber()
        hasNumberTest();
        hasNumberNegativeTest();

        // countOccurrences()
        countOccurrencesTest();
        countOccurrencesZeroCountTest();

        // replaceFirst()
        replaceFirstPositiveTest();
        replaceFirstNegativeTest();
        replaceFirstReplacedTest();
        replaceFirstNotReplacedTest();

        // replaceAll()
        replaceAllPositiveTest();
        replaceAllNegativeTest();
        replaceAllReplacedTest();
        replaceAllNotReplacedTest();

        // invert()
        intvertTest();

        // sort()
        sortNotSortedTest();
        sortSortedTest();

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

    private static void replaceFirstPositiveTest () {
        int[] testArray = new int[] {1, 2, 4, 4};
        checkTestResult("Replace First (Positive)",
                ArrayService.replaceFirst(testArray, 4, 3));
    }

    private static void replaceFirstNegativeTest () {
        int[] testArray = new int[] {1, 2, 4, 4};
        checkTestResult("Replace First (Negative)",
                !ArrayService.replaceFirst(testArray, 5, 3));
    }

    private static void replaceFirstReplacedTest () {
        int[] testArray = new int[] {1, 2, 4, 4};
        int[] expectedArray = new int[] {1, 2, 3, 4};
        ArrayService.replaceFirst(testArray, 4, 3);
        checkTestResult("Replace First (Replace number)",
                Arrays.equals(testArray, expectedArray));
    }

    private static void replaceFirstNotReplacedTest () {
        int[] testArray = new int[] {1, 2, 4, 4};
        int[] expectedArray = new int[] {1, 2, 4, 4};
        ArrayService.replaceFirst(testArray, 5, 3);
        checkTestResult("Replace First (Not in array)",
                Arrays.equals(testArray, expectedArray));
    }

    private static void replaceAllPositiveTest () {
        int[] testArray = new int[] {1, 2, 4, 5, 4, 6};
        checkTestResult("Replace All (Positive)",
                ArrayService.replaceAll(testArray, 4, 8));
    }

    private static void replaceAllNegativeTest () {
        int[] testArray = new int[] {1, 2, 4, 5, 4, 6};
        checkTestResult("Replace All (Negative)",
                !ArrayService.replaceAll(testArray, 7, 8));
    }

    private static void replaceAllReplacedTest () {
        int[] testArray = new int[] {1, 2, 4, 5, 4, 6};
        int[] expectedArray = new int[] {1, 2, 8, 5, 8, 6};
        ArrayService.replaceAll(testArray, 4, 8);
        checkTestResult("Replace All (Replace number)",
                Arrays.equals(testArray, expectedArray));
    }

    private static void replaceAllNotReplacedTest () {
        int[] testArray = new int[] {1, 2, 4, 5, 4, 6};
        int[] expectedArray = new int[] {1, 2, 4, 5, 4, 6};
        ArrayService.replaceAll(testArray, 7, 8);
        checkTestResult("Replace All (Not in array)",
                Arrays.equals(testArray, expectedArray));
    }

    private static void intvertTest () {
        int [] testArray = new int [] {1, 2, 3, 4, 5};
        int [] expectedArray = new int [] {5, 4, 3, 2, 1};
        ArrayService.invert(testArray);
        checkTestResult("Invert Array",
                Arrays.equals(testArray, expectedArray));
    }

    private static void sortNotSortedTest () {
        int [] testArray = new int[] {2, 4, 3, 1, 5};
        int [] expectedArray = new int [] {1, 2, 3, 4, 5};
        ArrayService.sort(testArray);
        checkTestResult("Sort (not sorted in)",
                Arrays.equals(testArray, expectedArray));
    }

    private static void sortSortedTest () {
        int [] testArray = new int[] {1, 2, 3, 4, 5};
        int [] expectedArray = new int [] {1, 2, 3, 4, 5};
        ArrayService.sort(testArray);
        checkTestResult("Sort (sorted in)",
                Arrays.equals(testArray, expectedArray));
    }

}
