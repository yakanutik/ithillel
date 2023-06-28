package org.example.homeTasks.seven.one;

public class Dolphin extends Animal implements Swimmable {
    public Dolphin(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Dolphin clicks and whistles";
    }

    @Override
    public void feed() {
        System.out.println("Dolphin feeding on fish and squid");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swimming gracefully through the water");
    }
}
