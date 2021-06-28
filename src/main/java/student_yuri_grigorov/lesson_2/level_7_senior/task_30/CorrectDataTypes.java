package student_yuri_grigorov.lesson_2.level_7_senior.task_30;

import teacher.codereview.CodeReview;

/**
 * Fix the code
 *
 * public class CorrectDataTypes {
 *
 * 	public static void main(String[] args) {
 *
 * 		int numberOne = 10;
 * 		double numberTwo = 20.0;
 *
 * 		System.out.println("Number 1 = " + numberOne);
 * 		System.out.println("Number 2 = " + numberTwo);
 *
 * 		float sum = numberOne + numberTwo;
 *
 * 		System.out.println("Sum = " + sum);
 *        }
 *
 * }
 *
 * @author Yuri Grigorov
 */

@CodeReview(approved = true)
public class CorrectDataTypes {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        float sum = numberOne + (float)numberTwo;

        System.out.println("Sum = " + sum);
    }
}
