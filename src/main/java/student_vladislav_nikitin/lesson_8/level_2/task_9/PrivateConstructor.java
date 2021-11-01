package student_vladislav_nikitin.lesson_8.level_2.task_9;

class PrivateConstructor {

    int number;
    String line;

    private PrivateConstructor(int number) {
        this.number = number;
    }

    public PrivateConstructor(int number, String line) {
        this.number = number;
        this.line = line;
    }

}
