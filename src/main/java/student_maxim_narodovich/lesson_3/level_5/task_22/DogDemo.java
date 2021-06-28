package student_maxim_narodovich.lesson_3.level_5.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog pesik = new Dog("Barbos", 7, "green");
        pesik.voice();
        pesik.happyBirthday();
        pesik.changeColor("blue");
        pesik.voice();
    }
}
