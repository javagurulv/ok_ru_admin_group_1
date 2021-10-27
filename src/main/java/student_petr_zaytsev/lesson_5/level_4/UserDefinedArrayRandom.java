package student_petr_zaytsev.lesson_5.level_4;

import java.util.Scanner;
import java.util.Random;

public class UserDefinedArrayRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();

        // create array
        int [] numbers = new int[length];

        // now get random numbers
        Random rand = new Random();
        int i;
        for (i = 0; i < length; i++) {
            int n = rand.nextInt();
            numbers[i] = n;
        }

        // print array
        int x;
        System.out.println("Array content: ");
        for (x = 0; x < length; x++) {
            System.out.println(numbers[x]);
        }
    }
}
