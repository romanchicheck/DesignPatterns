package com.pandazilla.structural.adapter.bridge;

public class LightTheme implements Theme{
    @Override
    public void applyTheme() {
        System.out.println("Light theme applied");
    }
}
