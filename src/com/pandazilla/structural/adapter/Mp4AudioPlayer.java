package com.pandazilla.structural.adapter;

public class Mp4AudioPlayer implements Mp4MediaPlayer {

    @Override
    public void playMp4() {
        System.out.println("Play mp4 file");
    }
}
