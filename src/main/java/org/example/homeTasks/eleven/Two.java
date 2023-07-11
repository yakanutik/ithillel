package org.example.homeTasks.eleven;

import java.util.ArrayList;
import java.util.HashSet;

public class Two {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Perl");
        list.add("C++");
        list.add("Java");
        list.add("C++");
        list.add("C#");

        System.out.println("List with duplicates: " + list);
        System.out.println("List without duplicates: " + uniqueList(list));
    }

    public static HashSet<String> uniqueList(ArrayList<String> list) {
        HashSet set = new HashSet<>();
        set.addAll(list);
        return set;
    }
}
