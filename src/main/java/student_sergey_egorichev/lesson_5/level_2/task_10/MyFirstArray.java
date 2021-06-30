package student_sergey_egorichev.lesson_5.level_2.task_10;

public class MyFirstArray {
    public static void main(String[] args) {
        int[] myArray = createArray(3);
        printArray(myArray);
        }

    private static int[] createArray(int length) {
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        return numbers;
    }

    private static void printArray(int [] someArray) {
        for (int i = 0; i < someArray.length; i ++) {
            System.out.println(someArray[i]);
        }
    }
}
