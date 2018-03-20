package com.pandazilla.behavioral.command;

public class Broker {

    public void takeOrder(Order order){
        order.execute();
    }

    public void undoOrder(Order order){
        order.undo();
    }
}
