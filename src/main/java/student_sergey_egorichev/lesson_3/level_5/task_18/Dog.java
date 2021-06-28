package student_sergey_egorichev.lesson_3.level_5.task_18;

import java.text.MessageFormat;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {

    private String dogName;

    Dog (String dogName) {

        this.dogName = dogName;

    }

    public void voice() {

        System.out.println(MessageFormat.format("{0} {0} {0}", this.dogName));

    }
}
