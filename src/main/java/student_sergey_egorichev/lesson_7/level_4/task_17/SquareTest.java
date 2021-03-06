package student_sergey_egorichev.lesson_7.level_4.task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SquareTest {
    public static void main(String[] args) {

        calculateAreaTest();
        calculatePerimeterTest();

    }

    static void checkTestResult(String testName, boolean testResult) {
        if (testResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAIL");
        }
    }

    static void calculateAreaTest() {
        int expectedResult = 4;
        Square square = new Square("square", 2);
        checkTestResult("Calculate Araea",
                expectedResult == square.calculateArea());
    }

    static void calculatePerimeterTest() {
        double expectedResult = 8;
        Square square = new Square("circle", 2);
        checkTestResult("Carculate Perimeter",
                expectedResult == square.calculatePerimeter());
    }

}
