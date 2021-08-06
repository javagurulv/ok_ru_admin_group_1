package student_ilya_dolmatov.lesson_5.level_2.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AskArray {
    public static void main(String[] args) {
        int[] array = new int[3];

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i < array.length){
            System.out.println("Please input value for array index " + i + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        i = 0;
        while(i < array.length){
            System.out.println("Array index " + i + " = " + array[i]);
            i++;
        }

    }
}
