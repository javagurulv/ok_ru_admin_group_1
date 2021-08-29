package student_yuri_grigorov.lesson_5.level_7.task_41;

/**
 * - создайте массив произвольной длины
 * - заполните массив случайными числами
 * - распечатайте на консоль все элементы массива
 * - найдите все нечётные числа в массиве и выведети их на консоль.
 */

class Task30 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] ints = arrayUtil.createRandomLengthArray();
        arrayUtil.fillArrayWithRandomNumbers(ints);
        arrayUtil.printArrayToConsole(ints);
        arrayUtil.printArrayToConsoleOdd(ints);
    }
}
