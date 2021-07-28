package student_sergey_egorichev.lesson_6.level_2.task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);
    }

}
