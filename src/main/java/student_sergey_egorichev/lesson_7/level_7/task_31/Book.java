package student_sergey_egorichev.lesson_7.level_7.task_31;

import java.time.LocalDate;

class Book {
    final private String title;
    final private String author;
    final private String isbn;
    private boolean inLibrary;
    private LocalDate borrowedOn;
    private Consumer borrowedBy;
    private Consumer reservedBy;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.inLibrary = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isInLibrary() {
        return inLibrary;
    }

    public LocalDate getBorrowedOn() {
        return borrowedOn;
    }

    public Consumer getBorrowedBy() {
        return borrowedBy;
    }

    public Consumer getReservedBy() {
        return reservedBy;
    }

    public void setInLibrary(boolean inLibrary) {
        this.inLibrary = inLibrary;
    }

    public void setBorrowedOn(int year, int month, int date) {
        this.borrowedOn = LocalDate.of(year, month, date);
    }

    public void setBorrowedBy(Consumer borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    public void setReservedBy(Consumer reservedBy) {
        this.reservedBy = reservedBy;
    }

}
