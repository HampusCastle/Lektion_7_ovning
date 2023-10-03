// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package com.hampusborg.models;

public class Main {
    public static void main(String[] args) {
    Ford ford = new Ford();
    Ship ship = new Ship();

    ford.hasWheels();
    ford.sound();
    ford.transport();

    ship.hasWheels();
    ship.sound();
    ship.transport();

    Dog dog = new Dog();
    dog.sleep();
    dog.animalSound();




    }
}