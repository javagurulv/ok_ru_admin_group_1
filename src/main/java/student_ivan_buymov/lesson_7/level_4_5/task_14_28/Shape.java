package student_ivan_buymov.lesson_7.level_4_5.task_14_28;

abstract class Shape {

    public String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}