package com.pandazilla.behavioral.command;

public class BuyStock implements Order{

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buyStock();
    }

    @Override
    public void undo() {
        stock.sellStock();
    }
}
