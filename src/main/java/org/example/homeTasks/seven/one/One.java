package org.example.homeTasks.seven.one;

public class One {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("Echo", 7);
        Peacock peacock = new Peacock("Pete", 4);
        Bat bat = new Bat("Buddy", 2);

        System.out.println("Dolphin "+dolphin.getName() + ": " + dolphin.makeSound());
        System.out.println("Peacock "+peacock.getName() + ": " + peacock.makeSound());
        System.out.println("Bat "+bat.getName() + ": " + bat.makeSound());

        dolphin.feed();
        dolphin.swim();
        peacock.fly();
        peacock.feed();
        bat.feed();
        bat.fly();

    }
}
