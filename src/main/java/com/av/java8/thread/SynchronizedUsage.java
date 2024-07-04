package com.av.java8.thread;

public class SynchronizedUsage {

    private int counter = 0;

    private synchronized void incrementCounter(){
        System.out.println("counter:"+counter);
        counter++;
    }

    public static void main(String[] args) {
        SynchronizedUsage synchronizedUsage = new SynchronizedUsage();
        Runnable task = ()->{
            for (int i = 0; i < 10; i++) {
                synchronizedUsage.incrementCounter();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();

        try {
            t1.join(1000000);
            t2.join(2000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Final counter value: " + synchronizedUsage.counter);
    }

}
/*
 * if we commit join() in that case final counter value cant expect bcz main thread execution
 * can happen any time
 */
