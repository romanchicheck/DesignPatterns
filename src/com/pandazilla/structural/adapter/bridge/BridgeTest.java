package com.pandazilla.structural.adapter.bridge;

public class BridgeTest {

    public static void main(String[] args) {
        WebPage webPage = new MainPage();
        webPage.showContent();
        webPage.applyTheme(new LightTheme());
        webPage.applyTheme(new DarkTheme());

        webPage = new Contatcts();
        webPage.showContent();
        webPage.applyTheme(new LightTheme());
        webPage.applyTheme(new DarkTheme());

        webPage = new About();
        webPage.showContent();
        webPage.applyTheme(new LightTheme());
        webPage.applyTheme(new DarkTheme());
    }
}
