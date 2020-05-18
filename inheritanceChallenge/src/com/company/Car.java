package com.company;

public class Car extends Vehicle {

    private String brand;
    private String UsagePurpose;
    private int numberOfWheels;
    private int sits;

    public Car(int size, int shape, String brand, String usagePurpose, int numberOfWheels, int sits) {
        super("Car", "metal", 1, size, shape);
        this.brand = brand;
        this.UsagePurpose = usagePurpose;
        this.numberOfWheels = numberOfWheels;
        this.sits = sits;
    }

    public void changingGears() {
        System.out.println("ChangingGears() called.");
    }

    public void handSteering() {
        System.out.println("HandSteering() called.");
    }

    @Override
    public void move(int speed) {
        handSteering();
        changingGears();
        super.move(speed);
        System.out.println("Car move() called.");
    }
}

