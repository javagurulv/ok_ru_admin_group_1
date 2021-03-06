package student_ilya_dolmatov.lesson_3.level_7.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rug {
    String size;
    String location;
    String appearance;

    Rug(String size, String location, String appearance) {
        this.size = size;
        this.location = location;
        this.appearance = appearance;
    }

    void getOpinion(){
        System.out.println("That rug is " + this.size + ".");
        System.out.println("And located at " + this.location + ".");
        System.out.println("Also... " + this.appearance + ".\n");
    }

}
