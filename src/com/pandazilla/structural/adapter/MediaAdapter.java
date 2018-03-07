package com.pandazilla.structural.adapter;

public class MediaAdapter implements Mp3MediaPlayer{
    Mp4MediaPlayer mp4MediaPlayer;

    public MediaAdapter(Mp4MediaPlayer mp4MediaPlayer) {
        this.mp4MediaPlayer = mp4MediaPlayer;
    }

    @Override
    public void play() {
        mp4MediaPlayer.playMp4();
    }
}
