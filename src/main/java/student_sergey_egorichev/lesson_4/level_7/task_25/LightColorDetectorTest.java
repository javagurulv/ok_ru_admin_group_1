package student_sergey_egorichev.lesson_4.level_7.task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        testColor(405, "Violet");
        testColor(475, "Blue");
        testColor(505, "Green");
        testColor(585, "Yellow");
        testColor(619, "Orange");
        testColor(620, "Red");
        testColor(760, "Invisible Light");
    }

    private static void testColor(int wavelength, String expectedResult) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        if (lightColorDetector.detect(wavelength).equals(expectedResult)) {
            System.out.println("LightColorDetector test - " + expectedResult + " = OK");
        } else {
            System.out.println("LightColorDetector test - " + expectedResult + " = FAIL");
        }
    }
}