package student_sergey_egorichev.lesson_4.level_1.task_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter some number (integer): ");
        Scanner scanner = new Scanner(System.in);
        int someNumber = scanner.nextInt();

        int modulo = someNumber % 2;

        if (modulo == 0) {
            System.out.println(someNumber + " is even.");
        } else {
            System.out.println(someNumber + " is odd.");
        }
    }
}
