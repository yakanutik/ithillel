package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("(1) - Создать переменные со всеми примитивными типами и инициализировать их значениями в методе Main");
        // create variables:
        byte w;
        short g;
        int j;
        long f;
        char y;
        double d;
        float t;
        boolean z;

        // init variables:
        w = 5;
        g = 135;
        j = 15;
        f = 1345;
        y = 't';
        d = 1.25;
        t = 1.45f;
        z = true;

        System.out.println("(2) - Провести операции над ними, не только с одинаковыми типами, а и с разными (например - short + int) ");
        int l = 100;
        System.out.println("addition with int: " + (l + l));

        double k = 2.0;
        System.out.println("multiplication with double: " + (k * k));

        int m = 100;
        double n = 2.0;
        System.out.println("subtraction with int and double: " + (m - n));

        int u = 50;
        float r = 1.45f;
        System.out.println("division with int and double: " + (u / r));

        System.out.println("(3) - Привести пример явного и неявного кастинга(casting) переменных");
        // Implicit casting byte to int:
        byte b = 100;
        int x = b;
        System.out.println("Implicit casting byte to int: " + x);

        //Explicit casting int to byte
        int p = 100;
        byte o = (byte) p;
        System.out.println("Explicit casting int to byte: " + o);

        System.out.println("4 Необязательное задание со ** - Повторить задание 2, но выполнить его в отдельных методах и запустить эти методы в методе Main");
        additionWithInt();
        multiplicationWithDouble();
        subtractionWithIntAndDouble();
        divisionWithIntAndDouble();
    }

    private static void divisionWithIntAndDouble() {
        int u = 50;
        float r = 1.45f;
        System.out.println("task4 - division with int and double: " + (u / r));
    }

    private static void subtractionWithIntAndDouble() {
        int m = 100;
        double n = 2.0;
        System.out.println("task4 - subtraction with int and double: " + (m - n));
    }

    private static void multiplicationWithDouble() {
        double k = 2.0;
        System.out.println("task4 - multiplication with double: " + (k * k));
    }

    private static void additionWithInt() {
        int l = 100;
        System.out.println("task4 - addition with int: " + (l + l));
    }
}