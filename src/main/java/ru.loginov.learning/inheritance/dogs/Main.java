package ru.loginov.learning.inheritance.dogs;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<Dog> dogs = new LinkedList<Dog>();
//        dogs.add(new Dog("dog"));
//        dogs.add(new Bulldog("bulldog"));
//
//        for (Dog dog : dogs) { // polymorphism
//            dog.woof();
//        }
        Dog bulldog = new Bulldog("bulldog");
        bulldog.woof();
        //concatenation:
        // null -> "null"
        // else -> myInstance.toString()
        bulldog = null;
        System.out.println(bulldog);

    }


}

