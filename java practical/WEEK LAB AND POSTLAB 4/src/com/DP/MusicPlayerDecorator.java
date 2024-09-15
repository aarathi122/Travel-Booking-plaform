package com.DP;

public abstract class MusicPlayerDecorator extends MusicPlayer {
    protected MusicPlayer decoratedPlayer;

    public MusicPlayerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer.musicSource);
        this.decoratedPlayer = decoratedPlayer;
    }

    public abstract void play();
}
