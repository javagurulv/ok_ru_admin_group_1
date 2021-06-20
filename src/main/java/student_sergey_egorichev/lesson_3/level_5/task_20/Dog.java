package student_sergey_egorichev.lesson_3.level_5.task_20;

public class Dog {

    private String dogName;
    private int dogAge;

    Dog (String dogName, int dogAge) {

        this.dogName = dogName;
        this.dogAge = dogAge;

    }

    public void voice() {

        System.out.println(String.format("%s %d", this.dogName, this.dogAge));

    }

    public void happyBirthday () {

        this.dogAge ++;
    };

    public void setDogAge(int dogAge) {

        this.dogAge = dogAge;

    }
}
