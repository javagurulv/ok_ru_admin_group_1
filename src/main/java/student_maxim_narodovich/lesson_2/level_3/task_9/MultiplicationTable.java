package student_maxim_narodovich.lesson_2.level_3.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input digit please: ");
        Integer userDigit = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(userDigit + " x " + i + " = " + (userDigit * i));
        }

    }
}
