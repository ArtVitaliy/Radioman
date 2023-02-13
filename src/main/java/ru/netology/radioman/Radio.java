package ru.netology.radioman;

public class Radio {
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int numberStation = minNumberStation;


    public Radio(int counterStation) {
        maxNumberStation = counterStation - 1;
    }

    public Radio() {

    }

    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;


    public int getNumberStation() {

        return numberStation;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void next() {
        if (numberStation < maxNumberStation) {
            numberStation++;
        } else {
            numberStation = minNumberStation;
        }
    }

    public void prev() {
        if (numberStation > minNumberStation) {
            numberStation--;
        } else {
            numberStation = maxNumberStation;
        }
    }


    public void setNumberStation(int numberStation) {
        if (numberStation < minNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation) {
            return;
        }
        this.numberStation = numberStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}

