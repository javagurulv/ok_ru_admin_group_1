package student_vladislav_nikitin.lesson_7.level_5.task_20_21_22_23_24_25_26_27_28;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
