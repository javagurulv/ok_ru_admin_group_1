package student_sergey_egorichev.lesson_7.level_2.task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {

    private int releaseYear;

    public Car(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}