package org.example.homeTasks.thirteen;

import java.io.*;

public class One {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFolder");

        file.createFolder();
        file.createFile("firstFile.txt");
        file.createFile("secondFile.txt");

        file.writeFile("firstFile.txt", "Java world");

        String phrase = file.readFile("firstFile.txt");
        System.out.println(phrase + "from firstFile.txt");
        file.writeFile("secondFile.txt", phrase);

        String phraseNew = file.readFile("firstFile.txt");
        System.out.println(phraseNew + "from secondFile.txt");

        file.delete("firstFile.txt");
        file.delete("secondFile.txt");
        file.deleteFolder();
    }
}