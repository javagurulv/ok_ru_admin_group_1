package student_sergey_kuzmin.lesson_2.level_2_intern.task_8;

import java.util.Scanner;

public class WhatsURname {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you name:");
        String username = input.next();

        System.out.println(
                "Hello " + username + "!"
        );
    }
}
