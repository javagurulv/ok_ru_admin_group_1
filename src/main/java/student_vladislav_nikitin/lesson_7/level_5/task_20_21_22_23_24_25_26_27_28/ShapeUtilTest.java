package student_vladislav_nikitin.lesson_7.level_5.task_20_21_22_23_24_25_26_27_28;

class ShapeUtilTest {

    public boolean calculateAreaTest() {
        double expectedResult = 132.04958;

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(8.9);
        shapes[2] = new Rectangle(2.5, 6);
        shapes[3] = new Triangle(4.7);

        ShapeUtil shapeUtil = new ShapeUtil();
        double result = shapeUtil.calculateArea(shapes);

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }

    public boolean calculatePerimeterTest() {
        double expectedResult = 85.54956;

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(8.9);
        shapes[2] = new Rectangle(2.5, 6);
        shapes[3] = new Triangle(4.7);

        ShapeUtil shapeUtil = new ShapeUtil();
        double result = shapeUtil.calculatePerimeter(shapes);

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }
}
