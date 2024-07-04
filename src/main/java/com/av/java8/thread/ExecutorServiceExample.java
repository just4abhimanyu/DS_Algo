package com.av.java8.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    private int count = 0;
    private void counter(){
        count++;
    }
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorServiceExample serviceExample = new ExecutorServiceExample();
        for (int i = 0; i <20; i++) {
            Runnable task = ()->{
              try {
                  serviceExample.counter();;

                  System.out.println("Executing task in "+Thread.currentThread().getName()+" counter ->"+serviceExample.count);
                  TimeUnit.SECONDS.sleep(2);
              }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                  System.out.println("Task interrupted");
              }
            };
            executorService.submit(task);
        }
        executorService.shutdown();// if U don't use then thread will be running for-ever
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
        System.out.println("Final count :"+serviceExample.count);
    }
}
