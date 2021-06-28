package student_maxim_narodovich.lesson_3.level_5.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String dogName;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void voice() {
        System.out.println(this.dogName + " " + this.dogName + " " + this.dogName);
    }
}
