package student_vladislav_nikitin.lesson_10.level_3.task_15_16_17_18_19_20_21_22;

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
