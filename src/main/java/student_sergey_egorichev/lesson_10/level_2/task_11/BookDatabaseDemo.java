package student_sergey_egorichev.lesson_10.level_2.task_11;


public class BookDatabaseDemo {
    public static void main(String[] args) {
        BookDatabase bdb = new BookDatabaseImpl();

        bdb.save(new Book("author1", "book1"));
        bdb.save(new Book("author2", "book2"));
        bdb.save(new Book("author1", "book3"));
        bdb.save(new Book("author3", "book4"));
        bdb.save(new Book("author4", "book2"));

        for (Book book: bdb.findByTitle("book2")) {
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }

    }
}
