package teacher.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class VariablesExample {

	private static final Long MAX_SPEED = 1233L;

	public static void main(String[] args) {

		int carCount = 166;

		Integer carCountO = Integer.valueOf(166);
		Long carCountLong = Long.valueOf(166L) + MAX_SPEED;


		carCount = carCountO;

		carCountO = new Integer(carCount + 1);

		carCountO = carCountO + 1 / 6;


		double dddd = carCountO.doubleValue();

		double dd = dddd;

		Boolean asss = Boolean.FALSE;
		//Boolean dddd = Boolean.TRUE;

		var abc = 0;

		long xyz = 10L;

		// abc = xyz;

		boolean isMan = true;
		boolean isWoman = false;

		int a = 7;
		int b = 3;

		a = b + 23232;

		float c =  a / (float) b;

		String str = "text text";
		char firstChar = 'e';

		System.out.println("C = " + c);

		int maxSpeed = 0;

		carCount = maxSpeed + 1 - 23;
		System.out.println("CarCount = " + carCount);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter number: ");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();

		System.out.println("Result = " + (firstNumber + secondNumber));


		//throw new NullPointerException("sdzsdsds");
	}

}
