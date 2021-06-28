package student_maxim_narodovich.lesson_2.level_7.task_29;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "При объявлении переменной сразу присваивай ей начальное значение."
		+ "Не надо это разносить на две строки (line 13 - 17)")
public class SumTwoNumbers {

    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        numberOne = 10;
        numberTwo = 20;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);



        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}
