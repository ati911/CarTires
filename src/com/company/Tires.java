package com.company;

public class Tires {
    private final boolean tireIsWinter;
    private boolean tireInTheCar;

    public Tires(boolean tireIsWinter, boolean tireInTheCar) {
        this.tireIsWinter = tireIsWinter; // Ha igaz, akkor téli gumi, ha hamis akkor nyári
        this.tireInTheCar = tireInTheCar; // Ha igaz, akkor az autón van a gumi, ha hamis akkor a garázsban
    }

    public void changeTirePlace() {
        tireInTheCar = !tireInTheCar; // Felcseréljük a gumi helyét
    }

    public String getTireType() {
        return tireIsWinter ? "téli" : "nyári";
    }

    public String getTirePlace() {
        return tireInTheCar ? "autón" : "garázsban";
    }
}
