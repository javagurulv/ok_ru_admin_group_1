package student_sergey_egorichev.lesson_7.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DefaultConstructorV2Demo {

    public static void main(String[] args) {

        DefaultConstructor defaultConstructor = new DefaultConstructor();
        DefaultConstructorV2 defaultConstructorV2 = new DefaultConstructorV2();

        if (defaultConstructor.testAttribute == defaultConstructorV2.testAttribute) {
            System.out.println("It's same.");
        } else {
            System.out.println("Something wrong");
        }

    }

}
