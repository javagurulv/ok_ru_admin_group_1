package student_ivan_buymov.lesson_3.level_3.task_11_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {

    public static void main(String[] args) {
        var robotOne = new Robot("One");
        robotOne.sayHello();
        robotOne.sayYourName();

        var robotTwo = new Robot("Two");
        robotTwo.sayYourName();

    }

}
