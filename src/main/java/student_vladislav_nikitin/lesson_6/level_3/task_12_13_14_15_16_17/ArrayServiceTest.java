package student_vladislav_nikitin.lesson_6.level_3.task_12_13_14_15_16_17;

import java.util.Arrays;

class ArrayServiceTest {
    public int[] testArray = {7, 42, 4, 6, 2, 4};
    private int[] revertTestArray = {4, 2, 6, 4, 42, 7};
    private int[] sortedTestArray = {2, 4, 4, 6, 7, 42};

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();

        arrayServiceTest.containsNumberTest(2, true, "Should contains number");
        arrayServiceTest.containsNumberTest(3, false, "Shouldn't contains number");

        arrayServiceTest.countOccurrenceTest(4, 2, "Array contains number more than 0");
        arrayServiceTest.countOccurrenceTest(3, 0, "Array not contains number");

        arrayServiceTest.replaceFirstTest(4, 999, true, "First element should replaced");
        arrayServiceTest.replaceFirstTest(3, 999, false, "First element shouldn't replaced");

        arrayServiceTest.replaceAllTest(4, 999, true, "All elements should replaced");
        arrayServiceTest.replaceAllTest(3, 999, false, "Elements shouldn't replaced");

        arrayServiceTest.reverseTest(arrayServiceTest.revertTestArray, "Array should be inverted");

        arrayServiceTest.sortTest(arrayServiceTest.sortedTestArray, "Array should be sorted");
    }

    void sortTest(int[] expectedResult, String nameOfTestString) {
        int[] array = testArray.clone();
        ArrayService arrayService = new ArrayService();
        arrayService.sort(array);

        testResult(Arrays.equals(array, expectedResult), nameOfTestString);
    }

    void reverseTest(int[] expectedResult, String nameOfTestString) {
        int[] array = testArray.clone();
        ArrayService arrayService = new ArrayService();
        arrayService.reverse(array);

        testResult(Arrays.equals(array, expectedResult), nameOfTestString);
    }

    void replaceAllTest(int numberToReplace, int newNumber, boolean expectedResult, String nameOfTestString) {
        int[] array = testArray.clone();
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.replaceAll(array, numberToReplace, newNumber);

        testResult(result == expectedResult, nameOfTestString);
    }

    void replaceFirstTest(int numberToReplace, int newNumber, boolean expectedResult, String nameOfTestString) {
        int[] array = testArray.clone();
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.replaceFirst(array, numberToReplace, newNumber);

        testResult(result == expectedResult, nameOfTestString);
    }

    void countOccurrenceTest(int number, int expectedResult, String nameOfTestString) {
        int[] array = testArray.clone();
        ArrayService arrayService = new ArrayService();
        int result = arrayService.countOccurrence(array, number);

        testResult(result == expectedResult, nameOfTestString);
    }

    void containsNumberTest(int number, boolean expectedResult, String nameOfTestString) {
        int[] array = testArray.clone();
        ArrayService arrayService = new ArrayService();
        boolean result = arrayService.containsNumber(array, number);

        testResult(result == expectedResult, nameOfTestString);
    }

    private void testResult(boolean condition, String nameOfTest) {
        String fullOutOfTest = nameOfTest + " = ";
        System.out.println(condition ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

}
