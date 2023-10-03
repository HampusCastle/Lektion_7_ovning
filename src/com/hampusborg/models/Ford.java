package com.hampusborg.models;

public class Ford implements Vehicle {

    @Override
    public void hasWheels() {
        System.out.println("Hej");
    }

    @Override
    public void sound() {
        System.out.println("Idiota");
    }
}
