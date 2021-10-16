package student_sergey_egorichev.lesson_10.level_4.task_25;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
        if (book.getTitle().equals(this.titleToSearch)) {
            return true;
        } else {
            return false;
        }
    }

}