package student_vladislav_nikitin.lesson_8.level_4.task_17;

public class ServerState {

    private double cpuLoadPercent;
    private int diskTotalSpaceMb;
    private int diskFreeSpaceMb;
    private int ramTotalSpaceMb;
    private int ramFreeSpaceMb;

    public ServerState(double cpuLoadPercent,
                       int diskTotalSpaceMb, int diskFreeSpaceMb,
                       int ramTotalSpaceMb, int ramFreeSpaceMb) {
        this.cpuLoadPercent = cpuLoadPercent;
        this.diskTotalSpaceMb = diskTotalSpaceMb;
        this.diskFreeSpaceMb = diskFreeSpaceMb;
        this.ramTotalSpaceMb = ramTotalSpaceMb;
        this.ramFreeSpaceMb = ramFreeSpaceMb;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (! (o instanceof ServerState)) {
            return false;
        }

        ServerState ss = (ServerState) o;

        return Double.compare(this.cpuLoadPercent, ss.cpuLoadPercent) == 0 &&
                this.diskTotalSpaceMb == ss.diskTotalSpaceMb &&
                this.diskFreeSpaceMb == ss.diskFreeSpaceMb &&
                this.ramTotalSpaceMb == ss.ramTotalSpaceMb &&
                this.ramFreeSpaceMb == ss.ramFreeSpaceMb;
    }
}
