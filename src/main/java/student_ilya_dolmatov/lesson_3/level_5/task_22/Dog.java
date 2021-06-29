package student_ilya_dolmatov.lesson_3.level_5.task_22;

class Dog {
    String petName;
    String petColor;

    Dog(String petName, String petColor) {
        this.petName = petName;
        this.petColor = petColor;
    }

    void ChangeColor(String newColor){
        System.out.println("Changing " + this.petName + "'s color from " + this.petColor + " to " + newColor + "!\n");
        this.petColor = newColor;
    }

    void Voice(){
        System.out.println("Pet name is: " + this.petName + "\n" +
                "Pet color is: " + this.petColor + "\n");
    }
}
