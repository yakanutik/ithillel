package org.example.homeTasks.seven.one;

import org.example.homeTasks.seven.one.Animal;
import org.example.homeTasks.seven.one.Flyable;

public class Peacock extends Animal implements Flyable {
    public Peacock(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Peacock has loud and raucous calls";
    }

    @Override
    public void feed() {
        System.out.println("Peacock feeding on seed");
    }

    @Override
    public void fly() {
        System.out.println("Peacock taking to the air with a noisy burst of feathers");
    }
}
