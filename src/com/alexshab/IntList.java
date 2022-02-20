package com.alexshab;

public interface IntList {
    void add(int value);

    int get(int index);

    void set(int index, int value);

    int size();

    int[] toArray();

    void deleteElement(int index);

    void insertMid(int value);
}