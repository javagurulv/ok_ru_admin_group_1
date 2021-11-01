package student_sergey_kuzmin.lesson_7;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    Shape() {

    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String getTitle() {
        return title;
    }
}