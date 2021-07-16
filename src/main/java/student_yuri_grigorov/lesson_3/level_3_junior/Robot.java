package student_yuri_grigorov.lesson_3.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    //Task 11
    String name;

    //Task 12
    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    //Task 13
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
