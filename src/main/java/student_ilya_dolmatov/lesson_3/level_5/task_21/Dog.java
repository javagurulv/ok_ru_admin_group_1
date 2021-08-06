package student_ilya_dolmatov.lesson_3.level_5.task_21;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String petName;
    int petAge;
    String petColor;

    Dog(String petName, int petAge, String petColor) {
        this.petName = petName;
        this.petAge = petAge;
        this.petColor = petColor;
    }

    void voice() {
        System.out.println("Pet name is: " + this.petName + "\n" +
                "Pet color is: " + this.petColor + "\n" +
                "Pet age is: " + this.petAge + "\n");
    }
}
