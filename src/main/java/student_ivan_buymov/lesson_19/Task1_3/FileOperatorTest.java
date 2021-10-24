package student_ivan_buymov.lesson_19.Task1_3;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileOperatorTest {

    public static void main(String[] args) throws IOException, FileOperatorExceptions.PathNotADirectory {

        // task 1
        var fileOperator = new FileOperator();
        int[] randomIntsArray = IntStream.generate(() -> new Random().nextInt(100)).limit(10).toArray();
        System.out.println("rand numbers is: " + Arrays.toString(randomIntsArray));
        String pathToFileWithNumbers = fileOperator.WriteToFile(randomIntsArray);
        System.out.printf("numbers written to: %s\n", pathToFileWithNumbers);

        // task 2
        String stringsFromFile = fileOperator.ReadFromFile(pathToFileWithNumbers);
        List<String> numbersStrList = Arrays.stream(stringsFromFile.split("\n")).collect(Collectors.toList());
        int sum = 0;
        for(String s: numbersStrList) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.printf("can't convert '%s' to integer, skip it\n", s);
            }
        }
        System.out.printf("sum numbers from %s: %d\n", pathToFileWithNumbers, sum);

        //task 3
        String searchIn = ".";
        File searchInFile = new File(".");
        var a = fileOperator.findBiggestFile(searchIn);
        System.out.println("searching files in: " + searchInFile.getAbsolutePath());
        System.out.println("biggest file: " + a.getAbsoluteFile());
        System.out.println("size in KB: " + a.length() / 1024);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM d  H:mm:ss");
        String date = sdf.format(a.lastModified());
        System.out.println("last modified at: " +  date);

    }

}