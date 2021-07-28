package student_ilya_dolmatov.lesson_5.level_5.task_33;

class ArrayUtilDemo {
    public static void main(String[] args) {

        ArrayUtil newArray = new ArrayUtil();

        int[] arr1 = newArray.createArray(5);
        newArray.fillArrayWithRandomNumbers(arr1);
        newArray.checkArray(arr1);
    }
}
