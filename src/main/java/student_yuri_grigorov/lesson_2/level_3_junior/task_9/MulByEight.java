package student_yuri_grigorov.lesson_2.level_3_junior.task_9;

import teacher.codereview.CodeReview;

/**
 * The class MulByEight prints multiplication table by 8
 *
 * @author Yuri Grigorov
 */

@CodeReview(approved = true)
public class MulByEight {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("8 x " + i + " = " + 8 * i);
        }
    }
}
