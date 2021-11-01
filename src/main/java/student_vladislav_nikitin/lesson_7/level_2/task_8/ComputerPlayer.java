package student_vladislav_nikitin.lesson_7.level_2.task_8;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class ComputerPlayer extends Player {

    public ComputerPlayer(String name) {
        super(name);
    }

}

class ComputerPlayerDemo {

    public static void main(String[] args) {
        ComputerPlayer computerPlayer = new ComputerPlayer("Petya");
    }

}