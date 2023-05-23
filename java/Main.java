import classes.ByteArrayInputStreamTest;
import classes.CharArrayReaderTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        ByteArrayInputStreamTest byteArrayInputStreamTest = new ByteArrayInputStreamTest();
//        byteArrayInputStreamTest.byteArray(new byte[]{2, 4, 6, 8, 9, 1, 2, 3, 7});
//        byteArrayInputStreamTest.readAllDataAtOnceWithOneCall(new byte[] {1,3,5,7,9}, new byte[1024]);

        CharArrayReaderTest charArrayReaderTest = new CharArrayReaderTest();
        charArrayReaderTest.charArrayReaderTestMethod(new char[] {'J', 'a', 'v', 'a'});

    }
}
