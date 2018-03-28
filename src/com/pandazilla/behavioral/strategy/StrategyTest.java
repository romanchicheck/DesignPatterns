package com.pandazilla.behavioral.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        int[] data = {1, 45, 16, 7, 2};
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(data);

        sorter = new Sorter(new QuickSort());
        sorter.sort(data);
    }
}
