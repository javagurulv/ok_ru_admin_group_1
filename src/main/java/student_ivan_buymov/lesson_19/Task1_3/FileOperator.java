package student_ivan_buymov.lesson_19.Task1_3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperator {

    public String WriteToFile(int[] numbers) throws IOException {
        File tempFile = File.createTempFile("test", "test");
        FileWriter writer = new FileWriter(tempFile);
        for (int i : numbers) {
            writer.write(i + "\n");
        }
        writer.close();
        return tempFile.getPath();
    }

    public String ReadFromFile(String path) throws IOException {

        String content = Files.readString(Paths.get(path), StandardCharsets.UTF_8);
        return content;

    }

    public File findBiggestFile(String searchPath) throws FileOperatorExceptions.PathNotADirectory, IOException {
        File f = new File(searchPath);
        if (!f.isDirectory()){
            throw new FileOperatorExceptions.PathNotADirectory("not a directory: " + searchPath);
        }

        Stream<Path> paths = Files.walk(Paths.get(f.getPath()));
        long maxSize = 0;
        File biggestFile = null;
        for(var file : paths.collect(Collectors.toList())) {
            var currentFile = new File(file.toAbsolutePath().toString());
            var currentFileSize = currentFile.length();
            if (currentFileSize > maxSize) {
                maxSize = currentFileSize;
                biggestFile = currentFile;
            }
        }
        return biggestFile;
    }


}
