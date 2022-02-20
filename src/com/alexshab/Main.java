package com.alexshab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        IntList list = new IntArrayList();
        list.add(4);
        list.add(25);
        list.add(28);
        list.add(56);
        list.add(72);
        list.add(52);
        list.add(12);

        list.deleteElement(39);
        list.insertMid(100);

        System.out.println("Original list: " + list);

        int[] sortedArray = list.toArray();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int tmp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted list :" + Arrays.toString(sortedArray));
    }
}