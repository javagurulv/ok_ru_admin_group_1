package student_ilya_dolmatov.lesson_4.level_3.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Indecrement {
    public static void main(String[] args) {
        System.out.println("Please input three numbers!");

        System.out.println("Please input 1st number!");
        Scanner value1 = new Scanner(System.in);
        int newValue1 = value1.nextInt();

        System.out.println("Please input 2nd number!");
        Scanner value2 = new Scanner(System.in);
        int newValue2 = value2.nextInt();

        System.out.println("Please input 3rd number!");
        Scanner value3 = new Scanner(System.in);
        int newValue3 = value3.nextInt();

        if (newValue1 < newValue2 && newValue2 < newValue3) {
            System.out.println("increasing");
        } else if (newValue1 > newValue2 && newValue2 > newValue3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
