package student_sergey_egorichev.lesson_10.level_4.task_23;

class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    public boolean match(Book book) {
        if (book.getAuthor().equals(this.authorToSearch)) {
            return true;
        } else {
            return false;
        }
    }

}
