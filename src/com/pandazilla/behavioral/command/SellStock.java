package com.pandazilla.behavioral.command;

public class SellStock implements Order{

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sellStock();
    }

    @Override
    public void undo() {
        stock.buyStock();
    }
}

