package student_yuri_grigorov.lesson_7.level_3.task_12;

class Sedan extends Car {

    @Override
    public void doAccelerate() {
        System.out.println("Седан газует");
    }

    @Override
    public void doBreak() {
        System.out.println("Седан тормозит");
    }
}
