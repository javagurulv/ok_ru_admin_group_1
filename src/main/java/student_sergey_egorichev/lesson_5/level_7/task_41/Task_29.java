package student_sergey_egorichev.lesson_5.level_7.task_41;

public class Task_29 {

    public static void main(String[] args) {

        int arrayLength = (int) (Math.random() * 10) + 3;
        int [] myArray = ArrayUtil.createArray(arrayLength);
        ArrayUtil.fillArrayWithRandomNumbers(myArray);

        ArrayUtil.printArrayToConsole(myArray);

        int[] evenArray = ArrayUtil.getEven(myArray);
        ArrayUtil.printArrayToConsole(evenArray);

    }

}
