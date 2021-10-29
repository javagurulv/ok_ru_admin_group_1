package student_vladislav_nikitin.lesson_7.level_4.task_14_15_16_17_18_19;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
