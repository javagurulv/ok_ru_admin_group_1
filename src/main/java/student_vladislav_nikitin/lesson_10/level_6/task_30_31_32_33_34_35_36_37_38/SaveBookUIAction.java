package student_vladislav_nikitin.lesson_10.level_6.task_30_31_32_33_34_35_36_37_38;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;
    private Scanner scanner;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
        this.scanner = new Scanner(System.in);
    }


    public void execute() {
        System.out.println("Please fill fields about books.");
        String author = getAuthorFromUser();
        String title = getTitleFromUser();
        String year = getYearFromUser();

        Book book = new Book(author, title, year);
        this.bookDatabase.save(book);
    }

    private String getAuthorFromUser() {
        return getInputFromUser("Enter author: ");
    }

    private String getTitleFromUser() {
        return getInputFromUser("Enter title: ");
    }

    private String getYearFromUser() {
        return getInputFromUser("Enter year of issue: ");
    }

    private String getInputFromUser(String welcomePrompt) {
        while (true) {
            System.out.print(welcomePrompt);
            String userPrompt = this.scanner.nextLine();
            if (userPrompt.length() != 0) {
                return userPrompt;
            }
            System.out.println("String couldn't empty!");
        }
    }

}