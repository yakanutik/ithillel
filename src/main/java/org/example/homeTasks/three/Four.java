package org.example.homeTasks.three;

public class Four {
    public static void main(String[] args) {
    // Home task four
        int[][] m = new int[5][9];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = i + j;
            }
        }

        for (int z = 0; z < m.length; z++) {
            for (int x = 0; x < m[z].length; x++) {
                System.out.printf("%-5d", m[z][x]);
            }
            System.out.println();
        }
    }
}
