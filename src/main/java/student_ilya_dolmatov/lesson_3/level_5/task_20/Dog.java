package student_ilya_dolmatov.lesson_3.level_5.task_20;

public class Dog {
    String petName;
    int petAge;

    Dog(String petName, int petAge){
        this.petName = petName;
        this.petAge = petAge;
    }

    void Voice(){
        System.out.println("Pet name is: " + this.petName + "\nPet age is: " + this.petAge + "\n");
    }

    void happyBirthday(){
        System.out.println("Happy Birthday to " + this.petName + "!"+ "\n");
        this.petAge = ++petAge;
    }
}
