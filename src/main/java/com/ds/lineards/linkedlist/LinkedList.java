package com.ds.lineards.linkedlist;

public class LinkedList {
    private Node head;
    private Node nextNode;

    public static void main(String[] str) {
        LinkedList l = new LinkedList();
        l.addNode(new Node("Harish"));
        l.addNode(new Node("Algat"));
        l.addNode(new Node("Shweta"));
        l.printData();
    }

    public void addNode(Node node) {
        if (this.head == null) {
            head = node;
            nextNode = node;
        } else {
            nextNode.setNextNode(node);
            nextNode =  node;
        }
    }
    public void printData(){
        Node tempNode =  this.head;
        while (tempNode!=null){
            System.out.println(tempNode.getData());
            tempNode =  tempNode.getNextNode();
        }
    }
}
