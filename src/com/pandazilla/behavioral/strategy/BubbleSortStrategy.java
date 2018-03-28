package com.pandazilla.behavioral.strategy;

public class BubbleSortStrategy implements SortStrategy {

    @Override
    public int[] sort(int[] data) {
        System.out.println("Sorting using bubble sort");
        return data;
    }
}
