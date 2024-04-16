import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Runner {
    public static String readFromInputStream(InputStream inputStream)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                     = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }
    public static void main(String[] args) throws IOException {
            String expectedData = "Hello, world!";

            Class clazz = Runner.class;
            InputStream inputStream = clazz.getResourceAsStream("fileTest.txt");
            String data = readFromInputStream(inputStream);

            System.out.println(data);
    }
}
