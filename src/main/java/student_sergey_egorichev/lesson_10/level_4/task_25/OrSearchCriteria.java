package student_sergey_egorichev.lesson_10.level_4.task_25;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return this.leftCondition.match(book) || this.rightCondition.match(book);
    }

}
