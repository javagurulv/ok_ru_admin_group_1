package student_maxim_narodovich.lesson_4.level_5.task_16;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest LightColorDetectorTest = new LightColorDetectorTest();
        LightColorDetectorTest.violetTest();
        LightColorDetectorTest.blueTest();
        LightColorDetectorTest.greenTest();
        LightColorDetectorTest.yellowTest();
        LightColorDetectorTest.orangeTest();
        LightColorDetectorTest.redTest();
        LightColorDetectorTest.invisibleTest();

    }
    public void violetTest() {
        int waveLenght = 420;
        String expectedResult = "Violet";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLenght);
        if (realResult == expectedResult) {
            System.out.println("Violet Test = OK");
        } else {
            System.out.println("Violet Test = FAIL");
        }
    }
    public void blueTest() {
        int waveLenght = 480;
        String expectedResult = "Blue";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLenght);
        if (realResult == expectedResult) {
            System.out.println("Blue Test = OK");
        } else {
            System.out.println("Blue Test = FAIL");
        }
    }
    public void greenTest() {
        int waveLenght = 540;
        String expectedResult = "Green";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLenght);
        if (realResult == expectedResult) {
            System.out.println("Green Test = OK");
        } else {
            System.out.println("Green Test = FAIL");
        }
    }
    public void yellowTest() {
        int waveLenght = 580;
        String expectedResult = "Yellow";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLenght);
        if (realResult == expectedResult) {
            System.out.println("Yellow Test = OK");
        } else {
            System.out.println("Yellow Test = FAIL");
        }
    }
    public void orangeTest() {
        int waveLenght = 600;
        String expectedResult = "Orange";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLenght);
        if (realResult == expectedResult) {
            System.out.println("Orange Test = OK");
        } else {
            System.out.println("Orange Test = FAIL");
        }
    }
    public void redTest() {
        int waveLenght = 740;
        String expectedResult = "Red";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLenght);
        if (realResult == expectedResult) {
            System.out.println("Red Test = OK");
        } else {
            System.out.println("Red Test = FAIL");
        }
    }
    public void invisibleTest() {
        int waveLenght = 120;
        String expectedResult = "Invisible Light";
        LightColorDetector detector = new LightColorDetector();
        String realResult = detector.detect(waveLenght);
        if (realResult == expectedResult) {
            System.out.println("Invisible Test = OK");
        } else {
            System.out.println("Invisible Test = FAIL");
        }
    }
}
