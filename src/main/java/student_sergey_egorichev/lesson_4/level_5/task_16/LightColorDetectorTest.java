package student_sergey_egorichev.lesson_4.level_5.task_16;

import java.util.Random;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        detectViolet();
        detectBlue();
        detectGreen();
        detectYellow();
        detectOrange();
        detectRed();
        detectBeforeVisible();
        detectAfterVisible();
    }

    static int getRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    static void detectViolet() {
        int wavelength = getRandom(380, 449);
        String expectedResult = "Violet";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect Violet: OK");
        } else {
            System.out.println("Detect Violet: FAIL");
        }
    }

    static void detectBlue() {
        int wavelength = getRandom(450, 494);
        String expectedResult = "Blue";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect Blue: OK");
        } else {
            System.out.println("Detect Blue: FAIL");
        }
    }

    static void detectGreen() {
        int wavelength = getRandom(495, 569);
        String expectedResult = "Green";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect Green: OK");
        } else {
            System.out.println("Detect Green: FAIL");
        }
    }

    static void detectYellow() {
        int wavelength = getRandom(570, 589);
        String expectedResult = "Yellow";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect Yellow: OK");
        } else {
            System.out.println("Detect Yellow: FAIL");
        }
    }

    static void detectOrange() {
        int wavelength = getRandom(590, 619);
        String expectedResult = "Orange";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect Orange: OK");
        } else {
            System.out.println("Detect Orange: FAIL");
        }
    }

    static void detectRed() {
        int wavelength = getRandom(620, 750);
        String expectedResult = "Red";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect Red: OK");
        } else {
            System.out.println("Detect red: FAIL");
        }
    }

    static void detectBeforeVisible() {
        int wavelength = getRandom(0, 379);
        String expectedResult = "Invisible Light";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect Before Visible: OK");
        } else {
            System.out.println("Detect Before Visible: FAIL");
        }
    }

    static void detectAfterVisible() {
        int wavelength = getRandom(751, 10000);
        String expectedResult = "Invisible Light";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(wavelength);

        if (realResult.equals(expectedResult)) {
            System.out.println("Detect After Visible: OK");
        } else {
            System.out.println("Detect After Visible: FAIL");
        }
    }
}
