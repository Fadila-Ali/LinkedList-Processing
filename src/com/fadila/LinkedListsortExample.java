package com.fadila;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListsortExample {
    public static void main(String[] args) {

        // Create linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("C");
        linkedList.add("B");
        linkedList.add("D");

        // Unsorted
        System.out.println(linkedList);

        // sort the list
        Collections.sort(linkedList);
        System.out.println(linkedList);

        // custom sorting
        Collections.sort(linkedList, Collections.reverseOrder());
        System.out.println(linkedList);
    }
}
