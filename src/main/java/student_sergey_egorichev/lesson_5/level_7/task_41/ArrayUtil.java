package student_sergey_egorichev.lesson_5.level_7.task_41;

import java.util.Arrays;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtil {

    public static int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public static int[] getArrayByUser(int length) {
        Scanner scnr = new Scanner(System.in);
        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = scnr.nextInt();
        }
        return numbers;
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }

    public static void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static int findMaxNumber(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

    public static int findMinNumber(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    public static int[] getEven(int[] array) {
        int evenArrayLength = 0;
        int evenCount = 0;
        for (int i = 0; i < array.length; i  ++) {
            if (array[i] % 2 == 0) {
                evenArrayLength ++;
            }
        }
        int[] evenArray = new int[evenArrayLength];
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount ++;
            }
        }
        return evenArray;
    }

    public static int[] getOdd(int[] array) {
        int oddArrayLength = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i  ++) {
            if (array[i] % 2 != 0) {
                oddArrayLength ++;
            }
        }
        int[] oddArray = new int[oddArrayLength];
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 2 != 0) {
                oddArray[oddCount] = array[i];
                oddCount ++;
            }
        }
        return oddArray;
    }

}
