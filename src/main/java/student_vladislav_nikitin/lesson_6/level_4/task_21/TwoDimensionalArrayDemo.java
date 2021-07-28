package student_vladislav_nikitin.lesson_6.level_4.task_21;

class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] array = twoDimensionalArray.create(4, 5);
        twoDimensionalArray.fillWithRandomNumbers(array);
        int sumOfElements = twoDimensionalArray.calculateSumOfElements(array);

        twoDimensionalArray.printArrayToTerminal(array);
        System.out.println("Sum of elements: " + sumOfElements);
    }

}
