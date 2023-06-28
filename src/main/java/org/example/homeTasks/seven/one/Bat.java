package org.example.homeTasks.seven.one;

public class Bat extends Animal implements Flyable {
    public Bat(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Bat has echolocation calls";
    }

    @Override
    public void feed() {
        System.out.println("Bat drinking blood or eating fruit and insects");
    }

    @Override
    public void fly() {
        System.out.println("Bat flying in the night sky using echolocation");
    }
}

