package org.example.homeTasks.nine.three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();

        // Add 10 values to the ArrayList using a loop
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        // Delete 3 elements
        numbers.remove(2);  // Remove element at index 2
        numbers.remove(Integer.valueOf(5));  // Remove element with value 5
        numbers.remove(numbers.size() - 1);  // Remove the last element

        System.out.println("List after deletion: " + numbers);

        //Change type numbers to LinkedList
        numbers = new LinkedList<>(numbers);

        // Change a number by index
        int indexToChange = 3;
        int newValue = 15;

        if (indexToChange < numbers.size()) {
            numbers.set(indexToChange, newValue);
            System.out.println("List after changing value at index " + indexToChange + ": " + numbers);
        } else {
            System.out.println("Invalid index to change.");
        }
    }
}

