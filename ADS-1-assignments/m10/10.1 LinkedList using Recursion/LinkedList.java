/**
 * List of linkeds.
 */
public class LinkedList {
    /**
    * head;
    */
    private Node head;
    /**
     * Class for node.
     */
    private class Node {
        /**
         * data.
         */
        private int data;
        /**
         * next.
         */
        private Node next;
        /**
         * Constructs the object.
         *
         * @param      data  The data
         * @param      next  The next
         */
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    /**
     * insertAt.
     *
     * @param      position  The position
     * @param      data      The data
     *
     * @return     { description_of_the_return_value }
     */
    public boolean insertAt(int position, int data) {
        boolean flag = false;
        try {
            head = insertHelper(head, position , data);
        } catch (Exception e) {
            System.out.println("Can't insert at this position.");
            flag = true;
        }
        return flag;
    }
    /**
     * insertHelper.
     *
     * @param      head  The head
     * @param      cnt   The count
     * @param      ele   The ele
     *
     * @return     { description_of_the_return_value }
     */
    public Node insertHelper(Node head, int cnt, int ele) {
        if (cnt == 0) return new Node(ele, head);
        head.next = insertHelper(head.next, cnt - 1, ele);
        return head;
    }
    /**
     * reverse.
     */
    public void reverse() {
        head = reverseHelper(head);
    }
    /**
     * reverseHelper.
     *
     * @param      head  The head
     *
     * @return     { description_of_the_return_value }
     */
    Node reverseHelper(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nhead = reverseHelper(head.next);
        head.next.next = head;
        head.next = null;
        return nhead;
    }
    /**
     * print.
     *
     * @return     { description_of_the_return_value }
     */
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