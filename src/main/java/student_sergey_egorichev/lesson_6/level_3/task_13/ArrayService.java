package student_sergey_egorichev.lesson_6.level_3.task_13;

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

}
