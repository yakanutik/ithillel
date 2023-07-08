package org.example.homeTasks.eight;
import java.util.Scanner;
public class ClassA {

    public static class ClassB{

    }

}
class ClassC {
    public static void main(String[] args) {
    ClassA.ClassB classAB=new ClassA.ClassB();
    String str="15";
    switch (2){
        case 1:
            System.out.println(Time.BREAKFEAST.getValue());
            break;
        case 2:
            System.out.println(Time.LUNCH.getValue());
            break;
        case 3:
            System.out.println(Time.DINNER.getValue());
            break;
        default: System.out.println("It's time to work and relax");
    }
     // a-number, b-degree
    System.out.println(Calculat.EXPON.action(2,8));
     //b not equals 0 and a>b
        System.out.println(Calculat.DIVISION.action(8,2));
    }
}
