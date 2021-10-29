package student_vladislav_nikitin.lesson_7.level_3.task_12;

abstract class Material {
    private String materialName;

    Material(String materialName) {
        this.materialName = materialName;
    }

    abstract boolean isCracked(int hardness);

}

class Plastic extends Material {

    public Plastic() {
        super("Plastic");
    }

    @Override
    public boolean isCracked(int hardness) {
        return (hardness < 50);
    }

}

class Paper extends Material {

    public Paper() {
        super("Paper");
    }

    @Override
    public boolean isCracked(int hardness) {
        return (hardness < 10);
    }

}