package student_yuri_grigorov.lesson_3.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {

    String name;
    int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.name);
        }
        System.out.println("My name is " + this.name +
                " I am " + this.age +
                " and I am " + this.color);
    }

    void happyBirthday() {
        this.age++;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}
