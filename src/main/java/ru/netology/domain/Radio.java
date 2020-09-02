package ru.netology.domain;

public class Radio {
    private int radioStation;
    private int maxRadioStation;
    private int minRadioStation;
    private int volume;
    private int minVolume;
    private int maxVolume;

    public Radio(int radioStation, int maxRadioStation, int minRadioStation, int volume, int minVolume, int maxVolume) {
        this.radioStation = radioStation;
        this.maxRadioStation = maxRadioStation;
        this.minRadioStation = minRadioStation;
        this.volume = volume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation > maxRadioStation) {
            return;
        }
        if (radioStation < minRadioStation) {
            return;
        }
        this.radioStation = radioStation;
    }


    public void switchNextRadioStation() {
        if (radioStation < maxRadioStation)
            radioStation++;
        if (radioStation == maxRadioStation) {
            radioStation = getMinRadioStation();

        }
    }

    public void switchPrefRadioStation() {
        if (radioStation > minRadioStation)
            radioStation--;
        if (radioStation == minRadioStation) {
            radioStation = getMaxRadioStation();
        }
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume)
            return;
        if (volume < minVolume)
            return;
        this.volume = volume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void increaseVolume() {
        if (volume < maxVolume) {
            volume++;
        }

    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume--;
        }
    }

}