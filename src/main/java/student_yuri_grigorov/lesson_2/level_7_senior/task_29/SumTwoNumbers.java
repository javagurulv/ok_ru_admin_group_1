package student_yuri_grigorov.lesson_2.level_7_senior.task_29;

import teacher.codereview.CodeReview;

/**
 * Fix the code
 *
 * public class SumTwoNumbers {
 *
 * 	public static void main(String[] args) {
 *
 * 		int numberOne;
 * 		int numberTwo;
 *
 * 		System.out.println("Number 1 = " + numberOne);
 * 		System.out.println("Number 2 = " + numberTwo);
 *
 * 		int numberOne = 10;
 * 		int numberTwo = 20;
 *
 * 		int sum = numberOne + numberTwo;
 *
 * 		System.out.println("Sum = " + sum);
 *        }
 *
 * }
 *
 * @author Yuri Grigorov
 */

@CodeReview(approved = true)
public class SumTwoNumbers {
    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }
}
