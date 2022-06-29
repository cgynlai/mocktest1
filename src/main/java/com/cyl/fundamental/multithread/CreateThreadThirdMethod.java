package com.cyl.fundamental.multithread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//This method is able to return value and throw exception
public class CreateThreadThirdMethod implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CreateThreadThirdMethod threadThirdMethod = new CreateThreadThirdMethod();
        //FutureTask is subclass of Runnable
        FutureTask<Integer> ft = new FutureTask<>(threadThirdMethod);
        Thread thread = new Thread(ft);
        thread.start();
        var integer = ft.get();
        System.out.println(integer);

    }
}
