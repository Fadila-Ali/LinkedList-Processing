package com.fadila;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        /* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<>();

        /* add (String Element) is used for adding
        the elements to the linked list
         */
        linkedList.add("Item1");
        linkedList.add("Item5");
        linkedList.add("Item3");
        linkedList.add("Item6");
        linkedList.add("Item2");

        // Display Linked List content
        System.out.println("LinkedList content: " + linkedList);

        // Add First and Last Element
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("LinkedList content after addition: " + linkedList);

        // This is how to get and set values
        Object firstvar = linkedList.get(0);
        System.out.println("First element in LinkedList: " + firstvar);
        linkedList.set(0, "Changed first item");
        Object firstvar2 = linkedList.get(0);
        System.out.println("First element in LinkedList after update by set method: " + firstvar2);

        // Remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList content after deletion of first and last elements: " + linkedList);

        // Add to a position and remove from a position
        linkedList.add(0, "New Item");
        linkedList.remove(2);
        System.out.println("Final content: " + linkedList);

    }
}
