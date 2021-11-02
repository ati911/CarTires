package com.company;

public class Garage {
    Tires[] tires = new Tires[4];
    static boolean tiresInTheCar = false;

    public Garage() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tires(false, tiresInTheCar);
        }
    }
    public void printTireData() {
        for (int i = 0; i < tires.length; i++) {
            System.out.println("A " + tires[i].getTireType() + " gumi a " + tires[i].getTirePlace() + " van.");
        }
    }
}
