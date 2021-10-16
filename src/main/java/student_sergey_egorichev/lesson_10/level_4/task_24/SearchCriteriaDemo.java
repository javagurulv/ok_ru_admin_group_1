package student_sergey_egorichev.lesson_10.level_4.task_24;

public class SearchCriteriaDemo {
    public static void main(String[] args) {

        Book book = new Book("Kuper", "Zveroboi");
        book.setYearOfIssue("1890");

        SearchCriteria authorSC = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSC = new TitleSearchCriteria("Zveroboi");
        SearchCriteria yearSC = new YearOfIssueSearchCriteria("1890");

        SearchCriteria sc1 = new AndSearchCriteria(authorSC, titleSC);
        SearchCriteria sc2 = new AndSearchCriteria(authorSC, yearSC);

        SearchCriteria sc3 = new OrSearchCriteria(authorSC, titleSC);
        SearchCriteria sc4 = new OrSearchCriteria(sc3, yearSC);

        boolean resultSC1 = sc1.match(book);
        boolean resultSC2 = sc2.match(book);
        boolean resultSC4 = sc4.match(book);

        System.out.println("vse");


    }
}
