package student_ilya_dolmatov.lesson_3.level_7.task_30;

class Circle {
    Double radius;

    Circle(Double radius){
        this.radius = radius;
    }

    Double calculateArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }
}
