package student_ivan_buymov.lesson_9.task_13_24;

class Book {

    public String name;
    public String author;
    public boolean alreadyRead = false;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, boolean alreadyRead) {
        this.name = name;
        this.author = author;
        this.alreadyRead = alreadyRead;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
