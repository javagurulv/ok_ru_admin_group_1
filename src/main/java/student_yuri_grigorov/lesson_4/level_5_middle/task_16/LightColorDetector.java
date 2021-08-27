package student_yuri_grigorov.lesson_4.level_5_middle.task_16;

class LightColorDetector {

    public String detect(int wavelength) {
        if (isViolet(wavelength)) {
            return "Violet";
        } else if (isBlue(wavelength)) {
            return "Blue";
        } else if (isGreen(wavelength)) {
            return "Green";
        } else if (isYellow(wavelength)) {
            return "Yellow";
        } else if (isOrange(wavelength)) {
            return "Orange";
        } else if (isRed(wavelength)) {
            return "Red";
        } else {
            return "Invisible Light";
        }
    }

    private Boolean inRange(int value, int start, int stop) {
        return value >= start && value <= stop;
    }

    private Boolean isViolet(int wavelength) {
        return inRange(wavelength, 380, 449);
    }

    private Boolean isBlue(int wavelength) {
        return inRange(wavelength, 450, 494);
    }

    private Boolean isGreen(int wavelength) {
        return inRange(wavelength, 495, 569);
    }

    private Boolean isYellow(int wavelength) {
        return inRange(wavelength, 570, 589);
    }

    private Boolean isOrange(int wavelength) {
        return inRange(wavelength, 590, 619);
    }

    private Boolean isRed(int wavelength) {
        return inRange(wavelength, 620, 750);
    }

}
