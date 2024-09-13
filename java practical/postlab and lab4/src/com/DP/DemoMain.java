package com.DP;

public class DemoMain {
    public static void main(String[] args) {

        MusicSource localFile = new LocalFileAdapter(new LocalFilePlayer());
        MusicSource onlineStreaming = new OnlineStreamingAdapter(new OnlineStreamingService());
        MusicSource radioStation = new RadioStationAdapter(new RadioStation());

        MusicPlayer basicPlayer = new BasicMusicPlayer(localFile);
        basicPlayer.play();

        System.out.println("\nPlaying from online streaming service:");
        basicPlayer = new BasicMusicPlayer(onlineStreaming);
        basicPlayer.play();

        System.out.println("\nPlaying from radio station:");
        basicPlayer = new BasicMusicPlayer(radioStation);
        basicPlayer.play();

        System.out.println("\nApplying equalizer and volume control:");
        MusicPlayer enhancedPlayer = new EqualizerDecorator(new VolumeControlDecorator(basicPlayer));
        enhancedPlayer.play();
    }
}
