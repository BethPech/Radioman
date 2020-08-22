package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSwitchNex() {
        Radio Radio = new Radio();
        assertEquals(0,Radio.getRadioStation());
        Radio.setRadioStation(0);
        Radio.setMinRadioStation(0);
        Radio.setMaxRadioStation(9);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(-1);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(0);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(1);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(2);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(3);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(4);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(5);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(6);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(7);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(8);
        Radio.switchNextRadioStation();
        Radio.setMaxRadioStation(10);
        Radio.switchNextRadioStation();
    }
    @Test
    void shouldSwitchPrev(){
        Radio Radio = new Radio();
        assertEquals(0,Radio.getRadioStation());
        Radio.setRadioStation(0);
        Radio.setMinRadioStation(0);
        Radio.setMaxRadioStation(9);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(-1);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(0);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(1);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(2);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(3);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(4);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(5);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(6);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(7);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(8);
        Radio.switchPrefRadioStation();
        Radio.setMaxRadioStation(10);
        Radio.switchPrefRadioStation();
    }
    @Test
    void shouldIncreaseVolume(){
        Radio Radio = new Radio();
        assertEquals(0, Radio.getVolume());
        assertEquals(0, Radio.getMinVolume());
        assertEquals(0, Radio.getMaxVolume());
        Radio.setRadioStation(0);
        Radio.setMaxVolume(10);
        Radio.setMinVolume(0);
        Radio.setVolume(0);
        Radio.increaseVolume();
    }
    @Test
    void shouldDecreaseVolume(){
        Radio Radio = new Radio();
        assertEquals(0, Radio.getVolume());
        assertEquals(0, Radio.getMinVolume());
        assertEquals(0, Radio.getMaxVolume());
        Radio.setRadioStation(0);
        Radio.setMaxVolume(10);
        Radio.setMinVolume(0);
        Radio.setVolume(0);
        Radio.decreaseVolume();
    }
}
