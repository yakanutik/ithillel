package org.example.homeTasks.twelve;

import java.util.ArrayList;
import java.util.HashSet;

public class One {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<>();
        list = addDogsToList(list);

        HashSet<Animal> set = new HashSet<>();
        set = addAnimalsToSet(set);

        acceptCollection(list);
        acceptCollection(set);
    }

    public static ArrayList<Dog> addDogsToList(ArrayList<Dog> list) {
        list.add(new Dog("Lucky", "Labrador"));
        list.add(new Dog("Buddy", "Beagle"));
        list.add(new Dog("Max", "Bulldog"));
        list.add(new Dog("Rocky", "Retriever"));
        list.add(new Dog("Duke", "Dachshund"));
        return list;
    }


    public static HashSet<Animal> addAnimalsToSet(HashSet<Animal> set) {
        set.add(new Animal("Lion"));
        set.add(new Animal("Tiger"));
        set.add(new Animal("Cheetah"));
        set.add(new Animal("Elephant"));
        set.add(new Animal("Giraffe"));
        return set;
    }

    public static <T> void acceptCollection(T collection) {
        System.out.println("Collection type accepted: " + collection.getClass());
    }
}
