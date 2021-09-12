package student_sergey_egorichev.lesson_9.level_2.task_4;

public class DayOfTheWeekDetectorIfVersion3 implements DayOfTheWeekDetector {

    public String detectDayName(int number) {
        String[] week = {
                "Please input a valid number between 1 and 7",
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
        if (number < week.length) {
            return week[number];
        } else {
            return week[0];
        }
    }
}
