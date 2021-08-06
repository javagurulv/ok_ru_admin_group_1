package student_ivan_buymov.lesson_3.level_3.task_11_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Robot {

    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hi, human!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name + "!");
    }

}