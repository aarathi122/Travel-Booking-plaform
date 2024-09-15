package com.DP;

public class EqualizerDecorator extends MusicPlayerDecorator {
    public EqualizerDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("Adding equalizer settings to the music.");
    }
}
