package com.company;

public class Main {

    public static void main(String[] args) {
        Car autom = new Car();
        Garage garazsom = new Garage();

        autom.printTireData();
        garazsom.printTireData();

        System.out.println("-----Kerékcsere-----");
        changeTires(autom, garazsom);

        autom.printTireData();
        garazsom.printTireData();
    }

    public static void changeTires(Car autom, Garage garazsom) {
        for (int i = 0; i < autom.tires.length; i++) {
            autom.tires[i].changeTirePlace();
        }
        for (int i = 0; i < garazsom.tires.length; i++) {
            garazsom.tires[i].changeTirePlace();
        }
    }
}
