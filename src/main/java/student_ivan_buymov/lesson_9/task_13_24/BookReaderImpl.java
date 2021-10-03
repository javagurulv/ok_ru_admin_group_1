package student_ivan_buymov.lesson_9.task_13_24;

import java.util.*;

class BookReaderImpl implements BookReader {

    private HashMap<Integer, Book> BooksDB = new HashMap<>();

    @Override
    public boolean addBook(Book book) {
        var alreadyExist = this.getBook(book).isPresent();
        if (alreadyExist) {
            System.out.printf("book %s already exist\n", book);
            return false;
        }
        if (book.author.equals("") || book.name.equals("")) {
            System.out.printf("name and author must be filed, got book: %s\n", book);
            return false;
        }
        this.BooksDB.put(book.hashCode(), book);
        return true;
    }

    public Optional<Book> getBook(Book book) {
        Optional <Book> optBook = Optional.ofNullable(this.BooksDB.get(book.hashCode()));
        return optBook;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        var found = this.listBooks().stream().filter( c -> c.author.startsWith(author) ).toList() ;
        return found;
    }

    @Override
    public List<Book> findByName(String name) {
        var found = this.listBooks().stream().filter( c -> c.name.startsWith(name) ).toList() ;
        return found;
    }

    @Override
    public boolean markAsRead(Book book) {
        var bookToMark = this.getBook(book);
        if (bookToMark.isPresent()) {
            bookToMark.get().alreadyRead = true;
            return true;
        }
        return false;
    }

    @Override
    public List<Book> listAlreadyRead() {
        var found = this.listBooks().stream().filter( c -> c.alreadyRead ).toList() ;
        return found;
    }

    @Override
    public List<Book> listNotRead() {
        var found = this.listBooks().stream().filter( c -> !c.alreadyRead ).toList() ;
        return found;
    }

    public boolean deleteBook(Book book) {
        if (this.BooksDB.remove(book.hashCode()) == null) {
            return false;
        }
        return true;
    }

    @Override
    public List<Book> listBooks() {
        return new ArrayList<>(this.BooksDB.values());
    }

    @Override
    public void printListBooks() {
        var books = this.listBooks();
        for (var book : books) {
            System.out.printf("%s\n", book);
        }
    }

}



