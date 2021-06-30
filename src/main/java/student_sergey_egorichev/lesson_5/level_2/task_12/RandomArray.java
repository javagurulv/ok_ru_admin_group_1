package student_sergey_egorichev.lesson_5.level_2.task_12;

class RandomArray {
    public static void main(String[] args) {
        int[] myArray = generateArray(3);
        printArray(myArray);
    }

    private static int[] generateArray(int length) {
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
