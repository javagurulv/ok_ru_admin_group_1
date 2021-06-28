package student_sergey_egorichev.lesson_3.level_5.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 4, "Black");

        dog.voice();
        dog.newColour("White");
        dog.voice();

    }
}
