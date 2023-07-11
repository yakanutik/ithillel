package org.example.homeTasks.eleven;

import java.util.HashMap;

public class One {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);

        for (String key : map.keySet())
            System.out.println(key + " : " + map.get(key));
    }
}
