import java.io.*;
import java.nio.file.Path;

public class FileReader {

    public static void main(String[] args) {
        try {
            Files.lines(Path.of("hello.txt")).forEach(line -> System.out.println(line));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
