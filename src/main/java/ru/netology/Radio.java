package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNext() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else currentStation = 0;
    }

    public void setPrev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else currentStation = 9;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 10;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }
}