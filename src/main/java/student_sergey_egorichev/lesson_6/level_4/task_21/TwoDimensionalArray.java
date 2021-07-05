package student_sergey_egorichev.lesson_6.level_4.task_21;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int [][] array = new int[3][4];
        fillArrayRandomly(array);

        printArray(array);
        System.out.println("Sum: " + sumElements(array));
    }

    /**
     * Fill two-dimensional array randomly
     *
     * @param array empty array
     */
    private static void fillArrayRandomly(int [][] array) {
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                array[i][j] = (int) (Math.random()*100);
            }
        }
    }

    /**
     * Sum all elements of two-dimensional array
     *
     * @param array two-dimensional array
     * @return sum of all array elements
     */
    private static int sumElements(int [][] array) {
        int sum = 0;

        for (int [] line: array) {
            for (int element: line) {
                sum = sum + element;
            }
        }
        return sum;
    }

    private static void printArray(int [][] array) {
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                System.out.format("%3d", array[i][j]);
                if (j == array[i].length - 1) {
                    System.out.print("\n");
                }
            }
        }
    }

}
