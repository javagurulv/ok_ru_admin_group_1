package student_maxim_narodovich.lesson_3.level_2.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ScanUserName {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Whats your name?");
        String userName = in.nextLine();

        System.out.println("Hi " + userName + "!");

    }
}
