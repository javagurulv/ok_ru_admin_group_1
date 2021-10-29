package student_petr_zaytsev.lesson_6.level_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayService {
    public boolean ArrayContains(int[] array, int number) {

        return IntStream.of(array).anyMatch(x -> x == number);

    }

    public int countOccurrences(int[] arr, int x)
    {
        int counter = 0;
        for (int element: arr) {
            if (element == x) {
                counter ++;
            }
        }

        return counter;
    }

    public int[] replaceFirstOccurrence(int[] arr, int present, int replace)
    {
        int counter = 0;
        for (int element: arr) {
            if (element == present) {
                arr[counter] = replace;
                return arr;
            }
            counter ++;
        }
        return arr;
    }

    public int[] replaceAllOccurrence(int[] arr, int present, int replace)
    {
        int counter = 0;
        for (int element: arr) {
            if (element == present) {
                arr[counter] = replace;
            }
            counter ++;
        }
        return arr;
    }

    public int[] invertIntArray(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return arr;

    }

    void sortArray(int[] arr) {

        Arrays.sort(arr);

    }

}
