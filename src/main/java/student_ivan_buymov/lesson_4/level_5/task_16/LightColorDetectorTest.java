package student_ivan_buymov.lesson_4.level_5.task_16;


public class LightColorDetectorTest {

    public static void main(String[] args) {
       var detector = new LightColorDetector();
       checkBlue(detector);
       // checkViolet(detector);
       // ...
       // checkOrange(detector);

        checkBadValues(detector);

    }

    static void checkBadValues(LightColorDetector detector) {
        var value = -1;
        var expectedColor = "Invisible Light";
        if (expectedColor == detector.detect(value)) {
            System.out.println("Check bad value: OK");
        } else {
            System.out.println("Check bad value: FAIL");
        }

    }

    static void checkBlue(LightColorDetector detector) {
        var expectedColor = "Blue";
        var value = 494;
        if (expectedColor == detector.detect(value)) {
            System.out.println("check " + value + " Blue: OK");
        } else {
            System.out.println("check " + value + " Blue: FAIL");
            System.exit(1);
        }
        value = 450;
        if (expectedColor == detector.detect(value)) {
            System.out.println("check " + value + " Blue: OK");
        } else {
            System.out.println("check " + value + " Blue: FAIL");
            System.exit(1);
        }
        value = 4;
        if (expectedColor == detector.detect(value)) {
            System.out.println("check " + value + " is not Blue: FAIL");
            System.exit(1);
        } else {
            System.out.println("check " + value + " is not Blue: OK");
        }
    }
}
