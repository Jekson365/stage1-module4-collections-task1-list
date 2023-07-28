package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {

        LinkedList<Integer> n = new LinkedList<>();

        for (Integer num : sourceList) {
            if (num % 2 == 0) {
                n.addLast(num);
            }
            else {
                n.addFirst(num);
            }
        }
        return n;
    }
}
