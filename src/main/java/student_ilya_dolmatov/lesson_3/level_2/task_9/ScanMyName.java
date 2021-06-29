package student_ilya_dolmatov.lesson_3.level_2.task_9;

import java.util.Scanner;

class ScanMyName {
    public static void main(String[] args) {
        System.out.print("Hello traveler!\nIt's dangerous to go alone, say your name!\n");
        Scanner AskName = new Scanner(System.in);
        String TravelerName = AskName.next();
        System.out.print("May be force be with you, " + TravelerName + "!");
    }
}
