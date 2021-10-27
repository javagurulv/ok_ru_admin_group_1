package student_petr_zaytsev.lesson_5.level_2;

import java.util.Scanner;

public class PrintListElementsUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arrayLength = 3;

        int [] numbers = new int[arrayLength];

        // fill array
        int i;
        for (i = 0; i < arrayLength; i++) {
            System.out.println("Enter int: ");
            int n = scanner.nextInt();
            numbers[i] = n;
        }

        // print array
        int x;
        for (x = 0; x < arrayLength; x++) {
            System.out.println(numbers[x]);
        }
    }
}
