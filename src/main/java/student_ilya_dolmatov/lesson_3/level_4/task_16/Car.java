package student_ilya_dolmatov.lesson_3.level_4.task_16;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Car {

	@CodeReviewComment(teacher = "Лучше свойства объявлять private")
    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }
}
