package student_sergey_egorichev.lesson_8.level_4.task_17;

public class ServerState {
    int cpuLoad;
    int memFree;
    int networkUtilization;
    int diskUtilization;
    int diskFreeSpace;
    int loadAverage;

    public ServerState(int cpuLoad,
                       int memFree,
                       int networkUtilization,
                       int diskUtilization,
                       int diskFreeSpace,
                       int loadAverage) {
        this.cpuLoad = cpuLoad;
        this.memFree = memFree;
        this.networkUtilization = networkUtilization;
        this.diskUtilization = diskUtilization;
        this.diskFreeSpace = diskFreeSpace;
        this.loadAverage = loadAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerState that = (ServerState) o;

        if (cpuLoad != that.cpuLoad) return false;
        if (memFree != that.memFree) return false;
        if (networkUtilization != that.networkUtilization) return false;
        if (diskUtilization != that.diskUtilization) return false;
        if (diskFreeSpace != that.diskFreeSpace) return false;
        return loadAverage == that.loadAverage;
    }

}
