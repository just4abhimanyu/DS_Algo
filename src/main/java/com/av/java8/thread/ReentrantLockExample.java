package com.av.java8.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private  int counter = 0;
    Lock lock = new ReentrantLock();
    private void increment(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" thread incremented by "+counter);
            counter++;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample lockExample = new ReentrantLockExample();
        Runnable task = ()->{
            for (int i = 0; i <10; i++) {
                lockExample.increment();
            }
        };
        Thread t1 = new Thread(task,"t1");
        Thread t2 = new Thread(task,"t2");
        t1.start();
        t2.start();

        try {
            t1.join();// we are setting to complete execution of thread t1
            t2.join();// we are setting to complete execution of thread t2

        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Final incremented counter : "+lockExample.counter);
    }

}
