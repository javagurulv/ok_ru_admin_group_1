package student_sergey_egorichev.lesson_7.level_5.task_28;

class ShapeUtilTest {
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
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);

        double expectedResult = 89.1936856877122;
        double realResult = ShapeUtil.calculateArea(shapes);

        checkTestResult("Calculate Area",
                expectedResult == realResult);
    }

    static void calculatePerimeterTest() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);

        double expectedResult = 69.13274122871834;
        double realResult = ShapeUtil.calculatePerimeter(shapes);

        checkTestResult("Calculate Perimeter",
                expectedResult == realResult);
    }
}
