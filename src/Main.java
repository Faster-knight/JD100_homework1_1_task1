import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        OutputStreamWriter stream = new OutputStreamWriter(System.out);
        try {
            stream.write("Trofim Postnikov\n");
            stream.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}