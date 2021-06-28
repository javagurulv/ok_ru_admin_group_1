package teacher.lesson_3_oop_first_look.lessoncode;

public class ServerState {

	private String serverName;
	private int freeSpaceOnDisk;
	private float cpuLoadPercentage;

	ServerState(String serverName) {
		this.serverName = serverName;
		//this.freeSpaceOnDisk = 40;
		//this.cpuLoadPercentage = 0.0F;
	}

	ServerState(String serverName,
				int freeSpaceOnDisk,
				float cpuLoadPercentage) {
		this.serverName = serverName;
		this.freeSpaceOnDisk = freeSpaceOnDisk;
		this.cpuLoadPercentage = cpuLoadPercentage;
	}

	void changeFreeSpaceOnDisk(int newFreeSpace) {
		this.freeSpaceOnDisk = newFreeSpace;
	}

	void changeCpuLoadPercentage(float newLoad) {
		if (newLoad >= 0 && newLoad <=100) {
			this.cpuLoadPercentage = newLoad;
		}
	}

	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public int getFreeSpaceOnDisk() {
		return freeSpaceOnDisk;
	}

	public void setFreeSpaceOnDisk(int freeSpaceOnDisk) {
		this.freeSpaceOnDisk = freeSpaceOnDisk;
	}

	public float getCpuLoadPercentage() {
		return cpuLoadPercentage;
	}

	public void setCpuLoadPercentage(float cpuLoadPercentage) {
		this.cpuLoadPercentage = cpuLoadPercentage;
	}
}
