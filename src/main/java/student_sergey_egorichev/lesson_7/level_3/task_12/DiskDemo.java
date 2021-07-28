package student_sergey_egorichev.lesson_7.level_3.task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DiskDemo {
    public static void main(String[] args) {

        SSD ssd1 = new SSD("Micron", "5330Pro");
        SSD ssd2 = new SSD("Samsung", "870Evo", "2.5",0.33 );

        HDD hdd1 = new HDD("HGST", "HC650");
        hdd1.setRpm(7200);
        hdd1.setFormFactor("3.5");
        HDD hdd2 = new HDD("Segate", "Exos 7E2", "3.5", 7200 );

    }
}
