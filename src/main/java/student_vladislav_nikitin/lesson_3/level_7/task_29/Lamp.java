package student_vladislav_nikitin.lesson_3.level_7.task_29;

class Lamp {
    private int brightness = 0;
    private boolean state = false;

    Lamp (int brightness, boolean state) {
        this.brightness = restrictBrightness(brightness);
        this.state = state;
    }

    Lamp (int brightness) {
        this.brightness = restrictBrightness(brightness);
    }

    @Override
    public String toString() {
        String humanState = this.state ? "on" : "off";
        String status = "Lamp is " + humanState + ". Brightness: " + this.brightness;
        return status;
    }

    private static int restrictBrightness(int brightness) {
        if (brightness >= 100) {
            return 100;
        }
        else return Math.max(brightness, 0);
    }

    void turnOn() {
        this.state = true;
    }

    void turnOff() {
        this.state = false;
    }

    void setBrightness(int brightness) {
        this.brightness = restrictBrightness(brightness);
    }
}
