package student_sergey_egorichev.lesson_3.level_7.task_29;

public class VideoGameConsole {

    String name;
    String manufacturer;
    Integer generation;
    int releaseYear;
    String colour;
    String region;

    VideoGameConsole(String name, String manufacturer, Integer generation, int releaseYear) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.generation = generation;
        this.releaseYear = releaseYear;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
