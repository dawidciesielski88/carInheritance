package com.company;

public class RaceCar extends Car {

    private int topSpeed;
    private int grip;
    private int gears;
    private int spoiler;
    private int superCharge;

    public RaceCar(String brand, int topSpeed, int grip, int gears, int spoiler, int superCharge) {
        super(2, 2, brand, "racing", 4, 2);
        this.topSpeed = topSpeed;
        this.grip = grip;
        this.gears = gears;
        this.spoiler = spoiler;
        this.superCharge = superCharge;
    }

    public void no2Bust () {
        System.out.println("No2Bust() called.");
    }

    public void rage () {
        no2Bust();
        super.move(250);
        System.out.println("Super speed called.");
    }
}
