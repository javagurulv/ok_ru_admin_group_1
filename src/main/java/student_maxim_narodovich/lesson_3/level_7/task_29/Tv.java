package student_maxim_narodovich.lesson_3.level_7.task_29;

public class Tv {
    int tvSize;
    String tvVendor;
    String tvMatrix;

    public Tv(int tvSize,
              String tvVendor,
              String tvMatrix) {
        this.tvSize = tvSize;
        this.tvVendor = tvVendor;
        this.tvMatrix = tvMatrix;
    }
    public void about() {
        System.out.println("This TV was manufactured by " + this.tvVendor + " and has " + this.tvSize + "inch " + this.tvMatrix + " matrix");
    }
}
