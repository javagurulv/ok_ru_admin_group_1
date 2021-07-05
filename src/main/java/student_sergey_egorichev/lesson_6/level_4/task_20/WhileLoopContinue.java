package student_sergey_egorichev.lesson_6.level_4.task_20;

public class WhileLoopContinue {
    public static void main(String[] args) {
        System.out.print("Even: ");
        int i = -1;
        while (i < 10) {
            i ++;
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            } else continue;
        }
        System.out.print("\n");
    }
}
