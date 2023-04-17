import java.io.*;

public class TryResource {
    public static void main(String[] args) {
        String str;
        try (BufferedReader br = new BufferedReader(new FileReader("d:\\madhu\\File.txt"))) {

            // opening file in read mode using BufferedReader stream
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException ie) {
            System.out.println("I/O Exception " + ie);
        }
    }
}
