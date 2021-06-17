package student_yuri_grigorov.lesson_2.level_2_intern.task_8;

import java.util.Scanner;

/**
 * Class HelloUser asks user to enter some name and prints greeting "Hello <USER>"
 *
 * @author Yuri Grigorov
 */

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        System.out.println("Hello " + scanner.next());
    }
}
