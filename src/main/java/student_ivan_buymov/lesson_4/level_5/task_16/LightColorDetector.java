package student_ivan_buymov.lesson_4.level_5.task_16;


public class LightColorDetector {

    public Boolean isInsideRange(int value, int start, int finish) {
        return (value >= start) && (value <= finish);
    }

    public String detect(int wavelength) {

        if (isInsideRange(wavelength, 380, 449)) {
            return "Violet";
        }
        if (isInsideRange(wavelength, 450, 494)) {
            return "Blue";
        }
        if (isInsideRange(wavelength, 495, 569)) {
            return "Green";
        }
        if (isInsideRange(wavelength, 590, 619)) {
            return "Yellow";
        }
        if (isInsideRange(wavelength, 620, 750)) {
            return "Orange";
        }
        return "Invisible Light";

    }

}
