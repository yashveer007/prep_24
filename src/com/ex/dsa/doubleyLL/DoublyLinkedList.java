package com.ex.dsa.doubleyLL;

/**
 * class Node which represent the single Node of a doubly Linked list which is having two pointer
 * first pointer : this holds the previous node address
 * second pointer : this holds the next node address
 * @param <T>
 */
class Node<T> {
    T data;
    Node prev;
    Node next;
    Node(T data){
        this.data = data;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};

        // Array to linked List
        Node head = convertArrayToDoublyLinkedList(arr);
        printDoublyLinkedList(head);

        //Deleting first Node
        head = deleteFromHead(head);
        printDoublyLinkedList(head);

        //Deleting tail Node
        head = deleteNodeFromTail(head);
        printDoublyLinkedList(head);
    }

    /**
     * Deleting Node from the tail of a doubly Linked List
     * @param head
     * @return
     */
    private static Node deleteNodeFromTail(Node head) {
         if(head == null || head.next == null){
             return null;
         }
         Node currentNode = head;
         while (currentNode.next != null){
             currentNode = currentNode.next;
         }
         Node temp = currentNode.prev;
         temp.next = null;
         currentNode.prev=null;
         return head;
    }

    /**
     * Deleting Node from the head of a doubly linked list
     * @param head
     * @return
     */
    private static Node deleteFromHead(Node head) {

        /**
         * checking if linked list is empty or having one element
         */
        if(head == null || head.next == null){
            return null;
        }

        Node currentNode = head;
        head = currentNode.next;
        head.prev = null;
        currentNode.next = null;
        return head;
    }

    /**
     * printing doubly linked list
     * @param head
     */
    private static void printDoublyLinkedList(Node head) {
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    /**
     * convert array to a doubly Linked List
     * @param arr
     * @return
     */
    private static Node convertArrayToDoublyLinkedList(int[] arr) {
        Node head = new Node(arr[0]);

        Node currentNode = head;
        for (int i =1; i < arr.length; i++){
            Node newNode = new Node(arr[i]);
            currentNode.next = newNode;
            newNode.prev = currentNode;
            currentNode = currentNode.next;
        }
        return head;
    }
}