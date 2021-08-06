package student_yuri_grigorov.lesson_3.level_4_junior.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Phone {

    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}