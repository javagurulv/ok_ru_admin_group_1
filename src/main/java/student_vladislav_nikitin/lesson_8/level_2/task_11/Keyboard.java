package student_vladislav_nikitin.lesson_8.level_2.task_11;

class Keyboard {

    private String vendor;
    private int keys;

    protected Keyboard(String vendor) {
        this.vendor = vendor;
    }

    protected Keyboard(String vendor, int keys) {
        this(vendor);
        this.keys = keys;
    }

}
