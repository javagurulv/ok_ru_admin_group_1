package student_vladislav_nikitin.lesson_5.level_2.task_11;

import java.util.Random;
import java.util.Scanner;

class ArrayPractice1 {

    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.printf("Please enter int number %d: ", i+1);
                if (! scanner.hasNextInt()) {
                    System.out.println(scanner.next() + " is not int!");
                    continue;
                }
                arr[i] = scanner.nextInt();
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

}
