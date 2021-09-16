package student_yuri_grigorov.lesson_7.level_3.task_12;

class Truck extends Car {

    @Override
    public void doAccelerate() {
        System.out.println("Грузовик газует");
    }

    @Override
    public void doBreak() {
        System.out.println("Грузовик тормозит");
    }
}
