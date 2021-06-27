package teacher.lesson_4_if_statement.lessoncode;

class LogicalConditions {

	public static void main(String[] args) {
		int number = 10;

		boolean isBiggerThen10 = number > 10;
		boolean isLessThen20 = number < 20;

		// <, <=, >, >=, !=, ==

		boolean isEualent = 3 == 4;
		boolean isNotEualent = 3 != 4;

		if (number > 0) {

		}

		// && - and
		// & - and
		boolean inInterval = isBiggerThen10 && isLessThen20;

		inInterval = (number > 10) & (number < 20);

		inInterval = number > 10 && number < 20;

		// || - or
		inInterval = (number < 10) || (number > 20);

		if ((number < 10) || (number > 20) || (number > 30)) {
			System.out.println("Out of diapazon!");
		}

		if ((number > 10) && (number < 20)) {
			System.out.println("Inside diapazon!");
		}

		if ((number < 10) | (number > 20)) {
			System.out.println("Out of diapazon!");
		}

		if ((number > 10) && (number < 20)) {
			System.out.println("Inside diapazon!");
		}



		if (isCpuInRedZone()) {
			System.out.println("In red zone");

		} else {
			System.out.println("Not In red zone");
			System.out.println("Not In red zone");
		}

		System.out.println("Not In red zone");

		if (number > 0) {
			System.out.println("In red zone");
		} else if (number < 0) {
			System.out.println("Not In red zone");
			System.out.println("Not In red zone");
		} else {
			System.out.println("ZERO");
		}


		switch (number) {
			case 4: {
				System.out.println("4");
			}
			case 5: {
				System.out.println("5");
			}
			default: {
				System.out.println("ZERO");
			}
		}


	}

	public static boolean isCpuInRedZone() {
		int cpuLoadPercentage = 78;
		boolean isCpuLoadMoreThan70 = cpuLoadPercentage > 70;
		boolean isCpuLoadLessThan100 = cpuLoadPercentage < 100;
		return isCpuLoadMoreThan70 && isCpuLoadLessThan100;
	}

}
