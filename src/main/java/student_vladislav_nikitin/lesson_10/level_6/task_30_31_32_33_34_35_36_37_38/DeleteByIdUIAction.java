package student_vladislav_nikitin.lesson_10.level_6.task_30_31_32_33_34_35_36_37_38;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;
    private Scanner scanner;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
        this.scanner = new Scanner(System.in);
    }

    public void execute() {
        Long bookId = getInputFromUser("Enter book ID: " );
        Optional<Book> bookOpt = this.bookDatabase.findById(bookId);

        try {
            Book book = bookOpt.orElseThrow(() -> new BookIsNotFound("ID " + bookId));
            if (this.bookDatabase.delete(book)) {
                System.out.println("Book successfully delete.");
            } else {
                System.out.println("Book wasn't delete.");
            }
        }
        catch (BookIsNotFound e) {
            System.err.println(e);
        }
    }

    private Long getInputFromUser(String welcomePrompt) {
        while (true) {
            System.out.print(welcomePrompt);
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            }
            scanner.next();
            System.out.println("Value must be Long!");
        }
    }

}
