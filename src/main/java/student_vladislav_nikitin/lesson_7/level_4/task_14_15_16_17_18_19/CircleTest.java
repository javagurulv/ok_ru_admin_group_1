package student_vladislav_nikitin.lesson_7.level_4.task_14_15_16_17_18_19;

class CircleTest {

    public boolean calculateAreaTest() {
        double expectedResult = 38.48451;

        Circle circle = new Circle(3.5);
        double result = circle.calculateArea();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }


    public boolean calculatePerimeterTest() {
        double expectedResult = 21.99115;

        Circle circle = new Circle(3.5);
        double result = circle.calculatePerimeter();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }

}
