package org.example.homeTasks.ten.main;

import java.util.NoSuchElementException;

public class CustomLinkedList<Element> {

    private Node<Element> first;
    private Node<Element> last;
    private int size = 0;

    public void add(Element element) {
        if (first == null) {
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
        } else {
            Node<Element> node = new Node<>(element, null, last);
            last.next = node;
            last = node;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Element get(int index) {
        return getNodeByIndex(index).item;
    }

    public Node<Element> getNodeByIndex(int index) {
        Node<Element> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void delete(int index) {
        Node<Element> currentNode = getNodeByIndex(index);
        if (index == 0) {
            first = currentNode.next;
        } else if (index == size - 1) {
            last = currentNode.prev;
        } else {
            Node<Element> nodeBefore = currentNode.prev;
            Node<Element> nodeAfter = currentNode.next;
            nodeBefore.next = nodeAfter;
            nodeAfter.prev = nodeBefore;
        }
        size--;
    }

    private static class Node<Element> {
        Element item;
        Node<Element> next;
        Node<Element> prev;

        public Node(Element item, Node<Element> next, Node<Element> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    // getFirst method
    public Element getFirst() {
        if (first != null) {
            return first.item;
        } else {
            throw new NoSuchElementException("List is empty");
        }
    }

    // getLast method
    public Element getLast() {
        if (last != null) {
            return last.item;
        } else {
            throw new NoSuchElementException("List is empty");
        }
    }

    // addFirst method
    public void addFirst(Element element) {
        if (first == null) {
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
        } else {
            Node<Element> node = new Node<>(element, first, null);
            first.prev = node;
            first = node;
        }
        size++;
    }
}
