package student_ilya_dolmatov.lesson_4.level_7.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {
    public static void main(String[] args) {

        LeapYearTest test1 = new LeapYearTest();
        test1.leap4Test();
        test1.leap100Test();
        test1.leap400Test();
        test1.leap2007Test();
    }

    void leap4Test() {
        LeapYear test = new LeapYear();
        Boolean result = test.isLeapYear(4);
        Boolean expectedResult = true;
        if (expectedResult == result) {System.out.println("Sub 4 year = OK");}
        else {System.out.println("Sub 4 year = FALSE"); }
        }

    void leap100Test() {
        LeapYear test = new LeapYear();
        Boolean result = test.isLeapYear(1100);
        Boolean expectedResult = false;
        if (expectedResult == result) {System.out.println("Sub 100 year = OK");}
        else {System.out.println("Sub 100 year = FALSE"); }
    }
    void leap400Test() {
        LeapYear test = new LeapYear();
        Boolean result = test.isLeapYear(1200);
        Boolean expectedResult = true;
        if (expectedResult == result) {System.out.println("Sub 400 year = OK");}
        else {System.out.println("Sub 400 year = FALSE"); }
    }

    void leap2007Test() {
        LeapYear test = new LeapYear();
        Boolean result = test.isLeapYear(2007);
        Boolean expectedResult = false;
        if (expectedResult == result) {System.out.println("Sub 2007 year = OK");}
        else {System.out.println("Sub 2007 year = FALSE"); }
    }
}