package student_yuri_grigorov.lesson_5.level_7.task_41;

/**
 * - запросите у пользователя с консоли длину массива
 * - создайте массив указанной пользователем длины
 * - заполните массив числами полученными от пользователя
 * - распечатайте на консоль все элементы массива.
 */

class Task25 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = arrayUtil.getArrayLengthFromConsole();
        int[] ints = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayInteractive(ints);
        arrayUtil.printArrayToConsole(ints);
    }
}
