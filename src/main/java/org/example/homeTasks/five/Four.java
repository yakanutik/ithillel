package org.example.homeTasks.five;

public class Four {
    public static void main(String[] args) {
        String str1 = "okko";
        String str2 = "google";
        String str3 = "racecar";

        VerifyThatStringIsPalindrome(str1);
        VerifyThatStringIsPalindrome(str2);
        VerifyThatStringIsPalindrome(str3);
    }

    private static void VerifyThatStringIsPalindrome(String str) {
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
