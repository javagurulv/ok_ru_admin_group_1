package student_yuri_grigorov.lesson_7.level_1.task_3;

class DefaultConstructorV3Demo {

    public static void main(String[] args) {
        DefaultConstructorV3 objV3 = new DefaultConstructorV3();
        // null is default value for object (String is an object)
        System.out.println("fullName: " + objV3.getFullName());
        // 0 is default value for int
        System.out.println("age: " + objV3.getAge());
        // false is default value for boolean
        System.out.println("male: " + objV3.isMale());
        // null is default value for object (Boolean is an object)
        System.out.println("female: " + objV3.getFemale());
    }
}
