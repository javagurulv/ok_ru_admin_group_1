package student_ilya_dolmatov.lesson_5.level_4.task_25;

import java.util.Scanner;

class CustomArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input lenght of array");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];

        int i;
        for(i = 0 ; i < array.length; i++){
            System.out.println("Please input value for array index " + i);
            array[i] = scanner.nextInt();
        }

        for(i = 0 ; i < array.length; i++){
            System.out.println("Value for array index " + i + " is: " + array[i]);
        }

    }
}
