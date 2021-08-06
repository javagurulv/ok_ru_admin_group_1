package student_ilya_dolmatov.lesson_4.level_5.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LightColorDetectorDemo {
    public static void main(String[] args) {

        System.out.println("Run tests!");
        LightColorDetectorTest waveTest = new LightColorDetectorTest();
        waveTest.detectVioletTest();
        waveTest.detectBlueTest();
        waveTest.detectGreenTest();
        waveTest.detectYellowTest();
        waveTest.detectOrangeTest();
        waveTest.detectRedTest();
        waveTest.detectInvisibleLightTest();

        System.out.println("\nRun Detector!");
        LightColorDetector wave = new LightColorDetector();
        System.out.println(wave.detect(600));


    }
}
