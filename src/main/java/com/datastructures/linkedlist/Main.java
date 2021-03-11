package com.datastructures.linkedlist;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        LinkedList linkedList = new LinkedList();
        /*
        linkedList.push(5);
        linkedList.push(20);
        linkedList.push(12);

        linkedList.append(34);
        linkedList.append(31);
        linkedList.append(8);
         */
        linkedList.pushInOrder(8);
        linkedList.pushInOrder(5);
        linkedList.pushInOrder(23);
        linkedList.pushInOrder(10);
        linkedList.pushInOrder(6);
        linkedList.pushInOrder(3);
        linkedList.pushInOrder(1);


        linkedList.printList();

    }
}

//12->20->5->34->31->8->null

//5->