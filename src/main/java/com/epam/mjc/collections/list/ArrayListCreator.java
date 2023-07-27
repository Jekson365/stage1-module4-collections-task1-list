package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> finalArray = new ArrayList<String>();

        for (int i = 1;i < sourceList.toArray().length;i++) {
            if (i % 3 == 0) {
                finalArray.add(sourceList.get(i));
                finalArray.add(sourceList.get(i));
            }
        }
        System.out.println(finalArray);

        return finalArray;
    }
}
