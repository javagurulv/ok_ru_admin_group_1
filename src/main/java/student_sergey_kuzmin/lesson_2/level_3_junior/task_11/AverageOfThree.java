package student_sergey_kuzmin.lesson_2.level_3_junior.task_11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class AverageOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double sum = 0;
        double avg;
        int i;
        for (i = 1; i <= 3; i++){
            System.out.println("Please enter number " + i);
            sum = sum + input.nextInt();
        }
        avg = sum / i;
        System.out.println("Average is " + avg);
    }
}