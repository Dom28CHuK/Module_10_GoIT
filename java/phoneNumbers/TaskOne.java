package phoneNumbers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {
    public static void main(String[] args) {
        String fileName = "file.txt";
        readAndPrintValidPhoneNumbers(fileName);
    }

    public static void readAndPrintValidPhoneNumbers(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (isValidPhoneNumbers(line)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isValidPhoneNumbers(String phoneNumber) {
        String pattern1 = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        String pattern2 = "\\d{3}-\\d{3}-\\d{4}";

        Pattern regexPattern = Pattern.compile(pattern1 + "|" + pattern2);
        Matcher matcher = regexPattern.matcher(phoneNumber);

        return matcher.matches();
    }
}
