package student_vladislav_nikitin.lesson_10.level_6.task_30_31_32_33_34_35_36_37_38;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;
    private Scanner scanner;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
        this.scanner = new Scanner(System.in);
    }

    public void execute() {
        String bookAuthor = getInputFromUser("Enter book author: " );
        List<Book> books = this.bookDatabase.findByAuthor(bookAuthor);

        try {
            if (books.size() == 0) {
                throw new BookIsNotFound("author " + bookAuthor);
            }
        }
        catch (BookIsNotFound e) {
            System.err.println(e);
            return;
        }

        System.out.println("ID\t| Author\t| Title\t| Year of issue");
        for (Book book : books) {
            System.out.println(book.getId() + "\t| " +
                    book.getAuthor() + "\t| " +
                    book.getTitle() + "\t| " +
                    book.getYearOfIssue());
        }
    }

    private String getInputFromUser(String welcomePrompt) {
        while (true) {
            System.out.print(welcomePrompt);
            String userPrompt = this.scanner.nextLine();
            if (userPrompt.length() != 0) {
                return userPrompt;
            }
            System.out.println("Empty couldn't empty!");
        }
    }

}

