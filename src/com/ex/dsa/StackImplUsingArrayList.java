package com.ex.dsa;

import java.util.ArrayList;

class Stackk<T>{
     private ArrayList<T> arrayList = new ArrayList<>();
     private int index;

    /**
     * checking stack is empty or not
     * @return
     */
    public boolean isEmpty(){
        return arrayList.size() == 0 ? true : false;
    }

    /**
     * Pushing element to stack
     * @param data
     * @return
     */
    public T push(T data){
        arrayList.add(data);
        return arrayList.get(index++);
    }

    /**
     * poping element from the Stack
     * @return
     */
    public T pop(){
        if(isEmpty()){
            return (T) "Stack is empty!!";
        }
        return arrayList.remove(--index);
    }

    /**
     * returning size of the stack
     * @return
     */
    public int getSize(){
        return arrayList.size();
    }

    /**
     * returning top element from the stack
     * @return
     */
    public T peek(){
        if (isEmpty()){
            return (T) "Stack is empty!!";
        }
        return arrayList.get(index-1);
    }


}

public class StackImplUsingArrayList {
    public static void main(String[] args) {
        Stackk stack = new Stackk();
        stack.push(12);
        stack.push(34);
        stack.push(45);
        stack.push("hello");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
