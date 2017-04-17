package ru.loginov.learning;

import java.util.*;

public class Collections {

/*
*  Object      |-> List
*     |        |
*  ArrayList---
* */

    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        list1.add(1);
        System.out.println(list1.contains(1));
        System.out.println(list1.get(0));
        list1.remove(0);
        System.out.println("-----");

        Stack<Integer> stack = new Stack<Integer>();
        //FILO - first in last out
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        System.out.println("-----");

        Queue<Integer> queue = new LinkedList<Integer>();
        //FIFO
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

}
