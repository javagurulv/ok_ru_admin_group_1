package student_ilya_dolmatov.lesson_3.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Добрый-Заяц-Робот");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Злой-Заяц-Робот");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
