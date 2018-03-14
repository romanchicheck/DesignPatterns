package com.pandazilla.structural.facade;

public class HeadDrawer {

    private Head head;

    public HeadDrawer(Head head) {
        this.head = head;
    }

    public void drawHead(){
        head.drawEars();
        head.drawEyes();
        head.drawFace();
        head.drawHair();
        head.drawMouth();
        head.drawNose();
    }
}
