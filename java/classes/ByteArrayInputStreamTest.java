package classes;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTest {
    public void byteArray(byte[] bytes) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        while (bais.available() > 0) {
            byte currentByte = (byte) bais.read();
            System.out.print("[ " + currentByte + " ]");
        }
        bais.close();
    }
    public void readAllDataAtOnceWithOneCall(byte[] bytes, byte[] buffer) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        int readByteCount = bais.read(buffer, 0, buffer.length);

        for (int i = 0; i < readByteCount; i++) {
            System.out.print("[ " + buffer[i] + " ]");
        }
        bais.close();
    }
}
