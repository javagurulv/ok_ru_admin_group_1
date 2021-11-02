package student_vladislav_nikitin.lesson_10.level_6.task_30_31_32_33_34_35_36_37_38;

class OrSearchCriteria implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        return (this.leftCondition.match(book) || this.rightCondition.match(book));
    }

}
