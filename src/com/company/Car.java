package com.company;

public class Car {
    Tires[] tires = new Tires[4];
    static boolean tiresInTheCar = true;

    public Car() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tires(true, tiresInTheCar);
        }
    }


}
