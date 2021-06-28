package student_maxim_narodovich.lesson_3.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        // тут напишите команду распечатки на консоли строки "My name is ROBO"
        System.out.println("My name is ROBO!");
    }
}
