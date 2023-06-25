package org.example.homeTasks.five;

import java.util.ArrayList;
import java.util.List;

public class Three {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add(formatStudent("John", "Pet", "Computer Science"));
        students.add(formatStudent("Jane", "Dody", "Physics"));
        students.add(formatStudent("Bob", "Smith", "Mathematics"));

        for (String student : students) {
            System.out.println(student);
        }
    }

    private static String formatStudent(String firstName, String lastName, String faculty) {
        return String.format("Student: %s %s %s", firstName, lastName, faculty);
    }
}
