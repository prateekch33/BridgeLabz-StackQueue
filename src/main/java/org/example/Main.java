package org.example;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        while(stack.size()>0) {
            System.out.println(stack.peek());
        }

        Queue queue=new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        while(queue.size()>0) {
            System.out.println(queue.dequeue());
        }
    }
}