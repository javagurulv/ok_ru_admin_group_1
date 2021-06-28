package student_sergey_egorichev.lesson_4.level_7.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LeapYearTest {
    public static void main(String[] args) {
        commonYear();
        div4Year();
        div100but400Year();
        div100and400Year();
    }

    private static void commonYear() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2021) == false) {
            System.out.println("Common year: OK");
        } else {
            System.out.println("Common year: FAIL");
        }
    }

    private static void div4Year() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2020) == true) {
            System.out.println("leap year (div 4): OK");
        } else {
            System.out.println("leap year (div 4): FAIL");
        }
    }

    private static void div100but400Year() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(1400) == false) {
            System.out.println("leap year (div 100 but 400): OK");
        } else {
            System.out.println("leap year (div 100 but 400): FAIL");
        }
    }

    private static void div100and400Year() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2000) == true) {
            System.out.println("leap year (div 100 and 400): OK");
        } else {
            System.out.println("leap year (div 100 and 400): FAIL");
        }
    }
}
