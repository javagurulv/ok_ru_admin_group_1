package student_sergey_egorichev.lesson_3.level_5.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {

    private String dogName;
    private int dogAge;
    private String dogColour;

    Dog (String dogName,
         int dogAge,
         String dogColour) {

        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;

    }

    public void voice() {

        System.out.println(String.format("%s %d %s",
                this.dogName, this.dogAge, this.dogColour));

    }

    public void happyBirthday () {

        this.dogAge ++;
    };

    public void setDogAge(int dogAge) {

        this.dogAge = dogAge;

    }

    public void newColour(String dogColour) {

        this.dogColour = dogColour;

    }
}
