package com.hampusborg.models;

public class Ship implements Vehicle {

    @Override
    public void hasWheels() {
        System.out.println("LOL");
    }

    @Override
    public void sound() {
        System.out.println("LEL");
    }

}
