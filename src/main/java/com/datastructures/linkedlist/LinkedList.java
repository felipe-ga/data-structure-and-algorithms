package com.datastructures.linkedlist;

public class LinkedList
{
    private Node m_head;
    private int count;
    public LinkedList()
    {
        m_head = null;
    }

    public void push(int data)
    {
        Node head_tmp = m_head;
        Node newNode = new Node(data);
        newNode.setNext(head_tmp);
        m_head = newNode;
    }

    public void append(int data)
    {
        Node newNode = new Node(data);
        if(m_head == null)
        {
            m_head = newNode;
            return;
        }
        Node last = m_head; // Checar si es copia o referencia
        while (last.getNext() != null)
        {
            last = last.getNext();
        }
        last.setNext(newNode);
        count++;
    }

    public void pushInOrder(int data)
    {
        append(data);
        for(int i = 0;i < count;i++){
            Node last = m_head;
            while(last.getNext() != null){
                if(last.getData() > last.getNext().getData()){
                    int dataTemp = last.getData();
                    last.setData(last.getNext().getData());
                    last.getNext().setData(dataTemp);
                }
                last = last.getNext();
            }
        }
    }


    public void printList()
    {
        Node head_tmp = m_head;
        System.out.print(head_tmp.getData() + "->");

        while(head_tmp.getNext() != null)
        {
            head_tmp = head_tmp.getNext();
            System.out.print(head_tmp.getData() + "->");
        }
        System.out.println("null");
    }

    public int getHead()
    {
        return m_head.getData();
    }
}
