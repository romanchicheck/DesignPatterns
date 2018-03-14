package com.pandazilla.structural.facade;

public class FacadeTest {

    public static void main(String[] args) {
        HeadDrawer headDrawer = new HeadDrawer(new Head());
        headDrawer.drawHead();
    }
}
