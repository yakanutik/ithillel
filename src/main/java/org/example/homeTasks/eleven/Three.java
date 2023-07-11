package org.example.homeTasks.eleven;

import java.util.ArrayList;

public class Three {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        int num = 2;

        System.out.println("Number of occurrences of element "
                + num + " : " + counterCatch(list, num));
    }

    private static int counterCatch(ArrayList<Integer> list, int num) {
        int count = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) == num) {
                count++;
            }
        return count;
    }
}
