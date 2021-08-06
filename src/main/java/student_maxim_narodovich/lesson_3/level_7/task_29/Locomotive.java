package student_maxim_narodovich.lesson_3.level_7.task_29;

public class Locomotive {
    int locomotivePower;
    String locomotiveClass;
    String locomotiveModel;
    String locomotiveVoice;

    public Locomotive(String locomotiveModel,
                      String locomotiveClass,
                      int locomotivePower,
                      String locomotiveVoice) {
        this.locomotiveClass = locomotiveClass;
        this.locomotivePower = locomotivePower;
        this.locomotiveModel = locomotiveModel;
        this.locomotiveVoice = locomotiveVoice;
    }

    public void signal() {
        System.out.print(locomotiveVoice);
    }
}
