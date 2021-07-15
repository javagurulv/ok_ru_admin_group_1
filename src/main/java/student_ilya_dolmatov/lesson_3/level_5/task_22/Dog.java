package student_ilya_dolmatov.lesson_3.level_5.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String petName;
    String petColor;

    Dog(String petName, String petColor) {
        this.petName = petName;
        this.petColor = petColor;
    }

    void changeColor(String newColor){
        System.out.println("Changing " + this.petName + "'s color from " + this.petColor + " to " + newColor + "!\n");
        this.petColor = newColor;
    }

    void voice(){
        System.out.println("Pet name is: " + this.petName + "\n" +
                "Pet color is: " + this.petColor + "\n");
    }
}
