package org.example.homeTasks.three;

public class Three {
    public static void main(String[] args) {

        // Home task three
        // while
        int i = 0;
        int d = 0;
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int j = array1.length;
        while (i < j) {
            if ((array1[i] % 2) == 0) d += 1;
            i += 1;
        }
        System.out.println("Our array has " + d + " even numbers");

        // do while
        int q = 2;
        System.out.println("Start ----> do while");
        do {
            System.out.println(q);
            q *= 2;
        } while (q < 1000);
        System.out.println("End <---- do while");
    }
}
