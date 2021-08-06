package student_vladislav_nikitin.lesson_4.level_5.task_16;

class LightColorDetector {
    static public String detect(int waveLength) {
        if (isViolet(waveLength)) {
            return "Violet";
        }
        else if (isBlue(waveLength)) {
            return "Blue";
        }
        else if (isGreen(waveLength)) {
            return "Green";
        }
        else if (isYellow(waveLength)) {
            return "Yellow";
        }
        else if (isOrange(waveLength)) {
            return "Orange";
        }
        else if (isRed(waveLength)) {
            return "Red";
        }
        else {
            return "Unknown color";
        }
    }

    static boolean isViolet(int waveLength) {
        return ((waveLength >= 380) && (waveLength < 450));
    }

    static boolean isBlue(int waveLength) {
        return ((waveLength >= 450) && (waveLength < 495));
    }

    static boolean isGreen(int waveLength) {
        return ((waveLength >= 495) && (waveLength < 570));
    }

    static boolean isYellow(int waveLength) {
        return ((waveLength >= 570) && (waveLength < 590));
    }

    static boolean isOrange(int waveLength) {
        return ((waveLength >= 590) && (waveLength < 620));
    }

    static boolean isRed(int waveLength) {
        return ((waveLength >= 620) && (waveLength < 750));
    }
}
