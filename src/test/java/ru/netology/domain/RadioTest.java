package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    void shouldIncreaseVolume() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getVolume());
        assertEquals(0, Radio.getMinVolume());
        assertEquals(0, Radio.getMaxVolume());
        Radio.setRadioStation(0);
        Radio.setMaxVolume(10);
        Radio.setMinVolume(0);
        Radio.setVolume(0);
        Radio.increaseVolume();
        Radio.setVolume(1);
        Radio.increaseVolume();
        Radio.setVolume(-1);
        Radio.increaseVolume();
        Radio.setVolume(2);
        Radio.increaseVolume();
        Radio.setVolume(3);
        Radio.increaseVolume();
        Radio.setVolume(4);
        Radio.increaseVolume();
        Radio.setVolume(5);
        Radio.increaseVolume();
        Radio.setVolume(6);
        Radio.increaseVolume();
        Radio.setVolume(7);
        Radio.increaseVolume();
        Radio.setVolume(8);
        Radio.increaseVolume();
        Radio.setVolume(9);
        Radio.increaseVolume();
        Radio.setVolume(10);
        Radio.increaseVolume();
        Radio.setVolume(11);
        Radio.increaseVolume();
    }

    @Test
    void shouldDecreaseVolume() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getVolume());
        assertEquals(0, Radio.getMinVolume());
        assertEquals(0, Radio.getMaxVolume());
        Radio.setRadioStation(0);
        Radio.setMaxVolume(10);
        Radio.setMinVolume(0);
        Radio.setVolume(0);
        Radio.decreaseVolume();
        Radio.setVolume(-1);
        Radio.decreaseVolume();
        Radio.setVolume(0);
        Radio.decreaseVolume();
        Radio.setVolume(1);
        Radio.decreaseVolume();
        Radio.setVolume(2);
        Radio.decreaseVolume();
        Radio.setVolume(3);
        Radio.decreaseVolume();
        Radio.setVolume(4);
        Radio.decreaseVolume();
        Radio.setVolume(5);
        Radio.decreaseVolume();
        Radio.setVolume(6);
        Radio.decreaseVolume();
        Radio.setVolume(7);
        Radio.decreaseVolume();
        Radio.setVolume(8);
        Radio.decreaseVolume();
        Radio.setVolume(9);
        Radio.decreaseVolume();
        Radio.setVolume(10);
        Radio.decreaseVolume();
        Radio.setVolume(11);
        Radio.decreaseVolume();
    }

    @Test
    void shouldDoAnythingWithRadioStation() {
        Radio Radio = new Radio();
        assertEquals(10, Radio.getRadioStation());
        Radio.setMinRadioStation(0);
        Radio.setMaxRadioStation(10);
        Radio.setRadioStation(-1);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(0);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(1);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(2);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(3);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(4);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(5);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(6);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(7);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(8);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(9);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(10);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(11);
        Radio.switchNextRadioStation();
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
    void shouldDoAnythingWithVolume(){
        Radio Radio = new Radio();
        Radio.setRadioStation(0);
        Radio.setMaxVolume(100);
        Radio.setMinVolume(0);
        Radio.setVolume(0);
        Radio.increaseVolume();
        Radio.setVolume(1);
        Radio.increaseVolume();
        Radio.setVolume(-1);
        Radio.increaseVolume();
        Radio.setVolume(2);
        Radio.increaseVolume();
        Radio.setVolume(3);
        Radio.increaseVolume();
        Radio.setVolume(4);
        Radio.increaseVolume();
        Radio.setVolume(5);
        Radio.increaseVolume();
        Radio.setVolume(6);
        Radio.increaseVolume();
        Radio.setVolume(7);
        Radio.increaseVolume();
        Radio.setVolume(8);
        Radio.increaseVolume();
        Radio.setVolume(9);
        Radio.increaseVolume();
        Radio.setVolume(10);
        Radio.increaseVolume();
        Radio.setVolume(100);
        Radio.increaseVolume();
        Radio.setVolume(101);
        Radio.increaseVolume();
        Radio.setRadioStation(-1);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(0);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(1);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(2);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(3);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(4);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(5);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(6);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(7);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(8);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(9);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(10);
        Radio.switchNextRadioStation();
        Radio.setRadioStation(11);
        Radio.switchNextRadioStation();
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


}
