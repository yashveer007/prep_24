package com.ex.dsa;

import java.util.ArrayList;

class Stack<T> {
    private Node head;
    private Node peak;
    private int size;

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public T push(T item) {
        Node node = new Node(item);
        size++;
        if (head == null) {
            head = node;
            return head.data;
        }
        node.next = head;
        head = node;
        return head.data;
    }

    public T pop() {
        if (isEmpty()) {
            return (T) "Stack in empty, No element to POP!!";
        }
        size--;
        Node node = head;
        head = head.next;
        return node.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return (T) "Stack in empty, No element to POP!!";
        }
        Node top = head;
        return top.data;
    }

    public int getSize() {
        return size;
    }
}

public class StackImplUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        stack.push("45");
        stack.push("56");
        stack.push("87");
        stack.push("ejejh");
        stack.push(56);
        stack.push(new ArrayList<>());
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
