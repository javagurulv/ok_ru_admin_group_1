package student_sergey_egorichev.lesson_7.level_5.task_24;

public class CircleTest {
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
        double expectedResult = 50.26548245743669;
        Circle circle = new Circle("circle", 4);
        checkTestResult("Calculate Araea",
                expectedResult == circle.calculateArea());
    }

    static void calculatePerimeterTest() {
        double expectedResult = 25.132741228718345;
        Circle circle = new Circle("circle", 4);
        checkTestResult("Carculate Perimeter",
                expectedResult == circle.calculatePerimeter());
    }

}
