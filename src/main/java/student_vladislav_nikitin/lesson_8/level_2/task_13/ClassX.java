package student_vladislav_nikitin.lesson_8.level_2.task_13;

class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        super(1);
        System.out.println(2);
    }
}
