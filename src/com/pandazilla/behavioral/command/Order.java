package com.pandazilla.behavioral.command;

public interface Order {
    void execute();
    void undo();
}
