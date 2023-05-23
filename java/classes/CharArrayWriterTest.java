package classes;

import java.io.CharArrayWriter;
import java.util.Arrays;

public class CharArrayWriterTest {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();

        charArrayWriter.append("Java");

        char[] result = charArrayWriter.toCharArray();

        System.out.println(Arrays.toString(result));
    }
}
