import java.io.*;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("Hello!");
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
