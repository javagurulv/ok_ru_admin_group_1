package student_petr_zaytsev.lesson_4.level_5;

import student_petr_zaytsev.lesson_4.level_4.CalculatorTest;

public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violet();
        lightColorDetectorTest.blue();
        lightColorDetectorTest.green();
        lightColorDetectorTest.yellow();
        lightColorDetectorTest.orange();
        lightColorDetectorTest.red();
        lightColorDetectorTest.invisible();
        lightColorDetectorTest.invisible2();


    }

    public void violet() {
        int waveLength = 381;
        String expectedResult = "Violet";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " test = FAIL");
        }

    }


    public void blue() {
        int waveLength = 493;
        String expectedResult = "Blue";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " test = FAIL");
        }

    }


    public void green() {
        int waveLength = 500;
        String expectedResult = "Green";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " test = FAIL");
        }

    }


    public void yellow() {
        int waveLength = 580;
        String expectedResult = "Yellow";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " test = FAIL");
        }

    }


    public void orange() {
        int waveLength = 611;
        String expectedResult = "Orange";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " test = FAIL");
        }

    }


    public void red() {
        int waveLength = 700;
        String expectedResult = "Red";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " = FAIL");
        }

    }


    public void invisible() {
        int waveLength = 0;
        String expectedResult = "Invisible Light";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " test = FAIL");
        }

    }


    public void invisible2() {
        int waveLength = 1000;
        String expectedResult = "Invisible Light";

        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLength);
        if (realResult == expectedResult) {
            System.out.println(expectedResult + " test = OK");
        } else {
            System.out.println(expectedResult + " 2 test = FAIL");
        }

    }


}
