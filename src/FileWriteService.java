import Files.Content;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public static FileOutputStream outputStream;

    public static String createFile(String nameFile, String text) {
        try {
            outputStream = new FileOutputStream(Content.PATH_FILE + nameFile + Content.FORMAT);
            byte[] arr = text.getBytes();
            outputStream.write(arr, 0, arr.length);
            outputStream.close();
        } catch (IOException e) {
            return e.getMessage();
        }
        return "File saved successfully";

    }

}
