package student_yuri_grigorov.lesson_6.level_4.task_20;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
