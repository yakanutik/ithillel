package org.example.homeTasks.thirteen;

import java.io.FileReader;
import java.io.PrintWriter;

public class File {
    private String folderName;
    private java.io.File folder;

    public File(String folderName) {
        this.folderName = folderName;
    }

    public void createFolder() {
        this.folder = new java.io.File(this.folderName);
        if (this.folder.mkdir()) {
            System.out.println(this.folderName + " created successfully");
        } else {
            System.out.println(this.folderName + " could not be created");
        }
    }

    public void createFile(String nameFile) {
        try {
            pathFile(nameFile).createNewFile();
            System.out.println(nameFile + " created successfully");
        } catch (Exception e) {
            System.out.println("could not be created");
        }
    }

    public void writeFile(String fileName, String phrase) {
        try {
            PrintWriter writer = new PrintWriter(this.folderName + "/" + fileName);
            writer.println(phrase);
            writer.close();
            System.out.println("Phrase " + phrase + " written to " + fileName + " successfully");
        } catch (Exception e) {
            System.out.println("Error writing to file " + fileName);
        }
    }

    public String readFile(String fileName) {
        String result = "";
        try {
            FileReader fr = new FileReader(this.folderName + "/" + fileName);
            int i;
            while ((i = fr.read()) != -1)
                result = result + (char) i;
            fr.close();
            System.out.println("Content read from " + fileName + " successfully");

        } catch (Exception e) {
            System.out.println("Error reading or writing to the file");
        }
        return result;
    }

    public void deleteFolder() {
        this.folder.delete();
        System.out.println("folder deleted successfully");
    }

    public void delete(String name) {
        pathFile(name).delete();
        System.out.println(name + "deleted successfully");
    }

    private java.io.File pathFile(String file) {
        return new java.io.File(this.folderName + "/" + file);
    }
}