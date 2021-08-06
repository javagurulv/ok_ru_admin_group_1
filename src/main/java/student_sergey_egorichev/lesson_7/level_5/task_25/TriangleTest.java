package student_sergey_egorichev.lesson_7.level_5.task_25;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TriangleTest {

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
        double expectedResult = 1.7320508075688772;
        Triangle shape = new Triangle("square", 2);
        checkTestResult("Calculate Araea",
                expectedResult == shape.calculateArea());
    }

    static void calculatePerimeterTest() {
        double expectedResult = 6;
        Triangle shape = new Triangle("circle", 2);
        checkTestResult("Carculate Perimeter",
                expectedResult == shape.calculatePerimeter());
    }

}
