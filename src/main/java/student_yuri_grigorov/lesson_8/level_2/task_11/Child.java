package student_yuri_grigorov.lesson_8.level_2.task_11;

class Child extends Parent {
    public Child() {
        super();
        System.out.println("Call from Child");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}
