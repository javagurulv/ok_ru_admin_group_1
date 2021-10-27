package student_petr_zaytsev.lesson_5.level_2;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class DoubleArrayPrint {

    public static void main(String[] args) {

        Random rand = new Random();

        int arrayLength = 3;

        int [] numbers = new int[arrayLength];

        int i;
        for (i = 0; i < arrayLength; i++) {

            int n = rand.nextInt();
            int value = n/2;
            numbers[i] = value;
            System.out.println(numbers[i]);
            // "double" it right here. it's not n*2 to be sure it's int
            numbers[i] = n;
        }

        int x;
        for (x = 0; x < arrayLength; x++) {

            System.out.println(numbers[x]);

        }

    }
}
