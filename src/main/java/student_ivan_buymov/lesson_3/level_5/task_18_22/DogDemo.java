package student_ivan_buymov.lesson_3.level_5.task_18_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {

    public static void main(String[] args) {
        var dog = new Dog("Wilfred", 5, "Black");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("White");
        dog.voice();
    }

}
