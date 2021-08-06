package student_ilya_dolmatov.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class CustomRandomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input lenght of array");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        int i;
        Random random = new Random();
        for(i = 0 ; i < array.length; i++){
            array[i] = random.nextInt(100);
        }

        for(i = 0 ; i < array.length; i++){
            System.out.println("Value for array index " + i + " is: " + array[i]);
        }
    }
}
