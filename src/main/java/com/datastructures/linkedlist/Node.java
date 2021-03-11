package com.datastructures.linkedlist;

public class Node implements Cloneable
{
    private int m_data;
    private Node m_next;

    public Node(int data)
    {
        m_data = data;
        m_next = null;
    }

    public void setNext(Node next)
    {
        m_next = next;
    }

    public Node getNext()
    {
        return m_next;
    }

    public int getData()
    {
        return m_data;
    }

    public void setData(int data)
    {
        m_data = data;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
