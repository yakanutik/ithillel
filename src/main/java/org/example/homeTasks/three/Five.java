package org.example.homeTasks.three;

public class Five {
    public static void main(String[] args) {
        // Home task five
        int[][] numbers = {
                {5, 12, 7, 2},
                {9, 6, 18, 44},
                {31, 56, 4, 33}
        };

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int x = 0; x < numbers[i].length; x++) {
                if (numbers[i][x] < min) {
                    min = numbers[i][x];
                }
            }
        }
        System.out.println("Minimum number in array : " + min);
    }
}

