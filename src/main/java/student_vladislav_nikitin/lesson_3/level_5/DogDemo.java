package student_vladislav_nikitin.lesson_3.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Jame", 8, "Gray");

        dog.voice();
        dog.happyBirthday();
        dog.changeColor("Black");
        dog.voice();
    }
}
