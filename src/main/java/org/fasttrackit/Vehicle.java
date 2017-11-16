package org.fasttrackit;

public class Vehicle {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    private String name;
    private String color;

    public double accelerate(double speed) {

        System.out.println(speed);

        return 10.1;

    }


}

