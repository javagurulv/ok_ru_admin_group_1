package student_vladislav_nikitin.lesson_10.level_4.task_23_24_25_26;

import java.util.*;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {
    private List<Book> books;
    private Long lastId;

    BookDatabaseImpl() {
        this.books = new ArrayList<>();
        this.lastId = 0L;
    }

    @Override
    public List<Book> getBooks() {
        return books;
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
    public List<Book> find(SearchCriteria searchCriteria) {
        return this.books.stream()
                .filter(book -> searchCriteria.match(book))
                .collect(Collectors.toList());
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


    @Override
    public Set<String> findUniqueAuthors() {
        return this.books.stream()
                .map(Book::getAuthor)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<String> findUniqueTitles() {
        return this.books.stream()
                .map(Book::getTitle)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Book> findUniqueBooks() {
        /*
            Для корректной работы этого метода, в методах equals и hashCode класса Book,
            убрано сравнение, и составление хэша, по полю id.
            Это наиболее простое решение, но оно в лоб.
            Поле id скорее не должно хранится в классе Book, так как оно больше принадлежит сущности БД.
         */
        return new HashSet<>(this.books);
    }


    @Override
    public boolean contains(Book book) {
        /*
            Так как из методов equals и hashCode класса Book, убрано сравнение по полю id.
            Проверка на то что такая книга есть в базе происходит только по автору, названию и году выпуска книги.
         */
        return this.books.contains(book);
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
