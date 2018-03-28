package com.pandazilla.behavioral.strategy;

public class QuickSort implements SortStrategy{

    @Override
    public int[] sort(int[] data) {
        System.out.println("Sorting using quick sort");
        return data;
    }
}
