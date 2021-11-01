package student_vladislav_nikitin.lesson_9.level_5.task_13_14_15_16_17_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookReaderImplTest {

    void addTest() {
        boolean expectedResult = true;

        Book[] books = {
                new Book("Ange Hossein", "Faith Of The Ocean"),
                new Book("Joab Anahita", "Wives Of Stone")
        };
        BookReader testBookReader = new BookReaderImpl();

        boolean result = false;
        for (int i = 0; i < books.length; i++) {
            result = testBookReader.add(books[i]);
            String fullOutOfTest = "Book" + i + "; All should be added = ";
            System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
        }
    }

    void addFoundBookTest() {
        boolean expectedResult = false;

        Book testBook1 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook2 = new Book("Ange Hossein", "Faith Of The Ocean");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        boolean result = testBookReader.add(testBook2);

        String fullOutOfTest = "The second book shouldn't be added  = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void addNullTitleTest() {
        boolean expectedResult = false;

        Book testBook = new Book("Ange Hossein", null);
        BookReader testBookReader = new BookReaderImpl();

        boolean result = testBookReader.add(testBook);

        String fullOutOfTest = "add null title  = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void addNullAuthorTest() {
        boolean expectedResult = false;

        Book testBook = new Book(null, "Faith Of The Ocean");
        BookReader testBookReader = new BookReaderImpl();

        boolean result = testBookReader.add(testBook);

        String fullOutOfTest = "add null author  = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void addEmptyTitleTest() {
        boolean expectedResult = false;

        Book testBook = new Book("Ange Hossein", "");
        BookReader testBookReader = new BookReaderImpl();

        boolean result = testBookReader.add(testBook);

        String fullOutOfTest = "add empty title  = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void addEmptyAuthorTest() {
        boolean expectedResult = false;

        Book testBook = new Book("", "Faith Of The Ocean");
        BookReader testBookReader = new BookReaderImpl();

        boolean result = testBookReader.add(testBook);

        String fullOutOfTest = "add empty author  = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void addNullAuthorTitleTest() {
        boolean expectedResult = false;

        Book testBook = new Book(null, null);
        BookReader testBookReader = new BookReaderImpl();

        boolean result = testBookReader.add(testBook);

        String fullOutOfTest = "add null author title  = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void addEmptyAuthorTitleTest() {
        boolean expectedResult = false;

        Book testBook = new Book(null, null);
        BookReader testBookReader = new BookReaderImpl();

        boolean result = testBookReader.add(testBook);

        String fullOutOfTest = "add empty author title  = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void removeTest() {
        boolean expectedResult = true;

        Book testBook1 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook2 = new Book("Joab Anahita", "Wives Of Stone");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        testBookReader.add(testBook2);

        boolean result = testBookReader.remove(testBook1);

        String fullOutOfTest = "remove book = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void removeNotFoundBook() {
        boolean expectedResult = false;

        Book testBook1 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook2 = new Book("Joab Anahita", "Wives Of Stone");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        testBookReader.add(testBook2);

        boolean result = testBookReader.remove(new Book("Zipporah Kousuke", "Officer With Pride"));

        String fullOutOfTest = "remove not found book = ";
        System.out.println((result == expectedResult) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void showTest() {
        String[] expectedResult = {"Faith Of The Ocean [Ange Hossein]", "Wives Of Stone [Joab Anahita]"};

        Book testBook1 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook2 = new Book("Joab Anahita", "Wives Of Stone");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        testBookReader.add(testBook2);

        String[] result = testBookReader.show();

        String fullOutOfTest = "show books = ";
        System.out.println(Arrays.equals(expectedResult, result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void showZeroBooksTest() {
        String[] expectedResult = new String[0];

        BookReader testBookReader = new BookReaderImpl();
        String[] result = testBookReader.show();

        String fullOutOfTest = "show zero books = ";
        System.out.println(Arrays.equals(expectedResult, result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void searchByAuthorTest() {
        List<Book> expectedResult = Arrays.asList(
                new Book("Joab Anahita","Body Of The Light"),
                new Book("Joab Anahita", "Wives Of Stone")
        );

        Book testBook1 = new Book("Joab Anahita","Body Of The Light");
        Book testBook2 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook3 = new Book("Joab Anahita", "Wives Of Stone");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        testBookReader.add(testBook2);
        testBookReader.add(testBook3);

        List<Book> result = testBookReader.searchByAuthor("Joab Anahita");

        String fullOutOfTest = "search by author = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void searchByAuthorZeroBooksFoundTest() {
        List<Book> expectedResult = new ArrayList<Book>();

        Book testBook1 = new Book("Joab Anahita","Body Of The Light");
        Book testBook2 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook3 = new Book("Joab Anahita", "Wives Of Stone");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        testBookReader.add(testBook2);

        List<Book> result = testBookReader.searchByAuthor("Preethi Nerthus");

        String fullOutOfTest = "search by author zero books found = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void searchByAuthorEmptyBooksTest() {
        List<Book> expectedResult = new ArrayList<Book>();

        BookReader testBookReader = new BookReaderImpl();

        List<Book> result = testBookReader.searchByAuthor("Preethi Nerthus");

        String fullOutOfTest = "search by author empty books = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void searchByAuthorPrefixTest() {
        List<Book> expectedResult = Arrays.asList(
                new Book("Joab Anahita","Body Of The Light"),
                new Book("Joab Anahita", "Wives Of Stone")
        );

        Book testBook1 = new Book("Joab Anahita","Body Of The Light");
        Book testBook2 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook3 = new Book("Joab Anahita", "Wives Of Stone");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        testBookReader.add(testBook2);
        testBookReader.add(testBook3);

        List<Book> result = testBookReader.searchByAuthorPrefix("Joa");

        String fullOutOfTest = "search by author prefix = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void searchByAuthorPrefixZeroBooksFoundTest() {
        List<Book> expectedResult = new ArrayList<Book>();

        Book testBook1 = new Book("Joab Anahita","Body Of The Light");
        Book testBook2 = new Book("Ange Hossein", "Faith Of The Ocean");
        Book testBook3 = new Book("Joab Anahita", "Wives Of Stone");
        BookReader testBookReader = new BookReaderImpl();

        testBookReader.add(testBook1);
        testBookReader.add(testBook2);

        List<Book> result = testBookReader.searchByAuthorPrefix("Pree");

        String fullOutOfTest = "search by author prefix zero books found = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }

    void searchByAuthorPrefixEmptyBooksTest() {
        List<Book> expectedResult = new ArrayList<Book>();

        BookReader testBookReader = new BookReaderImpl();

        List<Book> result = testBookReader.searchByAuthorPrefix("Preet");

        String fullOutOfTest = "search by author prefix empty books = ";
        System.out.println(expectedResult.equals(result) ? fullOutOfTest + "OK" : fullOutOfTest + "FAIL");
    }


    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();

        test.addTest();
        test.addFoundBookTest();

        test.addNullTitleTest();
        test.addNullAuthorTest();
        test.addEmptyTitleTest();
        test.addEmptyAuthorTest();
        test.addNullAuthorTitleTest();
        test.addEmptyAuthorTitleTest();

        test.removeTest();
        test.removeNotFoundBook();

        test.showTest();
        test.showZeroBooksTest();

        test.searchByAuthorTest();
        test.searchByAuthorZeroBooksFoundTest();
        test.searchByAuthorEmptyBooksTest();

        test.searchByAuthorPrefixTest();
        test.searchByAuthorPrefixZeroBooksFoundTest();
        test.searchByAuthorPrefixEmptyBooksTest();
    }

}
