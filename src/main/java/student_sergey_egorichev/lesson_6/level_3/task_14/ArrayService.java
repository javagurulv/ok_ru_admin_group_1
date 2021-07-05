package student_sergey_egorichev.lesson_6.level_3.task_14;

import java.util.Arrays;

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

}
