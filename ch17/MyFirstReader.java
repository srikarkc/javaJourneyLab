import java.io.*;
import java.net.Socket;

public class MyFirstReader {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 5000);
            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(in);
            String message = reader.readLine();

            // to write
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println("message");
            writer.print("another message");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
