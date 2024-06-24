package com.ex.dsa;

class Node<T> {
    T data;
    Node next;

    Node(T data) {
        this.data = data;
    }
}

public class ConvertArrayToLinkedList {
    public static void main(String[] args) {
        int arr[] = {12,5,56,97};
        int size =0;
        Node head = getLinkedListFromArray(arr);
        printLinkedList(head);
        System.out.println(size);
    }

    private static void printLinkedList(Node head) {
        Node current;
        current = head;
        while(current !=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    private static Node getLinkedListFromArray(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        int i=1;
        while( i< arr.length){
            Node newNode = new Node(arr[i++]);
            current.next = newNode;
            current = newNode;
        }
        return head;
    }
}
