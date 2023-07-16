package org.example.homeTasks.thirteen;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Two {
    public static void main(String[] args) throws FileNotFoundException {
        Cat cat = new Cat("Betty", 2, 5);
        String fileName = "cat.dat";

        createAndWrite(cat, fileName);
        readAndPrint(fileName);
        delete(fileName);
    }

    private static void readAndPrint(String fileName) {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(fileName))) {
            try {
                Cat c = (Cat) oos.readObject();
                System.out.println(c);
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createAndWrite(Cat cat, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(cat);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
