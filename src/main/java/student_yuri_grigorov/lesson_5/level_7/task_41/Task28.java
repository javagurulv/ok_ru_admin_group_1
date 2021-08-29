package student_yuri_grigorov.lesson_5.level_7.task_41;

/**
 * - создайте массив произвольной длины
 * - заполните массив случайными числами
 * - распечатайте на консоль все элементы массива
 * - найдите наименьшее число в массиве и выведети его на консоль.
 */

class Task28 {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] ints = arrayUtil.createRandomLengthArray();
        arrayUtil.fillArrayWithRandomNumbers(ints);
        arrayUtil.printArrayToConsole(ints);
        System.out.println("Min array value = " + arrayUtil.findMinNumber(ints));
    }
}
