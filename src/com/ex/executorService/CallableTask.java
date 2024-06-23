package com.ex.executorService;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    private String msg;

    public CallableTask(String msg) {
        this.msg = msg;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Hello " + this.msg;
    }
}
