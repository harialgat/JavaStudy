package com.ds.lineards.stacks;

public class Stack {
    private final String[] stack;
    private int top;
    private final int stackSize;

    public Stack(int stackSize) {
        this.stackSize = stackSize;
        this.top = -1;
        stack = new String[this.stackSize];
    }
    public String pop() throws StackEmptyException{
        if(this.top==-1){
            throw new StackEmptyException("Stack is Empty");
        }else{
          return stack[top--];
        }
    }

    public String peak() throws StackEmptyException{
        if(this.top ==-1){
            throw new StackEmptyException("Stack is Empty");
        }else{
            return stack[top];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        try {
            //stack.pop();
            stack.push("Harish");
            stack.push("Algat");
            stack.push("Shweta");
            System.out.println(stack.pop());
            System.out.println(stack.peak());
        } catch (StackLimitExceeded |StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    public void push(String data) throws StackLimitExceeded {
        if (top == stackSize - 1) {
            throw new StackLimitExceeded("Stack Size has been exceeded");
        } else {
            stack[++top] = data;
        }
    }
}


class StackLimitExceeded extends Exception {
    public StackLimitExceeded(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception{
    public StackEmptyException(String message){
        super("Stack is empty");
    }
}