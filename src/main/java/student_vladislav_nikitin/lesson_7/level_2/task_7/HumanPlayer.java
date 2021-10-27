package student_vladislav_nikitin.lesson_7.level_2.task_7;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    public HumanPlayer(String name) {
        super(name);
    }

}