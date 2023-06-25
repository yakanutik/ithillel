package org.example.homeTasks.five;

public class One {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(s2));
        System.out.println(String.format("Hello %s", s2));

    }
}
