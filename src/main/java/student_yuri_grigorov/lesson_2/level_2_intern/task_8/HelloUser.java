package student_yuri_grigorov.lesson_2.level_2_intern.task_8;

import java.util.Scanner;

import teacher.codereview.CodeReview;

/**
 * Class HelloUser asks user to enter some name and prints greeting "Hello <USER>"
 *
 * @author Yuri Grigorov
 */


@CodeReview(approved = true)
public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        System.out.println("Hello " + scanner.next());
    }
}
