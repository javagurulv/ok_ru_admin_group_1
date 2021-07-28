package student_petr_zaytsev.lesson_2.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CorrectDataTypes {

    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        // it could be double, but if we need float...
        // another way could be to change flot to double and safe memory
        float sum = (float) numberOne + (float) numberTwo;

        System.out.println("Sum = " + sum);
    }

}
