package com.DP;

public class VolumeControlDecorator extends MusicPlayerDecorator {
    public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Adjusting the volume.");
    }
}
