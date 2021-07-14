package student_sergey_egorichev.lesson_7.level_3.task_9;

public class AbstractClassDemo {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void countIndex() {
                super.countIndex();
                this.index =+ 5;
            }
        };

        System.out.println(abstractClass.index);
        abstractClass.countIndex();
        System.out.println(abstractClass.index);
    }
}
