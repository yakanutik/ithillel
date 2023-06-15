package org.example.homeTasks.three;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        // Home task one
        System.out.println("Enter the length of the array (length should be from 1 to 255): ");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("array ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
