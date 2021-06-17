package teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

public class ServerManager {


	public void sendEmailToAdmin() {

	}

	public void deployNewServer() {

	}

	void control(ServerState serverState) {
		/// algorithm
	}


	public static void main(String[] args) {

		ServerState server1 = new ServerState(
				"k1", 10, 35.5F
		);

		ServerState server2 = new ServerState(
				"k2", 30, 40.0F
		);

/*
		ServerParameters server3 = new ServerParameters(
				server1.serverName, server1.freeSpaceOnDisk, 40.0F
		);
*/


		ServerState[] servers = new ServerState[1000000];
		for (int i = 0; i < 1000000; i++) {
			servers[i] = new ServerState(
					"k" + i, 20, 40.0F
			);
		}
		System.out.println(servers[100].getServerName());
		System.out.println(servers[100].getFreeSpaceOnDisk());
		System.out.println(servers[100].getCpuLoadPercentage());


		ServerState server = new ServerState("k4");

		//server.freeSpaceOnDisk = 70;

		server.changeFreeSpaceOnDisk(70);

		//ServerParameters server = new ServerParameters();

		System.out.println(server.getServerName());
		System.out.println(server.getFreeSpaceOnDisk());
		System.out.println(server.getCpuLoadPercentage());

		Scanner scanner = new Scanner(System.in);

		try {
			int a = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Any text");
		}

	}

}
