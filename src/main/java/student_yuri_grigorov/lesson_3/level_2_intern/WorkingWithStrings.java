package student_yuri_grigorov.lesson_3.level_2_intern;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WorkingWithStrings {

    public static void main(String[] args) {
        //Task 7
        String myName = "Yuri";
        System.out.println(myName);

        //Task 8
        String userName = "Yuri";
        System.out.println("Hello " + userName + "!");

        //Task 9
        System.out.print("Enter some name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
    }
}
