package student_petr_zaytsev.lesson_6.level_3;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.arrayContains();
        test.arrayContainsNot();
        test.occurrenciesCount();
        test.replaceFirstOccurrenceTest();
        test.replaceAllOccurrenceTest();
        test.testRevertedArray();
        test.testSortArray();
    }

    public void arrayContains() {

        int [] array =  {1, 2, 3, 4, 5};
        int number = 1;
        ArrayService detector = new ArrayService();
        boolean result = detector.ArrayContains(array, number);

        if (result) {
            System.out.println("Array contains number = OK");
        } else {
            System.out.println("Array contains number = FAIL");
        }

    }

    public void arrayContainsNot() {

        int [] array =  {1, 2, 3, 4, 5};
        int number = 6;
        ArrayService detector = new ArrayService();
        boolean result = detector.ArrayContains(array, number);

        if (result) {
            System.out.println("Array doesn't contain number = FAIL");
        } else {
            System.out.println("Array doesn't contain number = OK");
        }

    }

    public void occurrenciesCount() {

        int [] array =  {1, 2, 3, 4, 5, 5, 5};
        int number = 5;
        ArrayService detector = new ArrayService();
        int result = detector.countOccurrences(array, number);

        if (result == 3) {
            System.out.println("Count works = OK");
        } else {
            System.out.println("Count works = FAIL");
        }

    }

    public void replaceFirstOccurrenceTest() {

        int [] array =  {1, 2, 3, 4, 5, 5, 5};
        int [] expected = {1, 2, 3, 4, 9, 5, 5};
        int searched = 5;
        int replacement = 9;
        ArrayService detector = new ArrayService();
        int [] result = detector.replaceFirstOccurrence(array, searched, replacement);

        if (Arrays.equals(expected, result)) {
            System.out.println("First replacement works = OK");
        } else {
            System.out.println("First replacement works = FAIL");
        }

    }

    public void replaceAllOccurrenceTest() {

        int [] array =  {1, 2, 3, 4, 5, 5, 5};
        int [] expected = {1, 2, 3, 4, 9, 9, 9};
        int searched = 5;
        int replacement = 9;
        ArrayService detector = new ArrayService();
        int [] result = detector.replaceAllOccurrence(array, searched, replacement);

        if (Arrays.equals(expected, result)) {
            System.out.println("All replacement works = OK");
        } else {
            System.out.println("All replacement works = FAIL");
        }

    }

    public void testRevertedArray() {

        int [] array =  {1, 2, 3, 4,};
        int [] expected = {4, 3, 2, 1};
        ArrayService detector = new ArrayService();
        int [] result = detector.invertIntArray(array);

        if (Arrays.equals(expected, result)) {
            System.out.println("All replacement works = OK");
        } else {
            System.out.println("All replacement works = FAIL");
        }

    }

    public void testSortArray() {

        int [] array =  {1, 3, 2, 4,};
        int [] expected = {1, 2, 3, 4};
        ArrayService detector = new ArrayService();
        detector.sortArray(array);

        if (Arrays.equals(expected, array)) {
            System.out.println("Sort works = OK");
        } else {
            System.out.println("Sort works = FAIL");
        }

    }

}
