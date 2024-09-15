package com.DP;

public class LocalFileAdapter implements MusicSource {
    private LocalFilePlayer localFilePlayer;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

    @Override
    public void playMusic() {
        localFilePlayer.playLocalFile();
    }
}

class LocalFilePlayer {
    public void playLocalFile() {
        System.out.println("Playing music from local file.");
    }
}
