package com.pandazilla.structural.bridge;

public class Contatcts implements WebPage {

    @Override
    public void showContent() {
        System.out.println("Our contacts");
    }

    @Override
    public void applyTheme(Theme theme) {
        theme.applyTheme();
    }
}
