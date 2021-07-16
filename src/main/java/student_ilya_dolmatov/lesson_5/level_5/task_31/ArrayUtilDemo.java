package student_ilya_dolmatov.lesson_5.level_5.task_31;

//import java.util.Random;

class ArrayUtilDemo {
    public static void main(String[] args) {
//        Random random = new Random();
//        int arrayLength;

        ArrayUtil newArray = new ArrayUtil();

//        arrayLength = random.nextInt(10)+1;
//        int[] arr1 = newArray.createArray(arrayLength);
        int[] arr1 = newArray.createArray(5);
        newArray.checkArray(arr1);

//        arrayLength = random.nextInt(10)+1;
//        int[] arr2 = newArray.createArray(arrayLength);
        int[] arr2 = newArray.createArray(3);
        newArray.checkArray(arr2);
    }

}
