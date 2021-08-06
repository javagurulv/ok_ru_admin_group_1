package student_ilya_dolmatov.lesson_3.level_7.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AirConditionerDemo {
    public static void main(String[] args) {
        AirConditioner ac1 = new AirConditioner("Split system", "Hyundai", 25000, "White");
        AirConditioner ac2 = new AirConditioner("Portable", "Balu", 15000, "Gray");

        ac1.getACInfo();
        ac2.getACInfo();
    }
}
