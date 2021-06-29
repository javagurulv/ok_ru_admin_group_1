package student_ilya_dolmatov.lesson_4.level_1.task_3;

import java.util.Scanner;

class Calendar {
    public static void main(String[] args) {

        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println("Please input day of week number: 1-7");
        Scanner value = new Scanner(System.in);
        int newValue =  value.nextInt();
//        while (newValue <= 0 || newValue > 7) {
        if (newValue <= 0 || newValue > 7) { // Just for case of using if-else statement
            System.out.println("Please input only numbers between 1 and 7!");
//            System.out.println("Please input day of week number: 1-7");
//            value = new Scanner(System.in);
//            newValue =  value.nextInt();
        } else { System.out.println(week[newValue-1]); }
    }
}
