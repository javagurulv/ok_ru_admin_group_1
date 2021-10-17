package student_yuri_grigorov.lesson_9.level_5_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class BookReaderImpl implements BookReader {

//    private List<Book> books = new ArrayList();
    private HashSet<Book> books = new HashSet<>();

    @Override
    public boolean addBook(Book b) {
        if (b.getAuthor().isBlank() || b.getTitle().isBlank())
            return false;
        if (books.contains(b))
            return false;
        books.add(b);
        return true;
    }

    @Override
    public boolean deleteBook(Book b) {
        return books.remove(b);
    }

    @Override
    public boolean markAsRead(Book b) {
        if (books.contains(b)) {
            b.setRead(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean markAsUnRead(Book b) {
        if (books.contains(b)) {
            b.setRead(false);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> getBooksByAuthor(String author) {
        return this.books.stream().filter(c -> c.getAuthor().startsWith(author)).toList();
    }

    @Override
    public List<Book> getBooksByTitle(String title) {
        return this.books.stream().filter(c -> c.getTitle().startsWith(title)).toList();
    }

    public List<Book> getReadBooks() {
        return this.books.stream().filter(c -> c.isRead()).toList();
    }

    public List<Book> getUnReadBooks() {
        return this.books.stream().filter(c -> !c.isRead()).toList();
    }

    @Override
    public String[] toStringArray() {
        String[] bookArray = new String[books.size()];
        Iterator<Book> i = books.iterator();
        int j = 0;
        Book b;
        while (i.hasNext()) {
            b = i.next();
            bookArray[j] = b.getTitle() + " [" + b.getAuthor() + "]";
            j++;
        }
        return bookArray;
    }
}
