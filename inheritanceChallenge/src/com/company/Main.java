package com.company;

public class Main {

    public static void main(String[] args) {

Vehicle vehicle = new Vehicle ("car", "metal", 1,500, 1);
Car car = new Car (1, 1, "Ford", "racing", 4, 4);
RaceCar raceCar = new RaceCar ("Carrera", 250, 3, 7, 1, 1);
raceCar.rage();

    }
}
