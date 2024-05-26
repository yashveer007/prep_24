package com.ex.dsa;

class LinkedList {
    private Node head;
    private int size;
    private class Node {
        String str;
        Node next;

        Node(String str) {
            this.str = str;
            this.next = null;
        }
    }

    /**
     * Add Node in the starting of the LinkedList
     *
     * @param str
     */
    public void addFirst(String str) {
        Node node = new Node(str);
        size++;
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    /**
     * Add Node at the end of the LInkedList
     *
     * @param str
     */
    public void addLast(String str) {
        Node node = new Node(str);
        size++;
        if (head == null) {
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    /**
     * method for printing LinkedList
     */
    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty!!");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.str + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    /**
     * printing Size of the LinkedList
     *
     * @return size of linked list
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Removing first element from the LinkedList
     * @return removed String
     */
    public String removeFirst() {
        if (head == null) {
            return "LinkedList is Empty!!";
        }
        size--;
        Node currentNode = head;
        head = head.next;
        return currentNode.str;
    }

    /**
     * removing element from the last of the LinkedList
     *
     * @return
     */
    public String removeLast() {
        if (head == null) {
            return "LinkedList is Empty!!";
        }
        size--;
        if (head.next == null) {
            Node currNode = head;
            head = null;
            return currNode.str;
        }

        Node currentNode = head;
        Node secondLastNode = head;

        while (currentNode.next != null) {
            secondLastNode = currentNode;
            currentNode = currentNode.next;
        }
        secondLastNode.next = null;
        return currentNode.str;
    }

    /**
     * Rotate By k places to the Right
     * @param k
     */
    public void rotateByKPlace(int k){

        if(head == null){
            System.out.println("LinkedList is Empty!!");
            return;
        }
        Node currentNode = head;
        Node tempNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
            while(k>1){
                tempNode = tempNode.next;
                k--;
            }
        }
        currentNode.next = head;
        head = tempNode.next;
        tempNode.next = null;
    }

    public void add(String str){
        addLast(str);
    }
}

public class LinkedListImpl {
    public static void main(String[] args) {
        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        LinkedList list = new LinkedList();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        list.add("60");
        list.print();
        System.out.println();
        list.rotateByKPlace(4);
        list.print();
    }
}
