package StringFIleReaderWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringFileReader {
    private String path;

    public StringFileReader(String path) {
        this.path = path;
    }

    public String readString() {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while (bufferedReader.ready()) {
                result.append(bufferedReader.readLine()).append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }
}
