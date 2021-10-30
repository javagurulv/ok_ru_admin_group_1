package student_vladislav_nikitin.lesson_9.level_6.task_19_20_21_22_23_24;

class Book {

    private String author;
    private String title;
    private boolean read;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.read = false;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isRead() {
        return read;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + " [" + this.author + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (o.getClass() != this.getClass()) {
            return false;
        }

        final Book book = (Book) o;

        if (book.author.equals(this.author) && book.title.equals(this.title)) {
            return true;
        }
        return false;
    }
}
