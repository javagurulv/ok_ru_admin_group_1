package student_ilya_dolmatov.lesson_3.level_5.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String petName;

    Dog(String petName){
        this.petName = petName;
    }

    void voice() {
        System.out.println(this.petName);
        System.out.println(this.petName);
        System.out.println(this.petName);
    }
}
