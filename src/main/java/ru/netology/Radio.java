package ru.netology;

public class Radio {
    private int currentStation;


    private int quantityStation = 10;
    private final int minStation = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public Radio() {
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > minStation + quantityStation - 1) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNext() {
        if (currentStation < minStation + quantityStation - 1) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void setPrev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = minStation + quantityStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        int maxVolume = 100;
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        int minVolume = 0;
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}
