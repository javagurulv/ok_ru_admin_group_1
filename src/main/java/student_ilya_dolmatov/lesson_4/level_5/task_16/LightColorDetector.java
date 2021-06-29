package student_ilya_dolmatov.lesson_4.level_5.task_16;


class LightColorDetector {
    int wavelength;

    LightColorDetector() {
    }

    String detect(int wavelength) {
        this.wavelength = wavelength;
        if (wavelength >= 380 && wavelength <= 449) {
//            System.out.println("Violet");
            return "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
//            System.out.println("Blue");
            return "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
//            System.out.println("Green");
            return "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
//            System.out.println("Yellow");
            return "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
//            System.out.println("Orange");
            return "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
//            System.out.println("Red");
            return "Red";
        } else {
//            System.out.println("Invisible Light");
            return "Invisible Light";
        }
    }

}
