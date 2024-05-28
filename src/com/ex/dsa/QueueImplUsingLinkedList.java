package com.ex.dsa;

class Queue<T> {

    private Node head;
    private Node tail;

    private class Node {
        private T data;
        private Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * adding element to the Queue
     *
     * @param data
     */
    public void push(T data) {
        Node node = new Node(data);
        if (tail == null) {
            tail = node;
            head = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    /**
     * removing element from the Queue
     *
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            return (T) "Queue is empty!!";
        }

        if (head == tail) {
            tail = null;
        }
        Node currentNode = head;
        head = head.next;
        return currentNode.data;
    }

    /**
     * checking queue is empty or not
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    /**
     * fetching element at the head of the Queue
     *
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            return (T) "Queue is empty!!";
        }
        return head.data;
    }
}

public class QueueImplUsingLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.push(4);
        queue.pop();
        queue.push(5);
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.pop();
        }
    }
}
