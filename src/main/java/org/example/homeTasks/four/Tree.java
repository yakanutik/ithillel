package org.example.homeTasks.four;

public class Tree {
    public static void main(String[] args) {
        // Home task tree
        int number = 5;
        int cube = getCube(number);
        System.out.println("The cube of " + number + " is: " + cube);
    }

    public static int getCube(int num) {
        return num * num * num;
    }
}
