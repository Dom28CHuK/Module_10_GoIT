package wordsList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        String fileName = "words.txt";
        Map<String, Integer> wordFrequency = countWordFrequency(fileName);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequency(String fileName) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String word = scanner.next();
                word = word.toLowerCase();

                word = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");

                if (!word.isEmpty()) {
                    if (wordFrequency.containsKey(word)) {
                        int frequency = wordFrequency.get(word);
                        wordFrequency.put(word, frequency + 1);
                    } else {
                        wordFrequency.put(word, 1);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordFrequency;
    }
}
