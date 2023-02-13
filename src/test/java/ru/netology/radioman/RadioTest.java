package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextMax() {

        Radio radio = new Radio(15);
        radio.setNumberStation(14);

        radio.next();

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMax() {

        Radio radio = new Radio(15);
        radio.setNumberStation(14);

        radio.prev();

        int expected = 13;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberStationMinTest() {
        Radio radio = new Radio(12);
        radio.setNumberStation(-1);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setNumberStationMaxTest() {
        Radio radio = new Radio(15);
        radio.setNumberStation(15);

        int expected = 0;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setCurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotVolumeAboveMax() {      // Громкость не должна превышать максимум 100

        Radio radio = new Radio();
        radio.setCurrentVolume(102);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {     //Увелечение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.increaseVolume();

        int expected = 56;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {  // Уменьшение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.reduceVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLimitValues() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextTest() {
        Radio radio = new Radio(10);
        radio.setNumberStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevTest() {
        Radio radio = new Radio();
        radio.setNumberStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

}
