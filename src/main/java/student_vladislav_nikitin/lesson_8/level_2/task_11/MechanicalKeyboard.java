package student_vladislav_nikitin.lesson_8.level_2.task_11;

class MechanicalKeyboard extends Keyboard {

    private String switchType;

    public MechanicalKeyboard(String vendor, int keys) {
        super(vendor, keys);
    }

    public MechanicalKeyboard(String vendor, int keys, String switchType) {
        this(vendor, keys);
        this.switchType = switchType;
    }

}
