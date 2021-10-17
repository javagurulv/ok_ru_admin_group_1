package student_andrey_iv.lesson_3.level_5.task18_22;

public class Dog {
    private String dogName;
    private Integer dogAge;
    private String dogColour;

    Dog (String dogName,int dogAge,String dogColour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }

    public void voice() {
        for (int i = 0; i < 3; i++){
            System.out.println( this.dogName + " voice! - gav");
        }
        System.out.println("Dog age is " + this.dogAge + " and dog colour is " + this.dogColour);
    }

    public void happyBirthday() {
        this.dogAge ++;
        System.out.println( "Happy Birthday! " + this.dogName);
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    public void setNewColour(String dogNewColour) {
        this.dogColour = dogNewColour;
    }
}