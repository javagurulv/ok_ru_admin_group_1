package student_ivan_buymov.lesson_3.level_5.task_18_22;

class Dog {
    private String name;
    private Integer age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        for (int i = 0; i < 3; i++){
            System.out.println(this.name + ": wof, wof, my age is " + age + " my color is: " + color);
        }
    }

    void happyBirthday() {
        this.age += 1;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }
}
