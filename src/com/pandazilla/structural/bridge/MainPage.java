package com.pandazilla.structural.bridge;

public class MainPage implements WebPage{

    @Override
    public void showContent() {
        System.out.println("Main content");
    }

    @Override
    public void applyTheme(Theme theme) {
        theme.applyTheme();
    }
}
