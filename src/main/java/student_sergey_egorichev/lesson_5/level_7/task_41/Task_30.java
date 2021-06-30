package student_sergey_egorichev.lesson_5.level_7.task_41;

public class Task_30 {

    public static void main(String[] args) {

        int arrayLength = (int) (Math.random() * 10) + 3;
        int [] myArray = ArrayUtil.createArray(arrayLength);
        ArrayUtil.fillArrayWithRandomNumbers(myArray);

        ArrayUtil.printArrayToConsole(myArray);

        int[] oddArray = ArrayUtil.getOdd(myArray);
        ArrayUtil.printArrayToConsole(oddArray);

    }

}
