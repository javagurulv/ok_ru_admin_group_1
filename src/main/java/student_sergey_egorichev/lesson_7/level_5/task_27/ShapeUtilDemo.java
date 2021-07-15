package student_sergey_egorichev.lesson_7.level_5.task_27;

public class ShapeUtilDemo {
    public static void main(String[] args) {

        Shape circle = ShapeUtil.createRandomCircle();
        double circleArea = ShapeUtil.calculateArea(circle);
        double circlePerimeter = ShapeUtil.calculatePerimeter(circle);

        Shape shape = ShapeUtil.createRandomShape();
        double shapeArea = ShapeUtil.calculateArea(shape);
        double shapePerimeter = ShapeUtil.calculatePerimeter(shape);
    }
}
