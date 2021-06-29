package student_ilya_dolmatov.lesson_4.level_1.task_4;

import java.util.Scanner;

class Modulo {
    public static void main(String[] args) {
        System.out.println("Please input int number!");
        Scanner value = new Scanner(System.in);
        int newValue = value.nextInt();

        if ((newValue % 2) == 0){
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }

    }

}
