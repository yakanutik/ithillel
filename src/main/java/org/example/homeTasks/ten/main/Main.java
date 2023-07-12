package org.example.homeTasks.ten.main;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<Integer> array = new CustomLinkedList<>();
        array.add(9);
        array.add(2);
        array.add(20);
        array.add(35);

        array.delete(3);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

        System.out.println("getLast element: " + array.getLast());
        System.out.println("getFirst element: " + array.getFirst());
        array.addFirst(5);
        System.out.println("getFirst element: " + array.getFirst());
    }
    /*
    Відміності між ArrayList та LinkedList.
    ArrayList базується на масиві, який динамічно розширюється, тому при додаванні елемента відбувається перезапис усього масива, а це не надто швидко.
    LinkedList базується на Node, які зберігають в собі посилання на попередній та наступний елементи, згідно з цим додавання елемента відбувається значно
     швидше, бо полягає в зміненні посилань.
     */
}
