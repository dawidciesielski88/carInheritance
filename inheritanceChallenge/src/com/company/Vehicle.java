package com.company;

public class Vehicle {

    private String name;
    private String material;
    private int engine;
    private int size;
    private int shape;

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getEngine() {
        return engine;
    }

    public int getSize() {
        return size;
    }

    public int getShape() {
        return shape;
    }

    public Vehicle(String name, String material, int engine, int size, int shape) {
        this.name = name;
        this.material = material;
        this.engine = engine;
        this.size = size;
        this.shape = shape;


        }
        public void move(int speed) {
            System.out.println("Vehicle.move() called. Vehicle is moving with " + speed + "km/h");
    }

}
