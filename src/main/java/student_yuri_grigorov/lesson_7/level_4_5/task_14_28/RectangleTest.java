package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class RectangleTest {

    public static void main(String[] args) {
        ShapeTest test = new ShapeTest(new Rectangle("rectangle", 5d, 8d));
        test.calculateAreaTest(40.0d);
        test.calculatePerimeterTest(26.0d);
    }
}
