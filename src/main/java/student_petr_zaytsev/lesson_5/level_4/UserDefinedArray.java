package student_petr_zaytsev.lesson_5.level_4;

import java.util.Scanner;

public class UserDefinedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();

        // create array
        int [] numbers = new int[length];

        // now get numbers from user
        int i;
        for (i = 0; i < length; i++) {
            System.out.println("Enter int: ");
            int n = scanner.nextInt();
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
