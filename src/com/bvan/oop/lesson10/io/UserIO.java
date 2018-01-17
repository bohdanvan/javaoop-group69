package com.bvan.oop.lesson10.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class UserIO {

    public static void main(String[] args) {
        String inFileName = "files/users.csv";
        String outFileName = "files/users-out.txt";
        String binFileName = "files/users.dat";

        // 1. Create a stream +
        // 2. IO logic +
        // 3. Close the stream

        // < Java 7

        try {
//            testSerialization(inFileName, binFileName);
            testDeserialization(binFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, illegal format: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void testDeserialization(String binFileName) throws IOException {
        List<User> users = UserIOUtils.readUsersFromBinFile(binFileName);
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static List<User> testSerialization(String inFileName, String binFileName) throws IOException {
        List<User> users = UserIOUtils.readUsersFromFile(inFileName);
        UserIOUtils.writeUsersIntoBinFile(binFileName, users);
        return users;
    }


}
