package com.pandazilla.structural.adapter.bridge;

public class DarkTheme implements Theme{
    @Override
    public void applyTheme() {
        System.out.println("Dark theme applied");
    }
}
