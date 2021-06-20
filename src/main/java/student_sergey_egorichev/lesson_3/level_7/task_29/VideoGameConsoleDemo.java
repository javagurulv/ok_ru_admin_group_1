package student_sergey_egorichev.lesson_3.level_7.task_29;

import java.util.HashMap;
import java.util.Map;

public class VideoGameConsoleDemo {

    public static void main(String[] args) {

        Map<String, VideoGameConsole> myCollection = new HashMap<>();

        myCollection.put("Famicom",
                new VideoGameConsole("Famicom", "Nintendo", 3, 1983));
        myCollection.put("Master System",
                new VideoGameConsole("Master System", "Sega", 3, 1985));
        myCollection.put("SNES",
                new VideoGameConsole("SNES", "Nintendo", 4, 1990));
        myCollection.put("PC Engine",
                new VideoGameConsole("PC Engine", "NEC", 4, 1987));
        myCollection.put("PlayStation",
                new VideoGameConsole("PlayStation", "Sony", 5, 1994));
        myCollection.put("Dreamcast",
                new VideoGameConsole("Dreamcast", "Sega", 6, 1998));
        myCollection.put("Xbox",
                new VideoGameConsole("Xbox", "Microsoft", 6, 2001));
        myCollection.put("PlayStation 2",
                new VideoGameConsole("PlayStation 2", "Sony", 6, 2000));
        myCollection.put("GBA",
                new VideoGameConsole("GBA", "Nintendo", 6, 2001));
        myCollection.put("Xbox 360",
                new VideoGameConsole("Xbox 360", "Microsoft", 7, 2005));
        myCollection.put("PlayStation 3",
                new VideoGameConsole("PlayStation 3", "Sony", 7, 2006));
        myCollection.put("Wii",
                new VideoGameConsole("Wii", "Nintendo", 7, 2006));
        myCollection.put("PSP Black",
                new VideoGameConsole("PSP", "Sony", 7,2004));
        myCollection.put("PSP White",
                new VideoGameConsole("PSP", "Sony", 7,2004));
        myCollection.put("Xbox One X",
                new VideoGameConsole("Xbox One X", "Microsoft", 8, 2017));
        myCollection.put("PlayStation 4 Pro",
                new VideoGameConsole("PlayStation 4 Pro", "Sony", 8, 2016));
        myCollection.put("Switch",
                new VideoGameConsole("Switch", "Nintendo", 8, 2017));
        myCollection.put("Switch Lite",
                new VideoGameConsole("Switch Lite", "Nintendo", 8, 2019));
        myCollection.put("PS Vita",
                new VideoGameConsole("PS Vita", "Sony", 8, 2011));
        myCollection.put("2DS",
                new VideoGameConsole("2DS", "Nintendo", 8, 2013));
        myCollection.put("new 3DS XL",
                new VideoGameConsole("new 3DS XL", "Nintendo", 8, 2014));
        myCollection.put("Xbox Series X",
                new VideoGameConsole("Xbox Series X", "Microsoft", 8, 2020));
        myCollection.put("NES Mini",
                new VideoGameConsole("NES Classic Mini", "Nintendo", null, 2016));
        myCollection.put("SNES Mini",
                new VideoGameConsole("SNES Classic Mini", "Nintendo", null, 2017));
        myCollection.put("PS Mini",
                new VideoGameConsole("PlayStation Classic", "Sony", null,2018));

        // Set custom colors
        myCollection.get("PlayStation 2").setColour("Pink");
        myCollection.get("PSP Black").setColour("Black");
        myCollection.get("PSP White").setColour("White");
        myCollection.get("Switch Lite").setColour("Yellow");

        myCollection.get("Famicom").setRegion("J-NTSC");
        myCollection.get("Master System").setRegion("PAL");
        myCollection.get("PC Engine").setRegion("J-NTSC");
        myCollection.get("SNES").setRegion("PAL");
        myCollection.get("Xbox").setRegion("PAL");

        // Make table header
        System.out.format("%12s%20s%6s%6s%7s%8s\n", "Manufacturer", "Name", "Gen", "Year", "Region", "Color");
        System.out.println("-----------------------------------------------------------");

        int numberOf = 0;

        for (Map.Entry entry : myCollection.entrySet()) {
            numberOf ++;
            VideoGameConsole console = (VideoGameConsole) entry.getValue();
            System.out.format("%12s%20s%6d%6d%7s%8s\n",
                    console.manufacturer, console.name, console.generation,
                    console.releaseYear, console.region, console.colour);
        }

        System.out.println("-----------------------------------------------------------");
        System.out.format("%52s%7d", "Total:", numberOf);

    }

}
