package student_vladislav_nikitin.lesson_4.level_5.task_16;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();

        lightColorDetectorTest.bottomBoundaryUnknownColorTest();
        lightColorDetectorTest.upperBoundaryUnknownColorTest();
    }

    void violetTest() {
        int waveLength = 395;
        String expectedResult = "Violet";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    void blueTest() {
        int waveLength = 464;
        String expectedResult = "Blue";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    void greenTest() {
        int waveLength = 538;
        String expectedResult = "Green";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    void yellowTest() {
        int waveLength = 572;
        String expectedResult = "Yellow";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    void orangeTest() {
        int waveLength = 600;
        String expectedResult = "Orange";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    void redTest() {
        int waveLength = 723;
        String expectedResult = "Red";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    void bottomBoundaryUnknownColorTest() {
        int waveLength = 216;
        String expectedResult = "Unknown color";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Unknown color test = OK");
        } else {
            System.out.println("Unknown color test = FAIL");
        }
    }

    void upperBoundaryUnknownColorTest() {
        int waveLength = 934;
        String expectedResult = "Unknown color";

        if (expectedResult.equals(LightColorDetector.detect(waveLength))) {
            System.out.println("Unknown color test = OK");
        } else {
            System.out.println("Unknown color test = FAIL");
        }
    }
}
