package ru.loginov.learning.linkedlist;

public class List {

    private Node first = null;

    public void add(int val) {
        Node newNode = new Node(val);
        if (first == null) {
            first = newNode;
        } else {
            if (newNode.value < first.value) {
                newNode.next = first;
                first.prev = newNode;
                first = newNode;
            } else {
                Node current = first;
                while (current.value <= newNode.value) {
                    if (current.next != null) {
                        current = current.next;
                    } else {
                        current.next = newNode;
                        newNode.prev = current;
                        break;
                    }
                }
            }
        }
    }

    private int get(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IllegalArgumentException();
            }
            current = current.next;
        }
        return current.value;
    }

    private void printAll() {
        Node current = first;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(-1);
        list.add(-2);
        list.add(3);

        list.printAll();
    }
}
