package dataStructure;

public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int valueInput) {
            value = valueInput;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);

        Node second = new Node(2);
        Node third = new Node(3);

        // linked
        linkedList.head.next = second;
        second.next = third;

        Node first = linkedList.head;
        Node currentNode = first;
        System.out.println(currentNode.value);


        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.value);
        }
    }
}
