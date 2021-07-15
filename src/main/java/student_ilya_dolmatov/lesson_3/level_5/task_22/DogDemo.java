package student_ilya_dolmatov.lesson_3.level_5.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Belka", "White");
        dog1.voice();
        dog1.changeColor("Black & White");
        dog1.voice();
    }
}
