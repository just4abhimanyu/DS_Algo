package com.av.java8.thread;
public class OddEvenPrinter {

    private static int number = 1;
    private static final int MAX_COUNT = 10;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread oddThread = new Thread(OddEvenPrinter::printOdd);
        Thread evenThread = new Thread(OddEvenPrinter::printEven);

        oddThread.start();
        evenThread.start();
    }

    public static void printOdd() {
        
        synchronized (lock) {
            while (number <= MAX_COUNT) {
                if (number % 2 != 0) {
                    System.out.println("Odd Thread: " + number);
                    number++;
                    lock.notify(); // Notify waiting thread (evenThread)
                } else {
                    try {
                        lock.wait(); // Release the lock and wait
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void printEven() {
        synchronized (lock) {
            while (number <= MAX_COUNT) {
                if (number % 2 == 0) {
                    System.out.println("Even Thread: " + number);
                    number++;
                    lock.notify(); // Notify waiting thread (oddThread)
                } else {
                    try {
                        lock.wait(); // Release the lock and wait
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

