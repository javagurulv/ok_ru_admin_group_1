package student_vladislav_nikitin.lesson_10.level_2.task_6_7_8_9_10_11_12_13_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {
    private List<Book> books;
    private Long lastId;

    BookDatabaseImpl() {
        this.books = new ArrayList<>();
        this.lastId = 0L;
    }


    @Override
    public Long save(Book book) {
        this.lastId += 1;
        book.setId(this.lastId);
        this.books.add(book);
        return this.lastId;
    }

    @Override
    public boolean delete(Long bookId){
        if (bookId < 1) {
            return false;
        }

        Book foundBook = searchBookById(bookId);
        if (foundBook == null) {
            return false;
        }

        return this.books.remove(foundBook);
    }

    @Override
    public boolean delete(Book book) {
        return this.books.remove(book);
    }


    @Override
    public Optional<Book> findById(Long bookId) {
        Book foundBook = searchBookById(bookId);
        if (foundBook == null) {
            return Optional.empty();
        }
        return Optional.of(foundBook);
    }


    @Override
    public List<Book> findByAuthor(String author) {
        return searchBooksByAuthor(author);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return searchBooksByTitle(title);
    }


    @Override
    public int countAllBooks() {
        return this.books.size();
    }


    @Override
    public void deleteByAuthor(String author) {
        for (Book book: searchBooksByAuthor(author)) {
            this.books.remove(book);
        }
    }

    @Override
    public void deleteByTitle(String title) {
        for (Book book: searchBooksByTitle(title)) {
            this.books.remove(book);
        }
    }


    private Book searchBookById(Long id) {
        for (Book book: this.books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    private List<Book> searchBooksByAuthor(String author) {
        return this.books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    private List<Book> searchBooksByTitle(String title) {
        return this.books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

}
