package com.ex.dsa;

class LL<T>{
    Node head;
    class Node {
        T data;
        Node next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(T data){
        Node node = new Node(data);
         if(head == null){
             head = node;
             return;
         }

         Node currentNode = head;
         while (currentNode.next != null){
             currentNode = currentNode.next;
         }
         currentNode.next = node;
    }

    public T removeLast(){
        if(head == null){
            return (T) "LinkedList is EMPTY!!";
        }

        if(head .next == null){
            Node currentNode = head;
            head = null;
            return currentNode.data;
        }

        Node currentNode = head;
        Node prevNode = head;
        while (currentNode.next != null){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = null;
        return currentNode.data;
    }

    public void print(){
        if(head == null){
            System.out.println("EMPTY LinkedList");
        }

        Node currentNode = head;
        while(currentNode != null){
            System.out.print( currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }

    public void reverseLinkedListIterative(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = null;
        Node currentNode = head;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
    }

    public Node reverseLinkedListRecursion(Node currentNode){
        if(currentNode == null || currentNode.next == null){
            return currentNode;
        }
        Node newHead = reverseLinkedListRecursion(currentNode.next);
        Node prevNode = currentNode.next;
        prevNode.next = currentNode;
        currentNode.next = null;
        return newHead;
    }

}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LL<Integer> linkedList = new LL<>();
        linkedList.addLast(12);
        linkedList.addLast(34);
        linkedList.addLast(56);
        linkedList.addLast(23);
        linkedList.print();
        System.out.println();
        linkedList.reverseLinkedListIterative();
        linkedList.print();
        System.out.println();
        linkedList.head = linkedList.reverseLinkedListRecursion(linkedList.head);
        linkedList.print();

    }
}
