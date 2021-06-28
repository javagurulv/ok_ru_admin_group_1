package student_sergey_egorichev.lesson_3.level_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    private String name;

    Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
