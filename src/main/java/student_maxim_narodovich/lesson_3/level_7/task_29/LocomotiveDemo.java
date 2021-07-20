package student_maxim_narodovich.lesson_3.level_7.task_29;

public class LocomotiveDemo {
    public static void main(String[] args) {
        Locomotive vl85011 = new Locomotive("vl85", "electric", 9360, "ChooChoo");
        System.out.println(vl85011.locomotiveModel + "says: ");
        vl85011.signal();

        Locomotive thomasTheTangEngine = new Locomotive("LB&SCR E2", "steam", 94, "Ron-Don-Don!!");
        System.out.println(vl85011.locomotiveModel + "says: ");
        vl85011.signal();
    }
}
