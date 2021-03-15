package com.datastructures.linkedlist.sum;

public class PruebaLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(16);

        linkedList.add(13);
        linkedList.add(7);
        linkedList.print();

        linkedList.insertNodeAtPosition(1,2);
        linkedList.print();

    }
}
