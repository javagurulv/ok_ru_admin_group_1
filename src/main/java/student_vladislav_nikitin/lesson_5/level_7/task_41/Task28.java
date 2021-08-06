package student_vladislav_nikitin.lesson_5.level_7.task_41;

class Task28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Minimum value of element in array = " + arrayUtil.findMinNumber(array));
    }
}
