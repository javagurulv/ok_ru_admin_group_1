package student_vladislav_nikitin.lesson_4.level_7.task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();

        LightColorDetector detector = new LightColorDetector();

        lightColorDetector.testColor(405, "Violet", detector);
        lightColorDetector.testColor(475, "Blue", detector);
        lightColorDetector.testColor(505, "Green", detector);
        lightColorDetector.testColor(585, "Yellow", detector);
        lightColorDetector.testColor(619, "Orange", detector);
        lightColorDetector.testColor(629, "Red", detector);
        lightColorDetector.testColor(760, "Invisible Light", detector);

    }

    public void testColor(int wavelength, String color, LightColorDetector detector) {
        String result = detector.detect(wavelength);
        System.out.println(testResult(result, color));
    }

    public String testResult(String result, String expectedResult) {
        String testOut = "LightColorDetector test - " + expectedResult + " = ";
        return result.equals(expectedResult) ? testOut + "OK" : testOut + "FAIL";
    }
}
