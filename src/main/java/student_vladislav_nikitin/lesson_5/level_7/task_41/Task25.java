package student_vladislav_nikitin.lesson_5.level_7.task_41;

class Task25 {
    public static void main(String[] args) {
        int[] array;
        ArrayUtil arrayUtil = new ArrayUtil();

        int arrayLength = arrayUtil.getArrayLengthFromUser();
        array = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithUserPrompt(array);
        arrayUtil.printArrayToConsole(array);
    }
}
