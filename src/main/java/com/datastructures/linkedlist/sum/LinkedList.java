package com.datastructures.linkedlist.sum;

public class LinkedList {
    public Node head;

    //insert Node At Position
    public void insertNodeAtPosition(int data, int position) {
        if(head == null){
            return;
        }
        Node current = head;
        int count = 1;
        while(current.next != null){
            current = current.next;
            Node tempNode = current.next;
            if(count + 1 == position){
                current.next = new Node(data);
                current.next.next = tempNode;
                break;
            }
            count++;
        }
    }
    public void add(int data){
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void print(){
        Node current = head;
        System.out.print(current.data + "->");
        while(current.next != null){

            current = current.next;
            System.out.print(current.data + "->");
        }
        System.out.println();
    }
}
