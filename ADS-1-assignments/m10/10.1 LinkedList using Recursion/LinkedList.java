public class LinkedList {
    private class Node {
        private int data;
        private Node next;
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head;
    public void insertAt(int position, int data) {
        try {
            head = insertHelper(head, position , data);
        } catch (Exception e) {
            System.out.println("Can't insert at this position.");
        }
    }
    Node insertHelper(Node head, int cnt, int ele) {
        if (cnt == 0) return new Node(ele, head);
        head.next = insertHelper(head.next, cnt - 1, ele);
        return head;
    }
    public void reverse() {
        head = reverseHelper(head);
    }
    Node reverseHelper(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nhead = reverseHelper(head.next);
        head.next.next = head;
        head.next = null;
        return nhead;
    }
    public String print() {
        Node thead = head;
        String s  = "";
        while (thead != null) {
            s += thead.data + ", ";
            thead = thead.next;
        }

        return s.substring(0 , s.length() - 2);
    }
}