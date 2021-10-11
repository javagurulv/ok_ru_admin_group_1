package student_ilya_dolmatov.lesson_6.level_1.task_6;

class IsEvenTest {

    public static void main(String[] args) {
        NumberUtils testEven = new NumberUtils();
        int i = 1;
        while (i <= 100) {
            if (testEven.isEven(i)) {System.out.println(i + " is even");}
            i++;
        }
    }

}