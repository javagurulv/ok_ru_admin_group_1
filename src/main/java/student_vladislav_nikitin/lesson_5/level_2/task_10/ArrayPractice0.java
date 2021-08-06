package student_vladislav_nikitin.lesson_5.level_2.task_10;

class ArrayPractice0 {

    public static void main(String[] args) {
        int[] arr = new int[3];

        arr[0] = 3;
        arr[1] = 42;
        arr[2] = 187;

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }

}
