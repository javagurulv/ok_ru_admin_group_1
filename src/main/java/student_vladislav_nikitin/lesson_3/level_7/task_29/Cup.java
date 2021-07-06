package student_vladislav_nikitin.lesson_3.level_7.task_29;

class Cup {
    private String material;
    private int fullness;

    Cup (String material, int fullness) {
        this.material = material;
        this.fullness = restrictFullness(fullness);
    }

    @Override
    public String toString() {
        String status = "Cup made from " + this.material + ". Filled to " + this.fullness + "%.";
        return status;
    }

    private static int restrictFullness (int fullness) {
        if (fullness >= 100) {
            return 100;
        }
        else return Math.max(fullness, 0);
    }

    void makeSip () {
        this.fullness = restrictFullness(this.fullness - 10);
    }
}