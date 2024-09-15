package com.DP;

public class BasicMusicPlayer extends MusicPlayer {
    public BasicMusicPlayer(MusicSource musicSource) {
        super(musicSource);
    }

    @Override
    public void play() {
        System.out.println("Starting basic music player...");
        musicSource.playMusic();
    }
}
