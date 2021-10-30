package student_vladislav_nikitin.lesson_9.level_6.task_19_20_21_22_23_24;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookReaderImpl implements BookReader {

    private List<Book> books;

    BookReaderImpl() {
        this.books = new ArrayList<Book>();
    }

    @Override
    public boolean add(Book book) {
        Optional<Book> foundBook = fullSearch(book.getAuthor(), book.getTitle());
        if (foundBook.isPresent() || isEmptyInformation(book)) {
            return false;
        }
        books.add(book);
        return true;
    }

    @Override
    public boolean remove(Book book) {
        Optional<Book> foundBook = fullSearch(book.getAuthor(), book.getTitle());
        if (foundBook.isPresent()) {
            books.remove(book);
            return true;
        }
        return false;
    }


    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<Book>();
        for (Book book: this.books) {
            if (book.getAuthor().equals(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> searchByAuthorPrefix(String authorPrefix) {
        List<Book> foundBooks = new ArrayList<Book>();
        for (Book book: this.books) {
            if (book.getAuthor().startsWith(authorPrefix)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> foundBooks = new ArrayList<Book>();
        for (Book book: this.books) {
            if (book.getTitle().equals(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> searchByTitlePrefix(String titlePrefix) {
        List<Book> foundBooks = new ArrayList<Book>();
        for (Book book: this.books) {
            if (book.getTitle().startsWith(titlePrefix)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public boolean setRead(Book book) {
        Optional<Book> foundBook = fullSearch(book.getAuthor(), book.getTitle());
        if (foundBook.isPresent()) {
            foundBook.get().setRead(true);
            return true;
        }
        return false;
    }

    @Override
    public boolean setUnread(Book book) {
        Optional<Book> foundBook = fullSearch(book.getAuthor(), book.getTitle());
        if (foundBook.isPresent()) {
            foundBook.get().setRead(false);
            return true;
        }
        return false;
    }

    @Override
    public String[] show() {
        String[] booksInformation = new String[this.books.size()];
        for (int i = 0; i < booksInformation.length; i++) {
            booksInformation[i] = this.books.get(i).toString();
        }
        return booksInformation;
    }

    @Override
    public String[] showRead() {
        long countReadBook = this.books.stream().filter(b -> b.isRead()).count();
        String[] booksInformation = new String[(int) countReadBook];
        int iterator = 0;
        for (Book book: this.books) {
            if (book.isRead()) {
                booksInformation[iterator] = book.toString();
                iterator++;
            }
        }
        return booksInformation;
    }

    @Override
    public String[] showUnread() {
        long countUnreadBook = this.books.stream().filter(b -> (! b.isRead())).count();
        String[] booksInformation = new String[(int) countUnreadBook];
        int iterator = 0;
        for (Book book: this.books) {
            if (! book.isRead()) {
                booksInformation[iterator] = book.toString();
                iterator++;
            }
        }
        return booksInformation;
    }

    @Override
    public boolean isEmptyInformation(Book book) {
        String author = book.getAuthor();
        String title = book.getTitle();

        if ((author == null) || author.equals("") ||
                (title == null) || title.equals("")) {
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> fullSearch(String author, String title) {
        for (Book book: this.books) {
            if (book.getAuthor().equals(author) && book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.ofNullable(null);
    }

}
