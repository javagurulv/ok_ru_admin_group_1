package student_ilya_dolmatov.lesson_4.level_2.task_6;

import java.util.Scanner;

class Less {
    public static void main(String[] args) {
        System.out.println("Please input two numbers!");

        System.out.println("Please input 1st number!");
        Scanner value1 = new Scanner(System.in);
        int newValue1 = value1.nextInt();

        System.out.println("Please input 2nd number!");
        Scanner value2 = new Scanner(System.in);
        int newValue2 = value2.nextInt();

        if (newValue1 == newValue2) {
            System.out.println("Numbers are same!");
        } else if (newValue1 > newValue2) {
            System.out.println(newValue2);
        } else {
            System.out.println(newValue1);
        }
    }
}
