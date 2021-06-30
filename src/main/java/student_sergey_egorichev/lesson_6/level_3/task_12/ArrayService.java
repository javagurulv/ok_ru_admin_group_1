package student_sergey_egorichev.lesson_6.level_3.task_12;

import java.util.Arrays;

public class ArrayService {

    public static boolean hasNumber(int[] array, int numberToSearch) {

        /**
         * Returns true if numberToSearch contains in array
         *
         * @param array
         * @param numberToSearch
         */
        return Arrays.stream(array).anyMatch(x -> x == numberToSearch);
    }

}
