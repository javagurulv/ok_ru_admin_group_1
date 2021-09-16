package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class ShapeUtilTest {

    double epsilon = 0.0001d;

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateAreaTest();
        test.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("circle",4);
        shapes[1] = new Square("square",4);
        shapes[2] = new Rectangle("rectangle", 4, 4);
        shapes[3] = new Triangle("triangle",4, 4, 4);

        double expectedResult = 89.1936;
        boolean testResult = Math.abs(shapeUtil.calculateArea(shapes) - expectedResult) < epsilon;

        checkTestResult(testResult, "calculateAreaTest");
    }

    public void calculatePerimeterTest() {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("circle",4);
        shapes[1] = new Square("square",4);
        shapes[2] = new Rectangle("rectangle", 4, 4);
        shapes[3] = new Triangle("triangle",4, 4, 4);

        double expectedResult = 63.1327;
        boolean testResult = Math.abs(shapeUtil.calculatePerimeter(shapes) - expectedResult) <= epsilon;

        checkTestResult(testResult, "calculatePerimeter");
    }

    private void checkTestResult(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK!" : testName + " = FAIL!";
        System.out.println(msg);
    }
}
