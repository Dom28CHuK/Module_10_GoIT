package classes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        String inputFile = "data.txt";
        String outputFile = "user.json";

        List<User> userList = readUsersFromFile(inputFile);
        writeUsersToJesonFile(userList, outputFile);
    }

    private static List<User> readUsersFromFile(String inputFile) {
        List<User> userList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String headerLine = reader.readLine();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(" ");

                if (columns.length >= 2) {
                    String name = columns[0];
                    int age = Integer.parseInt(columns[1]);

                    User user = new User(name, age);
                    userList.add(user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }

    private static void writeUsersToJesonFile(List<User> userList, String outputFile) {
       Gson gson = new GsonBuilder().setPrettyPrinting().create();

       try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
           gson.toJson(userList, writer);
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
