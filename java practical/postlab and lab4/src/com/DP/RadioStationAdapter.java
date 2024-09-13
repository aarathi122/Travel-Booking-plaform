package com.DP;

public class RadioStationAdapter implements MusicSource {
    private RadioStation radioStation;

    public RadioStationAdapter(RadioStation radioStation) {
        this.radioStation = radioStation;
    }

    @Override
    public void playMusic() {
        radioStation.playRadio();
    }
}

// Simulating radio station
class RadioStation {
    public void playRadio() {
        System.out.println("Playing music from a radio station.");
    }
}
