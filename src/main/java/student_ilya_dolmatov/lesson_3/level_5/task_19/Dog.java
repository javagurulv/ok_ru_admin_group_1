package student_ilya_dolmatov.lesson_3.level_5.task_19;

public class Dog {
    String petName;
    int petAge;

    Dog(String petName, int petAge){
        this.petName = petName;
        this.petAge = petAge;
    }
    public void Voice() {
        System.out.println("Pet name is: " + this.petName + "\nPet age is: " + this.petAge);
    }
}
