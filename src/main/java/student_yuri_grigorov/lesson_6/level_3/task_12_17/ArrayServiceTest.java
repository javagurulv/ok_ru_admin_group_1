package student_yuri_grigorov.lesson_6.level_3.task_12_17;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsTest();
        test.countOccurrencesTest();
        test.replaceFirstTest();
        test.replaceAllTest();
        test.revertTest();
        test.sortTest();
    }

    public void containsTest() {
        int[] inputValues = {2, 5, 7, 9, 4};
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.contains(inputValues, 5), "contains - test return value (true)");
        checkTestResult(!arrayService.contains(inputValues, 1), "contains - test return value (false)");
    }

    public void countOccurrencesTest() {
        int[] inputValues = {2, 5, 7, 9, 4, 5};
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.countOccurrences(inputValues, 5) == 2, "countOccurrences - test return value (n > 0)");
        checkTestResult(arrayService.countOccurrences(inputValues, 1) == 0, "countOccurrences - test return value (n = 0)");
    }

    public void replaceFirstTest() {
        int[] inputValues = {2, 5, 7, 5};
        int numberToReplace = 5;
        int newNumber = 11;
        int[] expectedValues = {2, 11, 7, 5};
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.replaceFirst(inputValues, numberToReplace, newNumber), "replaceFirst - test return value");
        checkTestResult(Arrays.equals(inputValues, expectedValues), "replaceFirst - test array content");
    }

    public void replaceAllTest() {
        int[] inputValues = {2, 5, 7, 5};
        int numberToReplace = 5;
        int newNumber = 11;
        int[] expectedValues = {2, 11, 7, 11};
        ArrayService arrayService = new ArrayService();
        checkTestResult(arrayService.replaceAll(inputValues, numberToReplace, newNumber) == 2, "replaceAll - test return value");
        checkTestResult(Arrays.equals(inputValues, expectedValues), "replaceAll - test array content");
    }

    public void revertTest() {
        int[] inputValues = {1, 2, 3, 4, 5};
        int[] expectedValues = {5, 4, 3, 2, 1};
        ArrayService arrayService = new ArrayService();
        arrayService.revert(inputValues);
        checkTestResult(Arrays.equals(inputValues, expectedValues), "revert - test");
    }

    public void sortTest() {
        int[] inputValues = {3, 1, 2, 5, 4};
        int[] expectedValues = {1, 2, 3, 4, 5};
        ArrayService arrayService = new ArrayService();
        arrayService.sort(inputValues);
        checkTestResult(Arrays.equals(inputValues, expectedValues), "sort - test");
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
