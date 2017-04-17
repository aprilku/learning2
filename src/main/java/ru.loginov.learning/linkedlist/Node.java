package ru.loginov.learning.linkedlist;

public class Node {
    final int value;
    Node next;
    Node prev;

    public Node(int value) {

        this.value = value;
    }
    //Конструктор инициализирует финальное поле value


    @Override
    public String toString() {
        return value + "";
    }
}
