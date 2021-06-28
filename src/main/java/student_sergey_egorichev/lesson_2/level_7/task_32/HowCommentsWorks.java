package student_sergey_egorichev.lesson_2.level_7.task_32;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class HowCommentsWorks {
    /** Sometimes we need to comment few lines.
     For example it will be class or method documentation.
     */
    public static void main(String[] args) {
        int someNumber = 10; // Sometimes we need to left comment in the end of the line

        /* Sometimes we need to make comment above the line */
        int twinNumber = someNumber + someNumber;

        /* Or sometimes we just need to comment some line of code */
        // int doubleNumber = 300;

        System.out.println(twinNumber);
    }

}
