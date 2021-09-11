package student_yuri_grigorov.lesson_6.level_4.task_20;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
