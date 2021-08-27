package student_yuri_grigorov.lesson_4.level_5_middle.task_16;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectViolet();
        lightColorDetectorTest.detectBlue();
        lightColorDetectorTest.detectGreen();
        lightColorDetectorTest.detectYellow();
        lightColorDetectorTest.detectOrange();
        lightColorDetectorTest.detectRed();
        lightColorDetectorTest.detectInvisible1();
        lightColorDetectorTest.detectInvisible2();
    }

    private void detectViolet() {
        int waveLength = 380;
        String expectedResult = "Violet";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void detectBlue() {
        int waveLength = 450;
        String expectedResult = "Blue";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void detectGreen() {
        int waveLength = 495;
        String expectedResult = "Green";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void detectYellow() {
        int waveLength = 570;
        String expectedResult = "Yellow";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void detectOrange() {
        int waveLength = 590;
        String expectedResult = "Orange";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void detectRed() {
        int waveLength = 620;
        String expectedResult = "Red";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void detectInvisible1() {
        int waveLength = 100;
        String expectedResult = "Invisible Light";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void detectInvisible2() {
        int waveLength = 1000;
        String expectedResult = "Invisible Light";
        String testName = "Test detect(" + waveLength + "), expected " + expectedResult;
        LightColorDetector lightColorDetector = new LightColorDetector();
        doTest(lightColorDetector.detect(waveLength).equals(expectedResult), testName);
    }

    private void doTest(boolean condition, String testName) {
        String msg = (condition) ? testName + " = OK" : testName + " = FAIL";
        System.out.println(msg);
    }
}
