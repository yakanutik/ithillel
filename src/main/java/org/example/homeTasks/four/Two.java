package org.example.homeTasks.four;

public class Two {
    // Home task two
    public static int getSum(int a) {
        return a;
    }

    public static long getSum(long a) {
        return a;
    }

    public static int[] getSum(int... a) {
        int[] d = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            d[i] = a[i];
        }
        return d;
    }

    public static int getSum(byte a) {
        return a;
    }

    public static float getSum(float a) {
        return a;
    }

    public static double getSum(double a) {
        return a;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}

