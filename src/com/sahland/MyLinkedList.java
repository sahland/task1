package com.sahland;

public class MyLinkedList<E> {

    protected class Node<T> {
        public T data;
        public Node next;
        public Node previous;

        public Node(T data) {
            this.data = data;
        }

        public void printNode() {
            System.out.print(data + " ");
        }
    }

    private Node first;
    private Node last;

    public MyLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {  // true, если список пуст
        return first == null;
    }

    public void addFirst(E element) {
        Node temp = new Node(element);
        if (isEmpty())
            last = temp;
        else
            first.previous = temp;

        temp.next = first;
        first = temp;

    }

    public void addLast(E element) {
        Node temp = new Node(element);

        if (isEmpty())
            first = temp;
        else {
            last.next = temp;
            temp.previous = last;
        }
        last = temp;
    }

    public Node poopFirst() {
        Node temp = first;
        if (first.next == null)
            last = null;
        else
            first.next.previous = null;
        first = first.next;
        return temp;
    }

    public Node poopLast() {
        Node temp = last;
        if (first.next == null)
            first = null;
        else
            last.previous.next = null;
        last = last.previous;
        return temp;
    }

    public Node peekFirst(){
        return first;
    }

    public Node peekLast(){
        return last;
    }

    public void printListForward() {
        System.out.print("List (first-->last): ");
        Node current = first;
        while (current != null) {
            current.printNode();
            current = current.next;
        }
        System.out.println();
    }

    public void printListBackward() {
        System.out.print("List (last-->first): ");
        Node current = last;
        while (current != null) {
            current.printNode();
            current = current.previous;
        }
        System.out.println();
    }

}
