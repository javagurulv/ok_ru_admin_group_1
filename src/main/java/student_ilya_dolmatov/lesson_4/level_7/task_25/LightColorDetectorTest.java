package student_ilya_dolmatov.lesson_4.level_7.task_25;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorTest {
    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest test = new LightColorDetectorTest();

        test.testViolet(405);
        test.testBlue(475);
        test.testGreen(505);
        test.testYellow(585);
        test.testOrange(619);
        test.testRed(620);
        test.testInvisible(760);
    }
    public void testViolet(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        String color = "Violet";
        checkResult(result, color);
    }
    public void testBlue(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        String color = "Blue";
        checkResult(result, color);
    }
    public void testGreen(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        String color = "Green";
        checkResult(result, color);
    }
    public void testYellow(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        String color = "Yellow";
        checkResult(result, color);
    }
    public void testOrange(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        String color = "Orange";
        checkResult(result, color);
    }
    public void testRed(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        String color = "Red";
        checkResult(result, color);
    }
    public void testInvisible(int wavelength) {
        String result = lightColorDetector.detect(wavelength);
        String color = "Invisible Light";
        checkResult(result, color);
    }
    void checkResult(String result, String color){
        if(result.equals(color)){
            System.out.println("LightColorDetector test - " + color + " =  OK");
        } else System.out.println("LightColorDetector test - " + color + " =  False");

    }
}
