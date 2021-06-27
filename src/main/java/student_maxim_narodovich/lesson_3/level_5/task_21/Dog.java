package student_maxim_narodovich.lesson_3.level_5.task_21;

public class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    public Dog(String dogName,
               int dogAge,
               String dogColor) {

        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voice() {

        System.out.println("Hi! My name is " + this.dogName + ". I am a " + this.dogColor + " " + this.dogAge + " years old dog");
    }

    public void happyBirthday() {
        this.dogAge = dogAge + 1;
    }
}
