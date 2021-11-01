package student_vladislav_nikitin.lesson_7.level_4.task_14_15_16_17_18_19;

class TriangleTest {

    public boolean calculateAreaTest() {
        double expectedResult = 19.43794;

        Triangle triangle = new Triangle(6.7);
        double result = triangle.calculateArea();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }


    public boolean calculatePerimeterTest() {
        double expectedResult = 20.10000;

        Triangle triangle = new Triangle(6.7);
        double result = triangle.calculatePerimeter();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }

}
