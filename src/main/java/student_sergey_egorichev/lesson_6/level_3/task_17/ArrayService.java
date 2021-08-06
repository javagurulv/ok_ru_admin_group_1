package student_sergey_egorichev.lesson_6.level_3.task_17;

import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayService {

    /**
     * Returns true if numberToSearch contains in array
     *
     * @param array
     * @param numberToSearch
     */
    public static boolean hasNumber(int[] array, int numberToSearch) {

        return Arrays.stream(array).anyMatch(x -> x == numberToSearch);
    }

    /**
     * Returns number of occurrences numberToSearch in th array
     *
     * @param array
     * @param numberToSearch
     */
    public static int countOccurrences(int[] array, int numberToSearch) {

        int counter = 0;
        for (int element: array) {
            if (element == numberToSearch) {
                counter ++;
            }
        }

        return counter;
    }

    /**
     * Replaces the first occurrence of numberToReplace to newNumber in the array
     *
     * @param array Some arrray for replacing in
     * @param numberToReplace Number that will be replaced
     * @param newNumber New number for replacing
     */
    public static boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    /**
     * Replaces all occurrences of numberToReplace to newNumber in the array
     *
     * @param array Some arrray for replacing in
     * @param numberToReplace Number that will be replaced
     * @param newNumber New number for replacing
     */
    public static boolean replaceAll(int[] array, int numberToReplace, int newNumber) {
        boolean replaceSuccessful = false;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                replaceSuccessful = true;
            }
        }
        return replaceSuccessful;
    }

    /**
     * Make array inversion
     *
     * @param array some array
     */
    public static void invert(int [] array) {
        for (int i = 0; i < array.length / 2; i ++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    /**
     * Sort array
     *
     * @param array some array
     */
    public static void sort(int [] array) {
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
}
