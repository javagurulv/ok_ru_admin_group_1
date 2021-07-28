package student_sergey_egorichev.lesson_8.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }

}