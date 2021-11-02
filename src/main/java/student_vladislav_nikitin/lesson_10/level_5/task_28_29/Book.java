package student_vladislav_nikitin.lesson_10.level_5.task_28_29;

import java.util.Objects;

class Book {
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) &&
                author.equals(book.author) &&
                yearOfIssue.equals(book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfIssue);
    }
}
