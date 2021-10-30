package student_vladislav_nikitin.lesson_9.level_2.task_4_5;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    final private String[] dayNames = {"Monday", "Tuesday", "Wednesday",
                                       "Thursday", "Friday", "Saturday", "Sunday"};


    @Override
    public String detectDayName(int number) {
        try {
            return dayNames[number - 1];
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return "Please input a valid number between 1 and 7";
        }
    }
}
