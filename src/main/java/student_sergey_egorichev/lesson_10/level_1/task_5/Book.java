package student_sergey_egorichev.lesson_10.level_1.task_5;

public class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object obj) {
        Book anotherBook = (Book) obj;
        return this.author.equals(anotherBook.author) &&
                this.title.equals(anotherBook.title);
    }

}