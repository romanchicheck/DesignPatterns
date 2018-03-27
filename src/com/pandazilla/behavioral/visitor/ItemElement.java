package com.pandazilla.behavioral.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
