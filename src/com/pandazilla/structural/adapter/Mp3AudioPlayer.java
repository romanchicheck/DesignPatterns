package com.pandazilla.structural.adapter;

public class Mp3AudioPlayer implements Mp3MediaPlayer {
    @Override
    public void play() {
        System.out.println("Play mp3 file");
    }
}
