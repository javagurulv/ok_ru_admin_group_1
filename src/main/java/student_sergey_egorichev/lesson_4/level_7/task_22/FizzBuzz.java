package student_sergey_egorichev.lesson_4.level_7.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {
    public String detect(int number) {
        boolean isFizz;
        boolean isBuzz;

        int mod3 = number % 3;
        if (mod3 == 0) {
            isFizz = true;
        } else {
            isFizz = false;
        }

        int mod5 = number % 5;
        if (mod5 == 0) {
            isBuzz = true;
        } else {
            isBuzz = false;
        }

        if (isFizz && !isBuzz) {
            return "Fizz";
        } else if (!isFizz && isBuzz) {
            return "Buzz";
        } else if (isFizz && isBuzz) {
            return "FizzBuzz";
        } else {
            return "" + number;
        }
    }
}
