package student_ivan_buymov.lesson_19.Task1_3;

public class FileOperatorExceptions {

    public static class PathNotADirectory extends Exception {
        public PathNotADirectory(String errorMessage) {
            super(errorMessage);
        }
    }


}