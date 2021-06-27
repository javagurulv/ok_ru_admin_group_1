package student_maxim_narodovich.lesson_3.level_5.task_20;

public class Dog {
    String dogName;
    int dogAge;

    public Dog(String dogName,
               int dogAge) {

        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public void voice() {

        System.out.println("Hi! My name is " + this.dogName + ". I am " + this.dogAge + " years old");
    }

    public void happyBirthday() {
        this.dogAge = dogAge + 1;
    }
}
