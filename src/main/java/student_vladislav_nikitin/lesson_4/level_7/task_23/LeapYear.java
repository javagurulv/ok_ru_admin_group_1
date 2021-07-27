package student_vladislav_nikitin.lesson_4.level_7.task_23;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (! dividedBy4(year)) {
            return false;
        }

        if (! dividedBy100(year)) {
            return true;
        }

        if (dividedBy400(year)) {
            return true;
        }

        return false;
    }

    private boolean dividedBy4(int number) {
        return (number % 4) == 0;
    }

    private boolean dividedBy100(int number) {
        return (number % 100) == 0;
    }

    private boolean dividedBy400(int number) {
        return (number % 400) == 0;
    }
}
