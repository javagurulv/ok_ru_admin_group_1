package student_ilya_dolmatov.lesson_3.level_7.task_33;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    String getManufacturer(){
        return this.manufacturer;

    }
    String getModel(){
        return this.model;
    }
}
