package student_ilya_dolmatov.lesson_3.level_3.task_13;

class Robot {
    String robotName;
    Robot(String robotName) {
        this.robotName = robotName;
    }
    void sayHello() {
        System.out.println("\uD83D\uDC48" +  this.robotName + "! Волк! \uD83D\uDC49");
    }

    void sayYourName() {
        System.out.print("Меня зовут " + this.robotName + "! \uD83D\uDC30\n\n");
    }
}
