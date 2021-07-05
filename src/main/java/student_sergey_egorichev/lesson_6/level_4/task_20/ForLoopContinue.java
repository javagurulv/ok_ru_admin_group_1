package student_sergey_egorichev.lesson_6.level_4.task_20;

public class ForLoopContinue {
    public static void main(String[] args) {
        System.out.print("Even: ");
        for (int i = 0; i <= 10; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            } else continue;
        }
        System.out.print("\n");
    }
}
