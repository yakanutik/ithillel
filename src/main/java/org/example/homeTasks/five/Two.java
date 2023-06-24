package org.example.homeTasks.five;

public class Two {
    public static void main(String[] args) {

        String s3 = "Concatenation";
        System.out.println(getMiddleStr(s3));

    }

    public static String getMiddleStr(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
