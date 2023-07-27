package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator = new ListComparator();
        sourceList.sort(comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);

        // Calculate the function values 5x^2+3 for elements a and b
        int funcValueA = 5 * numA * numA + 3;
        int funcValueB = 5 * numB * numB + 3;

        if (funcValueA == funcValueB) {
            // If the function values are the same, sort the elements in ascending order
            return Integer.compare(numA, numB);
        } else {
            // Sort based on the function values in ascending order
            return Integer.compare(funcValueA, funcValueB);
        }
    }

}
