package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class SquareTest {

    public static void main(String[] args) {
        ShapeTest test = new ShapeTest(new Square("square", 4d));
        test.calculateAreaTest(16.0d);
        test.calculatePerimeterTest(16.0d);
    }
}
