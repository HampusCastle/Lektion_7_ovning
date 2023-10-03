package com.hampusborg.models;

public interface Vehicle {
    void hasWheels();
    void sound();

    default void transport() {
        System.out.println("Transporting");
    }

}
