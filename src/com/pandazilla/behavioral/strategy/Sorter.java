package com.pandazilla.behavioral.strategy;

public class Sorter {

    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] data){
        return this.sortStrategy.sort(data);
    }
}
