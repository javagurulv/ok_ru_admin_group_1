package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class CircleTest {

    public static void main(String[] args) {
        ShapeTest test = new ShapeTest(new Circle("circle", 4d));
        test.calculateAreaTest(50.2654d);
        test.calculatePerimeterTest(25.1327d);
    }
}
