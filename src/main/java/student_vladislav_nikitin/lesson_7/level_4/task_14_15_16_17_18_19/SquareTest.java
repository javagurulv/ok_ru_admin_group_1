package student_vladislav_nikitin.lesson_7.level_4.task_14_15_16_17_18_19;

class SquareTest {

    public boolean calculateAreaTest() {
        double expectedResult = 21.16000;

        Square square = new Square(4.6);
        double result = square.calculateArea();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }


    public boolean calculatePerimeterTest() {
        double expectedResult = 18.40000;

        Square square = new Square(4.6);
        double result = square.calculatePerimeter();

        return String.format("%.5f", expectedResult).equals(String.format("%.5f", result));
    }

}
