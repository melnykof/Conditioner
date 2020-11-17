package ru.netology.domain;

public class Conditioner {

    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature < maxTemperature) {
            currentTemperature = currentTemperature + 1;
        }
        if (currentTemperature > maxTemperature) {
            currentTemperature = currentTemperature - 1;

        }

        this.currentTemperature = currentTemperature;
    }

}
