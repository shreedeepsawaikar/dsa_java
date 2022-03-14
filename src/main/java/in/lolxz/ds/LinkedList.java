package in.lolxz.ds;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    /**
     * to insert a data into a LinkedList
     * @param list
     * @param data
     * @return
     */

    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node lastNode = list.head;

            while (lastNode != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
