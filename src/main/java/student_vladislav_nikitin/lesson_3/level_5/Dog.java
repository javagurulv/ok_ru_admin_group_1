package student_vladislav_nikitin.lesson_3.level_5;

class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        String myAge = " my age is " + this.age;
        String myColor = " my color is " + this.color;
        for (int i = 0; i < 3; i++) {
            System.out.print(this.name + myAge + myColor + "! ");
        }
        System.out.println();
    }

    public void happyBirthday() {
        this.age += 1;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
}
