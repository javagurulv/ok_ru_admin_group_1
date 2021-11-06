package student_sergey_egorichev.lesson_10.level_4.task_26;

import java.util.*;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> bookList = new ArrayList<>();
    private Long lastId = 0L;

    @Override
    public Long save(Book book) {
        this.lastId++;
        bookList.add(book);
        book.setId(this.lastId);
        return(book.getId());
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book: this.bookList) {
            if (book.getId().equals(bookId)) {
                this.bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (this.bookList.remove(book)) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book: this.bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book: this.bookList) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }

        if (!result.isEmpty()) {
            return result;
        } else {
            return null;
        }
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book: this.bookList) {
            if (book.getTitle().equals(title)) {
                result.add(book);
            }
        }

        if (!result.isEmpty()) {
            return result;
        } else {
            return null;
        }
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> deleteList = new ArrayList<>();

        for (Book book: findByAuthor(author)) {
            deleteList.add(book);
        }

        if (!deleteList.isEmpty()) {
            for (Book book: deleteList) {
                this.bookList.remove(book);
            }
        }
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> deleteList = new ArrayList<>();

        for (Book book: findByTitle(title)) {
            deleteList.add(book);
        }

        if (!deleteList.isEmpty()) {
            for (Book book: deleteList) {
                this.bookList.remove(book);
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {

        List<Book> searchResult = new ArrayList<>();

        for (Book book: this.bookList) {
            if (searchCriteria.match(book)) {
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set authorSet = new HashSet();
        for (Book book: this.bookList) {
            authorSet.add(book.getAuthor());
        }
        return authorSet;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set titleSet = new HashSet();
        for (Book book: this.bookList) {
            titleSet.add(book.getTitle());
        }
        return titleSet;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        List<Book> uniqueBookList = new ArrayList<>();
        List<Boolean> tmpUniqueBookList = new ArrayList<>();
        for (Book book: bookList) {
            if (uniqueBookList.isEmpty()) {
                uniqueBookList.add(book);
                continue;
            }
            for (Book uniqueBook: uniqueBookList) {
                if (book.getAuthor().equals(uniqueBook.getAuthor())
                        && book.getTitle().equals(uniqueBook.getTitle())) {
                    tmpUniqueBookList.add(true);
                }
            }
            if (!tmpUniqueBookList.contains(true))
                uniqueBookList.add(book);
        }
        return new HashSet<>(uniqueBookList);
    }

    @Override
    public boolean contains(Book book) {
        for (Book bookFromDB: bookList) {
            if (book.getTitle().equals(bookFromDB.getTitle())
            && book.getAuthor().equals(bookFromDB.getAuthor())) {
                return true;
            }
        }
        return false;
    }
}