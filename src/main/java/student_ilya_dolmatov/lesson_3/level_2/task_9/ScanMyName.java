package student_ilya_dolmatov.lesson_3.level_2.task_9;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class ScanMyName {

	@CodeReviewComment(teacher = "AskName, TravelerName  - переменные в Java принято называть с маленткой буквы."
			+ "Это нужно для лучшей читаемости кода.")
	public static void main(String[] args) {
        System.out.print("Hello traveler!\nIt's dangerous to go alone, say your name!\n");
        Scanner AskName = new Scanner(System.in);
        String TravelerName = AskName.next();
        System.out.print("May be force be with you, " + TravelerName + "!");
    }
}
