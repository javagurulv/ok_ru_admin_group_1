package student_vladislav_nikitin.lesson_3.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
