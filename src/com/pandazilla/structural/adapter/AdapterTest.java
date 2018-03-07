package com.pandazilla.structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Mp3AudioPlayer mp3AudioPlayer = new Mp3AudioPlayer();
        Mp4AudioPlayer mp4AudioPlayer = new Mp4AudioPlayer();

        MediaAdapter mediaAdapter = new MediaAdapter(mp4AudioPlayer);

        mp3AudioPlayer.play();
        mp4AudioPlayer.playMp4();
        test(mediaAdapter);
    }

    static void test(Mp3MediaPlayer mp3MediaPlayer){
        mp3MediaPlayer.play();
    }
}
