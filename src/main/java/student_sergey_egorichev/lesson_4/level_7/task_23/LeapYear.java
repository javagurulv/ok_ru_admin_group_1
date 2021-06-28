package student_sergey_egorichev.lesson_4.level_7.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYear {
    public boolean isLeapYear(int year) {
        if (!isDiv4(year)) {
            return false;
        } else if (!isDiv100(year) && isDiv4(year)) {
            return true;
        } if (isDiv100(year) && isDiv400(year)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDiv4(int number) {
        if (number % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDiv100(int number) {
        if (number % 100 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDiv400(int number) {
        if (number % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
