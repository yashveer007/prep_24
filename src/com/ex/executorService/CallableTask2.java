package com.ex.executorService;

import java.util.concurrent.Callable;

public class CallableTask2 implements Callable<String> {

    private String msg;

    public CallableTask2(String msg){
        this.msg = msg;
    }
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return msg;
    }
}
