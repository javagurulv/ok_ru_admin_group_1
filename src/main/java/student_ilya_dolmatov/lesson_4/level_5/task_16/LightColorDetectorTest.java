package student_ilya_dolmatov.lesson_4.level_5.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {

    LightColorDetectorTest() {
    }

    void detectVioletTest() {
        int wavelength = 400;
        String expectedResult = "Violet";
        LightColorDetector wave = new LightColorDetector();
        String result = wave.detect(wavelength);
        if (expectedResult == result) {
            System.out.println("True");
        } else System.out.println("False");
    }

        void detectBlueTest() {
            int wavelength = 494;
            String expectedResult = "Blue";
            LightColorDetector wave = new LightColorDetector();
            String result = wave.detect(wavelength);
            if (expectedResult == result) {
                System.out.println("True");
            } else System.out.println("False");
        }

        void detectGreenTest () {
            int wavelength = 569;
            String expectedResult = "Green";
            LightColorDetector wave = new LightColorDetector();
            String result = wave.detect(wavelength);
            if (expectedResult == result) {
                System.out.println("True");
            } else System.out.println("False");
        }

        void detectYellowTest () {
            int wavelength = 589;
            String expectedResult = "Yellow";
            LightColorDetector wave = new LightColorDetector();
            String result = wave.detect(wavelength);
            if (expectedResult == result) {
                System.out.println("True");
            } else System.out.println("False");
        }

        void detectOrangeTest () {
            int wavelength = 619;
            String expectedResult = "Orange";
            LightColorDetector wave = new LightColorDetector();
            String result = wave.detect(wavelength);
            if (expectedResult == result) {
                System.out.println("True");
            } else System.out.println("False");
        }

        void detectRedTest () {
            int wavelength = 750;
            String expectedResult = "Red";
            LightColorDetector wave = new LightColorDetector();
            String result = wave.detect(wavelength);
            if (expectedResult == result) {
                System.out.println("True");
            } else System.out.println("False");
        }

        void detectInvisibleLightTest () {
            int wavelength = 999;
            String expectedResult = "Invisible Light";
            LightColorDetector wave = new LightColorDetector();
            String result = wave.detect(wavelength);
            if (expectedResult == result) {
                System.out.println("True");
            } else System.out.println("False");
        }

}
