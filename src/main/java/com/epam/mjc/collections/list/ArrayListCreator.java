package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> finalArray = new ArrayList<String>();

        for (int i = 0;i < sourceList.toArray().length;i++) {
            if ((i+1) % 3 == 0) {
                finalArray.add(sourceList.get(i));
                finalArray.add(sourceList.get(i));
            }
        }
        return finalArray;
    }
}
