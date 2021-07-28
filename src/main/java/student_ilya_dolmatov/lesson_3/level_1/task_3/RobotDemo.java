package student_ilya_dolmatov.lesson_3.level_1.task_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class RobotDemo {

	@CodeReviewComment(teacher = "ZayacVolk - переменные в Java принято называть с маленткой буквы."
			+ "Это нужно для лучшей читаемости кода.")
    public static void main(String[] args) {
        Robot zayacVolk = new Robot();
    }
}
