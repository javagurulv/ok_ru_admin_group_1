package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class ShapeTest {

    Shape shape;
    double epsilon = 0.0001d;

    public ShapeTest(Shape s) {
        this.shape = s;
    }

    public void calculateAreaTest(double expectedResult) {
        boolean testResult = Math.abs(shape.calculateArea() - expectedResult) < epsilon;
        checkTestResult(testResult, "calculateAreaTest [" + shape.getTitle() + "]");
    }

    public void calculatePerimeterTest(double expectedResult) {
        boolean testResult = Math.abs(shape.calculatePerimeter() - expectedResult) < epsilon;
        checkTestResult(testResult, "calculatePerimeterTest [" + shape.getTitle() + "]");
    }

    private void checkTestResult(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK!" : testName + " = FAIL!";
        System.out.println(msg);
    }
}
