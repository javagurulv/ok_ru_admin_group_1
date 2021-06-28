package student_sergey_egorichev.lesson_3.level_5.task_20;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Bobik", 4);

        dog.voice();
        dog.happyBirthday();
        dog.voice();

    }
}
