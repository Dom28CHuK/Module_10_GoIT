package classes;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest {
    public void charArrayReaderTestMethod(char[] chars) throws IOException {
        CharArrayReader reader = new CharArrayReader(chars);

        char[] buffer = new char[1024];
        int charCount = reader.read(buffer, 0, buffer.length);

        for (int i = 0; i < charCount; i++) {
            System.out.println(buffer[i]);
        }

//        int nextChar = -1;
//        while ((nextChar = reader.read()) != -1) {
//            char c = (char) nextChar;
//            System.out.print(c);
    }
}

