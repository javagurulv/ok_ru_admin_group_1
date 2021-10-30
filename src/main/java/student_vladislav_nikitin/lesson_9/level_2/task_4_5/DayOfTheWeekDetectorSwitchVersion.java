package student_vladislav_nikitin.lesson_9.level_2.task_4_5;

class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String result = switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please input a valid number between 1 and 7";
        };
        return result;
    }
}
