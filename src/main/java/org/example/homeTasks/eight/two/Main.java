package org.example.homeTasks.eight.two;

public class Main {
    public static void main(String[] args) {
        int time = 5;
        switch (time) {
            case 1:
                System.out.println(Time.BREAKFAST.getValue());
                break;
            case 2:
                System.out.println(Time.LUNCH.getValue());
                break;
            case 3:
                System.out.println(Time.DINNER.getValue());
                break;
            default:
                System.out.println("It's time to work and relax");
        }
    }
}
