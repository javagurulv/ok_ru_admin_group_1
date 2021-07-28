package student_yuri_grigorov.lesson_3.level_4_junior.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}
