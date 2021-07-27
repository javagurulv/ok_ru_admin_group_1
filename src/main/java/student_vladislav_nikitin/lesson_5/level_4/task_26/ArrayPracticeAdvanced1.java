package student_vladislav_nikitin.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class ArrayPracticeAdvanced1 {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arrayLength = getUserInt("Input length of array: ", scanner);
        array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100);
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("array[%d] = %d\n", i, array[i]);
        }
    }

    public static int getUserInt(String message, Scanner scanner) {
        while (true) {
            System.out.print(message);
            if (! scanner.hasNextInt()) {
                System.out.println(scanner.next() + " is not integer!");
                continue;
            }
            return scanner.nextInt();
        }
    }
}
