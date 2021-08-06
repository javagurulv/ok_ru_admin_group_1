package student_ilya_dolmatov.lesson_3.level_7.task_30;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Circle {

	@CodeReviewComment(teacher = "Почему тут большой Double, а не маленький?")
	@CodeReviewComment(teacher = "Если тут стоит большой Double то радиус круга может быть null.")
    Double radius;

    Circle(Double radius){
        this.radius = radius;
    }

    Double calculateArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }
}
