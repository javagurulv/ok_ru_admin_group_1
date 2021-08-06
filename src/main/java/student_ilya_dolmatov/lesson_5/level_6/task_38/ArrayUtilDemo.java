package student_ilya_dolmatov.lesson_5.level_6.task_38;

class ArrayUtilDemo {
    public static void main(String[] args) {

        ArrayUtil newArray = new ArrayUtil();

        int[] arr1 = newArray.createArray(5);
        newArray.fillArrayWithRandomNumbers(arr1);
        newArray.printArrayToConsole(arr1);
        System.out.println("Max value of array: " + newArray.findMaxNumber(arr1));
        System.out.println("Min value of array: " + newArray.findMinNumber(arr1));
    }
}
