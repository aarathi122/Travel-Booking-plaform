package com.DP;

public class OnlineStreamingAdapter implements MusicSource {
    private OnlineStreamingService streamingService;

    public OnlineStreamingAdapter(OnlineStreamingService streamingService) {
        this.streamingService = streamingService;
    }

    @Override
    public void playMusic() {
        streamingService.streamMusic();
    }
}

// Simulating online streaming service
class OnlineStreamingService {
    public void streamMusic() {
        System.out.println("Streaming music from an online service.");
    }
}
