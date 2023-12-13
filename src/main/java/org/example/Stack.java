package org.example;

import java.util.LinkedList;

public class Stack {
    private final LinkedList<Integer> stack=new LinkedList<>();

    public void push(Integer n) {
        stack.add(n);
    }

    public Integer peek() {
        return stack.removeLast();
    }

    public void pop(){
        stack.pop();
    }

    public int size() {
        return stack.size();
    }
}
