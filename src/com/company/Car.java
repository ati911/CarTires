package com.company;

public class Car {
    Tires[] tires = new Tires[4];
    static boolean tiresInTheCar = true;

    public Car() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tires(true, tiresInTheCar);
        }
    }

    public void printTireData() {
        for (int i = 0; i < tires.length; i++) {
            System.out.println("A " + tires[i].getTireType() + " gumi a " + tires[i].getTirePlace() + " van.");
        }
    }
}
