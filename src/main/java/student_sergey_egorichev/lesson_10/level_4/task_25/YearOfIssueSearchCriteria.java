package student_sergey_egorichev.lesson_10.level_4.task_25;

class YearOfIssueSearchCriteria implements SearchCriteria {

    private String yearOfIssueToSearch;

    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    public boolean match(Book book) {
        if (book.getYearOfIssue().equals(this.yearOfIssueToSearch)) {
            return true;
        } else {
            return false;
        }
    }

}
