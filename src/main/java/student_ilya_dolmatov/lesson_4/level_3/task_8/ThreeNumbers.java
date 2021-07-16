package student_ilya_dolmatov.lesson_4.level_3.task_8;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;
//#TODO:FIX
@CodeReview(approved = false)
class ThreeNumbers {

	@CodeReviewComment(teacher = "Объект Scanner можно использовать многократно. "
			+ "Не нужно каждый раз создавать новый объект.")
    public static void main(String[] args) {
        System.out.println("Please input three numbers!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input 1st number!");
        int newValue1 = scanner.nextInt();

        System.out.println("Please input 2nd number!");
        int newValue2 = scanner.nextInt();

        System.out.println("Please input 3rd number!");
        int newValue3 = scanner.nextInt();

        if (newValue1 == newValue2 && newValue1 == newValue3) {
            System.out.println("All numbers are equal");
        } else if (newValue1 != newValue2 && newValue2 != newValue3 && newValue1 != newValue3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
