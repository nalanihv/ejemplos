package com.example.ejemplos;

public class StackNode {
    private  int data;
    private StackNode next;

    public StackNode(int data, StackNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public StackNode getNext() {
        return next;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
