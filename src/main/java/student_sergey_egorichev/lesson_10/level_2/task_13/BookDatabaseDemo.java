package student_sergey_egorichev.lesson_10.level_2.task_13;


public class BookDatabaseDemo {
    public static void main(String[] args) {
        BookDatabase bdb = new BookDatabaseImpl();

        bdb.save(new Book("author1", "book1"));
        bdb.save(new Book("author2", "book2"));
        bdb.save(new Book("author1", "book3"));
        bdb.save(new Book("author3", "book4"));
        bdb.save(new Book("author4", "book2"));

        System.out.println("Before deletion:");
        for (Book book: bdb.findByAuthor("author1")) {
            System.out.println(book.getAuthor() + " " + book.getTitle());
        }

        bdb.deleteByAuthor("author1");

        System.out.println("After deletion:");

        try {
            for (Book book : bdb.findByAuthor("author1")) {
                System.out.println(book.getAuthor() + " " + book.getTitle());
            }
        } catch (NullPointerException e) {
            System.out.println("Books of author1 not found");
        }
    }
}
