package student_vladislav_nikitin.lesson_5.level_7.task_41;

class Task30 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        arrayUtil.printOddElementsOfArray(array);
    }

}
