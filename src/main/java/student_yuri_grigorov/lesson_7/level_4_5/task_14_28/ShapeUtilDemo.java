package student_yuri_grigorov.lesson_7.level_4_5.task_14_28;

class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("circleArea: " + circleArea);
        System.out.println("circlePerimeter: " + circlePerimeter);

    }
}
