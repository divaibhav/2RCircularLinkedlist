package main;

import implementation.MySinglyCircularLinkedList;

public class MyMain {
    public static void main(String[] args) {
        MySinglyCircularLinkedList circularLinkedList =
                new MySinglyCircularLinkedList();
        System.out.println(circularLinkedList.size());
        circularLinkedList.addFirst(50);
        circularLinkedList.addLast(10);
        circularLinkedList.addLast(60);
        circularLinkedList.traverse();
        System.out.println("size = " + circularLinkedList.size());
        System.out.println("size = " + circularLinkedList.sizeByTraverse());
        System.out.println(circularLinkedList.removeFirst());
        circularLinkedList.traverse();
    }
}
