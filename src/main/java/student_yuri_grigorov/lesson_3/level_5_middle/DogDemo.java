package student_yuri_grigorov.lesson_3.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Void", 6, "white");
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("Black");
        dog.voice();
    }
}
