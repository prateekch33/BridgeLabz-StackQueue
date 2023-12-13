package org.example;

import java.util.LinkedList;

public class Queue {
    private final LinkedList<Integer> queue=new LinkedList<>();

    public void enqueue(Integer n) {
        queue.addFirst(n);
    }

    public Integer dequeue() {
        return queue.removeLast();
    }

    public int size() {
        return queue.size();
    }}
