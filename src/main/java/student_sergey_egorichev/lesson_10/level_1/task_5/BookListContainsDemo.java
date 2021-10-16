package student_sergey_egorichev.lesson_10.level_1.task_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BookListContainsDemo {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A1", "B1");
        Book bookNotInTheList = new Book("A3", "B3");

        for (Book book: Arrays.asList(
                bookInTheList,
                bookNotInTheList)) {

            if (books.contains(book)) {
                System.out.println(book.getAuthor() + ", " +
                        book.getTitle() + " is in the list.");
            } else {
                System.out.println(book.getAuthor() + ", " +
                        book.getTitle() + " is not in the list.");
            }

        }

    }

}
