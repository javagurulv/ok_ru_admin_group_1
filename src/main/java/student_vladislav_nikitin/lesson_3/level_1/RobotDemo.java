package student_vladislav_nikitin.lesson_3.level_1;

class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        Robot robot2 = new Robot();

        System.out.println("Robot 1");
        robot1.sayHello();
        robot1.sayYourName();

        System.out.println("\nRobot 2");
        robot2.sayHello();
        robot2.sayYourName();
    }
}