package com.av.java8.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    private int count;
    private synchronized void increment(){
        count++;
    }


    public static void main(String[] args) {
        CountDownLatchExample  latchExample = new CountDownLatchExample();
        int numberOfWorker = 3;
        CountDownLatch latch = new CountDownLatch(numberOfWorker);

        Runnable task = ()->{
            try {
                latchExample.increment();
                System.out.println(Thread.currentThread().getName() + " is working...count-->"+latchExample.count);
                Thread.sleep(2000); // Simulating work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                System.out.println(Thread.currentThread().getName() + " has finished working.");
                System.out.println("Before latch count-->"+latch.getCount());
                latch.countDown(); // Decrement the count of the latch
                System.out.println("After latch count-->"+latch.getCount());
            }
        };

        for (int i = 0; i < numberOfWorker; i++) {
            new Thread(task).start();
        }

        try {
            latch.await();// Main thread waits until the latch count reaches zero
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("All workers have finished their tasks. Proceeding with the main thread.");
        System.out.println("Final count is "+latchExample.count);
    }
}
/*
CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of
operations being performed in other threads completes. A CountDownLatch is initialized with a
given count. The await methods block until the current count reaches zero due to invocations of
the countDown method, after which all waiting threads are released and any subsequent invocations
of await return immediately.

Explanation:
CountDownLatch Initialization: The CountDownLatch is created with a count of numberOfWorkers, which is 3 in this case.
Worker Threads: Three worker threads are started. Each thread runs the Worker class, which performs some work (simulated by Thread.sleep(2000)) and then calls latch.countDown() to decrement the latch's count.
Main Thread:The main thread calls latch.await(), which blocks until the latch's count reaches zero.
Once all worker threads have finished their tasks and called countDown(), the latch's count reaches zero, and the main thread proceeds to print the final message.

CountDownLatch is useful in scenarios where you want to wait for a certain number of events or operations
to complete before proceeding

 */