package student_ilya_dolmatov.lesson_3.level_7.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RugDemo {
    public static void main(String[] args) {
        Rug oldRug = new Rug("big", "living room", "That rug really tied the room together");
        Rug newRug = new Rug("small", "bathroom", "Looks like... Rubbish...");


        oldRug.getOpinion();
        newRug.getOpinion();

    }
}
