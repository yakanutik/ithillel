package org.example.homeTasks.four;

public class One {
    public static void main(String[] args) {
        // Home task one
        displayRandomUnicodeCharacters();
    }

    private static void displayRandomUnicodeCharacters() {
        char firstChar = '\u2248';
        char secondChar = '\u031a';
        char thirdChar = '\u256C';

        System.out.println(firstChar + " " + firstChar);
        System.out.println(secondChar + " " + secondChar);
        System.out.println(thirdChar + " " + thirdChar);
    }
}
