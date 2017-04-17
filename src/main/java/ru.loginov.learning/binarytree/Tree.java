package ru.loginov.learning.binarytree;

public class Tree {
    private final Node root;
    //memory: O(n)
    //time: O(n*ln n)
    public Tree(int... arr) {
        root = new Node(arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            root.add(new Node(arr[i]));
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(1, 1, 1, 1, 1, 1, 1); //n
        tree.root.print();
    }

}
