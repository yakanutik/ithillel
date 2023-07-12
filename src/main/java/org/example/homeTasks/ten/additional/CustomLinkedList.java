package org.example.homeTasks.ten.additional;

import java.util.ListIterator;
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

    public void set(int index, Element element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<Element> currentNode = getNodeByIndex(index);
        currentNode.item = element;
    }

    private Node<Element> getNodeByIndex(int index) {
        Node<Element> currentNode = first;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public ListIterator<Element> listIterator() {
        return new CustomListIterator();
    }

    private class CustomListIterator implements ListIterator<Element> {
        private Node<Element> current = first;
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < size;
        }

        public Element next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Element element = current.item;
            current = current.next;
            currentIndex++;
            return element;
        }

        public boolean hasPrevious() {
            return currentIndex > 0;
        }

        public Element previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            current = current.prev;
            currentIndex--;
            return current.item;
        }

        public int nextIndex() {
            return currentIndex;
        }

        public int previousIndex() {
            return currentIndex - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("is not supported in CustomLinkedList");
        }

        public void set(Element element) {
            if (current == null) {
                throw new IllegalStateException();
            }
            current.item = element;
        }

        public void add(Element element) {

        }
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
}