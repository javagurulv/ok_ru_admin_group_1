package student_vladislav_nikitin.lesson_3.level_7.task_29;

class Demo {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(50, false);
        System.out.println(lamp);

        lamp.turnOn();
        lamp.setBrightness(120);

        System.out.println(lamp);

        Lamp lamp1 = new Lamp(20);
        System.out.println(lamp1);

        Cup cup = new Cup("Ceramic", 90);
        System.out.println(cup);

        cup.makeSip();
        System.out.println(cup);
    }
}
