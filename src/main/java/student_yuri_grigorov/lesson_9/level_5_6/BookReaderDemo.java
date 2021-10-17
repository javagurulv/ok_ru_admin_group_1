package student_yuri_grigorov.lesson_9.level_5_6;

import java.util.Arrays;

class BookReaderDemo {
    public static void main(String[] args) {
        BookReader bookReader = new BookReaderImpl();
        Book b1 = new Book("Morgan Housel",  "The Psychology of Money");
        Book b2 = new Book("Chetan Bhagat", "400 Days");
        Book b3 = new Book("Norman Lewis", "Word Power Made Easy");
        Book b4 = new Book("", "");

        System.out.println(bookReader.addBook(b1));
        System.out.println(bookReader.addBook(b2));
        System.out.println(bookReader.addBook(b3));
        System.out.println(bookReader.addBook(b4));

        System.out.println(Arrays.toString(bookReader.toStringArray()));

        System.out.println(bookReader.getBooksByAuthor("Morgan"));

        System.out.println(bookReader.getBooksByTitle("Word"));

        b2.setRead(true);
        System.out.println(bookReader.getReadBooks());

        System.out.println(bookReader.getUnReadBooks());
    }
}
