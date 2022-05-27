package com.sahland;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.addFirst(12);
        list.addFirst(32);
        list.addFirst(14);
        list.printListForward();
        list.printListBackward();

        System.out.println("------------------------------------------------------------");

        list.addLast(-31);
        list.addLast(43);
        list.addLast(0);
        list.printListForward();
        list.printListBackward();

        System.out.println("------------------------------------------------------------");

        list.poopFirst();
        list.printListForward();
        list.printListBackward();

        System.out.println("------------------------------------------------------------");

        list.poopLast();
        list.printListForward();
        list.printListBackward();

    }
}