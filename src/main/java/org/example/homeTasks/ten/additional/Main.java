package org.example.homeTasks.ten.additional;


import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // added set
        list.set(0,6);

        // added ListIterator
        ListIterator<Integer> iterator = list.listIterator();
        System.out.println("Forward Iteration:");
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println(element);
        }
    }
}

