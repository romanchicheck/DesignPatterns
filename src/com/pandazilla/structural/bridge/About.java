package com.pandazilla.structural.bridge;

public class About implements WebPage{

    @Override
    public void showContent() {
        System.out.println("About us");
    }

    @Override
    public void applyTheme(Theme theme) {
        theme.applyTheme();
    }
}
