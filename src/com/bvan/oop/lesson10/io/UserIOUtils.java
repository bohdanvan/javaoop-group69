package com.bvan.oop.lesson10.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class UserIOUtils {

    // Binary Input

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static void writeUsersIntoBinFile(String fileName, List<User> users) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(users);
        }
    }

    // Binary Output

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<User> readUsersFromBinFile(String fileName) throws IOException {
        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream(fileName))) {
            return (List<User>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            throw new IllegalFormatException("Can't read users from " + fileName, e);
        }
    }

    // Text Output

    /**
     * @throws IOException
     */
    public static void writeUsersIntoFile(String fileName, List<User> users) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
                String s = user.getName() + "|" + user.getAge();
                writer.write(s);
                writer.newLine();
            }
        }
    }

    // Text Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static List<User> readUsersFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readUsers(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static List<User> readUsers(BufferedReader reader) throws IOException {
        List<User> users = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            User user = parseUser(line);
            users.add(user);
        }
        return users;
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static User readUserFromFile(String fileName) throws IOException {
        // Java 7: try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return parseUser(reader.readLine());
        }
    }

    /**
     * @throws FileNotFoundException
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static User readUserFromFileOld(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            return parseUser(reader.readLine());
        } finally {
            closeReader(reader);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalFormatException
     */
    private static User parseUser(String s) {
        String[] tokens = s.split(",");
        if (tokens.length < 2) {
            throw new IllegalFormatException("Must be 2 values (name,age): " + s);
        }

        String name = tokens[0].trim();

        if (!isInt(tokens[1].trim())) {
            throw new IllegalFormatException("Illegal age: " + s);
        }
        int age = Integer.parseInt(tokens[1].trim());

        return new User(name, age);
    }

    private static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
