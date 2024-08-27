package com.mycompany.ed1;

public class PilhaDinamica {

    public Node top;

    public PilhaDinamica() {
        this.top = null;
    }

    
    public void push(int value) {
        Node newNode = new Node(value);
        if (top != null) {
            top.next = newNode;
            newNode.prev = top;
        }
        top = newNode;
    }

    
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        int value = top.value;
        top = top.prev;
        if (top != null) {
            top.next = null;
        }
        return value;
    }

    
    public boolean isEmpty() {
        return top == null;
    }

    
    public int peek() throws Exception{
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return top.value;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            sb.insert(0, current.value + " ");
            current = current.prev;
        }
        return sb.toString().trim();
    }
}
