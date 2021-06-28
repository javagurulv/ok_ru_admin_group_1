package student_maxim_narodovich.lesson_2.level_2.task_8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class HelloUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whats your name? ");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");
    }
}
