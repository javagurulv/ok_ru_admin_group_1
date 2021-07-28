package student_sergey_egorichev.lesson_6.level_1.task_6;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class NumberUtils {

	@CodeReviewComment(teacher = "Упрости реализацию до одной строки! return number % 2 == 0;")
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}