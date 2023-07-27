package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> n = new LinkedList<>();
        for (int i = 0;i < sourceList.size();i++) {
            if (i % 2 == 0) {
                n.addLast(sourceList.get(i));
            }
            else {
                n.addFirst(sourceList.get(i));
            }
        }
        return n;
    }
    public static void main(String[] args) {
        LinkedListCreator l = new LinkedListCreator();
        LinkedList<Integer> m = new LinkedList<>();
        m.add(2);
        m.add(14);
        m.add(3);
        m.add(6);
        m.add(5);
        m.add(7);

        System.out.println(l.createLinkedList(m));
    }
}
