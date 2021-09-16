package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class TriangleTest {

    public static void main(String[] args) {
        ShapeTest test = new ShapeTest(new Triangle("triangle", 2d, 3d, 4d));
        test.calculateAreaTest(2.9047d);
        test.calculatePerimeterTest(4.5d);
    }
}
