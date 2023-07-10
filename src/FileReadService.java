import Files.Content;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FileReadService {
    public static FileInputStream inputStream;

    public static String redFile(String nameFile) {
        try {
            inputStream = new FileInputStream(Content.PATH_FILE + nameFile + Content.FORMAT);
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(Content.PATH_FILE + nameFile + Content.FORMAT), StandardCharsets.UTF_8));
            String nextString;
            while ((nextString = bufferedReader.readLine()) != null) {
                System.out.println(nextString);
            }
        } catch (IOException e) {
            return "No file to read";
        }
        return "File read";

    }

}
