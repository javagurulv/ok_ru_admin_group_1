package student_petr_zaytsev.lesson_4.level_5;

import java.util.Scanner;

class Wavelength {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wave length: ");
        int length = scanner.nextInt();

        String result = new LightColorDetector().detect(length);

        System.out.println(result);


    }
}

