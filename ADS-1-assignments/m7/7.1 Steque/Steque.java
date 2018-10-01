/*
 * Java Program to Implement Queue using Linked List
 */
import java.util.*;
/*  Class Node  */
class Node {
    protected int data;
    protected Node link;

    /*  Constructor  */
    public Node() {
        link = null;
        data = 0;
    }
    /*  Constructor  */
    public Node(int d, Node n) {
        data = d;
        link = n;
    }
    /*  Function to set link to next Node  */
    public void setLink(Node n) {
        link = n;
    }
    /*  Function to set data to current Node  */
    public void setData(int d) {
        data = d;
    }
    /*  Function to get link to next node  */
    public Node getLink() {
        return link;
    }
    /*  Function to get data from current Node  */
    public int getData() {
        return data;
    }
}

/**
 * Class for deque.
 *
 * @param      <Item>  The item
 */
class Steque {
    protected Node front, rear;
    public int size;
    /* Constructor */
    public Steque() {
        front = null;
        rear = null;
        size = 0;
    }
    /*  Function to check if queue is empty */
    public boolean isEmpty() {
        return (front == null);
    }
    /*  Function to get the size of the queue */
    public int size() {
        return size;
    }

    public void push(int data) {
        Node nptr = new Node(data, null);
        size++ ;
        if (front == null) {
            front = nptr;
            rear = front;
        } else {
            nptr.setLink(front);
            front = nptr;
        }
    }
    public void enqueue(int data) {
        Node nptr = new Node(data, null);
        size++ ;
        if (rear == null) {
            rear = nptr;
            front = rear;
        } else {
            rear.setLink(nptr);
            rear = nptr;
        }
    }
    public void pop() {
        if (!isEmpty()) {
            Node ptr = front;
            front = ptr.getLink();
            if (front == null) {
                rear = null;
            }
            size-- ;
            //return ptr.getData();
        } else {
            System.out.println("Steque is empty.");
        }

    }
    public void print() {
        if (front != null) {
            String s = "";
            Node ptr = front;
            while (ptr != rear.getLink() ) {
                s += ptr.getData() + ", ";
                ptr = ptr.getLink();
            }
            s = s.substring(0, s.length() - 2);
            System.out.println(s);
        }
    }
}