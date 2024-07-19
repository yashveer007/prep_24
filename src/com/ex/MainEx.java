package com.ex;

class Print extends Thread{
    private int count;
    Print(int count){
        this.count = count;
    }

    public void run(){
        while(count <= 100){
            synchronized (this) {
                try {
                    System.out.println(count);
                    count += 2;
                    //Thread.sleep(1000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class MainEx {
    public static void main(String[] args) {
        Print oddNumber = new Print(1);
        Print evenNumber = new Print(2);
        oddNumber.start();
        evenNumber.start();
    }
}
