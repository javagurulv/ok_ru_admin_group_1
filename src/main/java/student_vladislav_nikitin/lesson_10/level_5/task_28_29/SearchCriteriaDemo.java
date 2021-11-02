package student_vladislav_nikitin.lesson_10.level_5.task_28_29;

import java.util.List;

class SearchCriteriaDemo {

    public static void main(String[] args) {
        Book book1 = new Book("Kuper", "Zveroboi", "1841");
        Book book2 = new Book("Webster", "Forty Years Among the Indians", "1890");
        Book book3 = new Book("Livingstone", "Tommy's War", "1910");

        BookDatabase bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(book1);
        bookDatabase.save(book2);
        bookDatabase.save(book3);

        System.out.println("All books");
        for (Book book: bookDatabase.getBooks()) {
            System.out.println(book.getId() + " | " + book.getAuthor() + " | " + book.getTitle() + " | " + book.getYearOfIssue());
        }

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1890");

        SearchCriteria authorAndTitleSearchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        SearchCriteria authorAndYearSearchCriteria = new AndSearchCriteria(authorSearchCriteria, yearSearchCriteria);
        SearchCriteria authorOrYearSearchCriteria = new OrSearchCriteria(authorSearchCriteria, yearSearchCriteria);
        SearchCriteria authorOrYearOrTitleSearchCriteria = new OrSearchCriteria(authorOrYearSearchCriteria, titleSearchCriteria);

        System.out.println("\nHas book by author Kuper and title Zveroboi: " +
                searchByCriteriaOverBooks(bookDatabase.getBooks(), authorAndTitleSearchCriteria));
        System.out.println("Has book by author Kuper and year of issue 1890: " +
                searchByCriteriaOverBooks(bookDatabase.getBooks(), authorAndYearSearchCriteria));
        System.out.println("Has book by author Kuper or year of issue 1890 or title Zveroboi: " +
                searchByCriteriaOverBooks(bookDatabase.getBooks(), authorOrYearOrTitleSearchCriteria));

        System.out.println("\nOr over BookDatabase, the last one criteria. Found books");
        for (Book book: bookDatabase.find(authorOrYearOrTitleSearchCriteria)) {
            System.out.println(book.getId() + " | " + book.getAuthor() + " | " + book.getTitle() + " | " + book.getYearOfIssue());
        }

    }

    public static boolean searchByCriteriaOverBooks(List<Book> books, SearchCriteria searchCriteria) {
        for (Book book: books) {
            if (searchCriteria.match(book)) {
                return true;
            }
        }
        return false;
    }

}
