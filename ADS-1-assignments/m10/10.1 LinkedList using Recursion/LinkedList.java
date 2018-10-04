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
    public void insertAt(int data, int position) {
        head = insertHelper(head, position , data);
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
    public void print() {
        Node thead = head;
        while (thead != null) {
            System.out.println(thead.data);
            thead = thead.next;
        }
    }
}