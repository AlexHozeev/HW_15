package com.alexshab;

import java.util.Arrays;

public class IntArrayList implements IntList {

    private int[] array = new int[40];

    @Override
    public void add(int value) {
        int[] modArray = new int[array.length + 1];
        System.arraycopy(array, 0, modArray, 0, modArray.length - 1);
        modArray[modArray.length - 1] = value;
        array = modArray;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, int value) {
        array[index] = value;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public int[] toArray() {
        int[] modArray = new int[array.length];
        System.arraycopy(array, 0, modArray, 0, modArray.length);
        return modArray;
    }

    @Override
    public void deleteElement(int index) {
        int[] modArray = new int[array.length - 1];
        System.arraycopy(array, 0, modArray, 0, index);
        System.arraycopy(array, index + 1, modArray, index, array.length - index - 1);
        array = modArray;
    }

    @Override
    public void insertMid(int value) {
        int[] modArray = new int[array.length + 1];
        int middleIndex = array[0] + (((array.length - 1) - array[0]) / 2);
        System.arraycopy(array, 0, modArray, 0, middleIndex);
        modArray[middleIndex] = value;
        System.arraycopy(array, middleIndex, modArray, middleIndex + 1, array.length - middleIndex);
        array = modArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);

    }
}
