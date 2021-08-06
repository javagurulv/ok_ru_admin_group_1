package student_vladislav_nikitin.lesson_5.level_4.task_25;

import java.util.Scanner;

class ArrayPracticeAdvanced0 {
    public static void main(String[] args) {
        int[] array;
        Scanner scanner = new Scanner(System.in);

        int arrayLength = getUserInt("Input length of array: ", scanner);
        array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            String message = "Input integer " + Integer.valueOf(i + 1) + ": ";
            array[i] = getUserInt(message, scanner);
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
