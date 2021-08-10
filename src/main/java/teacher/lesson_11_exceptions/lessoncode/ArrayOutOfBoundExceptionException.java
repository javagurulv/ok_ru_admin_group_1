package teacher.lesson_11_exceptions.lessoncode;

public class ArrayOutOfBoundExceptionException {

	public static void main(String[] args) {
		abc();
	}

	private static void abc() {
		int[] arr = {1,2};
		System.out.println(arr[10]);
	}

}
