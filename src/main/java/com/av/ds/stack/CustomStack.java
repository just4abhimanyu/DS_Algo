package com.av.ds.stack;

public class CustomStack {

    int[] array;
    int top;
    int capacity;

    CustomStack(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }
    private void push(int data){
        if(top == capacity-1){
            System.out.println("Stack over flow !");
            return;
        }
        array[++top] = data;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow !");
        }
        return array[top--];
    }

    private  int peek(){
        return array[top];
    }

    private boolean isEmpty(){
        return top == -1;
    }
    private boolean isFull(){
        return top == capacity-1;
    }
    private int size(){
        return top+1;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println();
    System.out.println("Pop :"+stack.pop());
        System.out.println("Peek :"+stack.peek());
        System.out.println("Pop :"+stack.pop());
        System.out.println("Peek :"+stack.peek());


    }
}
