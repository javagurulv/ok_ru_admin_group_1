package student_vladislav_nikitin.lesson_7.level_4.task_14_15_16_17_18_19;

class RectangleTest {

    public boolean calculateAreaTest() {
        double expectedResult = 11.50000;

        Rectangle rectangle = new Rectangle(2.3, 5);
        double result = rectangle.calculateArea();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }


    public boolean calculatePerimeterTest() {
        double expectedResult = 14.60000;

        Rectangle rectangle = new Rectangle(2.3, 5);
        double result = rectangle.calculatePerimeter();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }

}
