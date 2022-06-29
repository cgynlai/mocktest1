package com.cyl.fundamental.multithread;

public class TestJoinMethod {

    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = ()->{for (int i=1;i<=10;i++){
            System.out.println("thread............. " +i);
        }};

        for (int i=1; i<=100; i++){
            System.out.println("main........ " + i);
            if(i==3){
                Thread thread = new Thread(runnable);
                thread.start();
                thread.join();
            }
        }

    }
}
