package student_petr_zaytsev.lesson_5.level_5;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int [] numbers = new int[arrayLength];

        return numbers;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random rand = new Random();

        int i;
        for (i = 0; i < array.length; i++) {
            int n = rand.nextInt();
            array[i] = n;
        }
    }

    public void printArrayToConsole(int[] array) {
        int x;
        System.out.println("Array content: ");
        for (x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }
    }

    public int findMaxNumber(int[] array) {
        int total;
        total = array.length;

        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (array[i] > array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[total-1];
    }

    public int findMinNumber(int[] array) {
        int total;
        total = array.length;

        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[total-1];
    }

}