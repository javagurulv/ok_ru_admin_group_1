package student_sergey_egorichev.lesson_3.level_2.task_9;

import java.util.Scanner;

public class NiceToMeetYou {
    public static void main(String[] args) {
        ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hi, my name is roboPetrovich. And what is yours?: ");
        String userName = scanner.nextLine();

        System.out.println("Hi " + userName + "!");
    }
}
