package com.pandazilla.behavioral.command;

public class CommandTest {

    public static void main(String[] args) {
        Stock stock = new Stock("Google", 15);

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.undoOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.undoOrder(sellStock);
    }
}
