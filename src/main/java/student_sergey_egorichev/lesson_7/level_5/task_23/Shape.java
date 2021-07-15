package student_sergey_egorichev.lesson_7.level_5.task_23;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public String getTitle() {
        return title;
    }
}
